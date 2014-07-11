package com.app.safari;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;

import java.util.Vector;
import java.util.Properties;

import java.awt.Dimension;


public class TelnetWrapper extends TelnetProtocolHandler {
    
    /** debugging level */
    private int debug = 0;
    
    protected ScriptHandler scriptHandler = new ScriptHandler();
    private Thread reader;
    
    protected InputStream in;
    protected OutputStream out;
    protected Socket socket;
    protected String host;
    protected int port = 23;
    protected Vector script = new Vector();
    
    
    private String executeResult = "";
    
    /** Connect the socket and open the connection. */
    public void connect(String host, int port) throws IOException {
        if(debug>0) System.err.println("TelnetWrapper: connect("+host+","+port+")");
        try {
            socket = new java.net.Socket(host, port);
            in = socket.getInputStream();
            out = socket.getOutputStream();
            reset();
        } catch(Exception e) {
            System.err.println("TelnetWrapper: "+e);
            disconnect();
            throw ((IOException)e);
        }
    }
    
    public void connect(InputStream in, OutputStream out) throws IOException {
        if(debug>0) System.err.println("TelnetWrapper: connect("+host+","+port+")");
        try {
            //socket = new java.net.Socket(host, port);
            in = socket.getInputStream();
            out = socket.getOutputStream();
            //reset();
        } catch(Exception e) {
            System.err.println("TelnetWrapper: "+e);
            disconnect();
            throw ((IOException)e);
        }
    }
    
    /** Disconnect the socket and close the connection. */
    public void disconnect() throws IOException {
        if(debug>0) System.err.println("TelnetWrapper: disconnect()");
        if (socket != null)
            socket.close();
    }
    
    /** sent on IAC EOR (prompt terminator for remote access systems). */
    public void notifyEndOfRecord() {
    }
    
    /**
     * Login into remote host. This is a convenience method and only
     * works if the prompts are "login:" and "Password:".
     * @param user the user name
     * @param pwd the password
     */
    public void login(String user, String pwd) throws IOException {
        waitfor("Username: ");		// throw output away
        send(user);
        waitfor("Password: ");	// throw output away
        send(pwd);
    }
    
    /**
     * Set the prompt for the send() method.
     */
    private String prompt = null;
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    public String getPrompt() {
        return prompt;
    }
    
    /*public void waitForPrompt() throws IOException {
        this.waitfor(prompt);
    }*/
    
    public String waitForPrompt() throws IOException {
        return this.waitfor(prompt);
    }
    
    public boolean waitForPromptOrLoginError() throws IOException {
        String[] matches = new String[2];
        
        matches[1] = prompt;
        matches[0] = "Password incorrect";
        return !waitfor(matches).equals("Password incorrect");
    }
    
    /**
     * Send a command to the remote host. A newline is appended and if
     * a prompt is set it will return the resulting data until the prompt
     * is encountered.
     * @param cmd the command
     * @return output of the command or null if no prompt is set
     */
    public String send(String cmd) throws IOException {
        write((cmd+"\r\n").getBytes());
//    if(prompt != null)
//      return waitfor(prompt);
        return null;
    }
    
    
    public String execute(String cmd) throws IOException {
        executeResult = "";
        send(cmd);
        waitForPrompt();
        return executeResult;
    }
    /**
     * Wait for a string to come from the remote host and return all
     * that characters that are received until that happens (including
     * the string being waited for).
     *
     * @param match the string to look for
     * @return skipped characters
     */
    
    public String waitfor( String[] searchElements ) throws IOException {
        ScriptHandler[] handlers = new ScriptHandler[searchElements.length];
        for ( int i = 0; i < searchElements.length; i++ ) {
            // initialize the handlers
            handlers[i] = new ScriptHandler();
            handlers[i].setup( searchElements[i] );
        }
        
        byte[] b = new byte[256];
        int n = 0;
        StringBuffer ret = new StringBuffer();
        String current;
        //MODIFICADO PARA QUE LO RETORNE LA EJECUCION ACTUAL
        String resultado = "";
        while(n >= 0) {
            n = read(b);
            if(n > 0) {
                current = new String( b, 0, n );
                //MODIFICADO PARA QUE NO IMPRIMA NADA
                //System.out.println(current);
                
                //MODIFICADO PARA QUE LO RETORNE LA EJECUCION ACTUAL
                //executeResult += current;
                resultado += current;
                
                ret.append( current );
                for ( int i = 0; i < handlers.length ; i++ ) {
                    if ( handlers[i].match( b, n ) ) {
//	    return ret.toString();
                        //MODIFICADO PARA QUE SOLO RETORNE
                        //System.out.println("MATCH FOUND: " + handlers[i].getString());
                        //return handlers[i].getString();
                        //MODIFICADO PARA QUE LO RETORNE LA EJECUCION ACTUAL
                        //return executeResult;
                        return resultado;
                        
                        
                    } // if
                } // for
            } // if
        } // while
        return null; // should never happen
    }
    
    public String waitfor(String match) throws IOException {
        String[] matches = new String[1];
        
        matches[0] = match;
        return waitfor(matches);
    }
    
    /**
     * Read data from the socket and use telnet negotiation before returning
     * the data read.
     * @param b the input buffer to read in
     * @return the amount of bytes read
     */
    public int read(byte[] b) throws IOException {
        int n = negotiate(b);
        
        if (n>0)
            return n;
        
        while (n<=0) {
            do {
                n = negotiate(b);
                if (n>0)
                    return n;
            } while (n==0);
            n = in.read(b);
            if (n<0)
                return n;
            inputfeed(b,n);
            n = negotiate(b);
        }
        return n;
    }
    
    /**
     * Write data to the socket.
     * @param b the buffer to be written
     */
    public void write(byte[] b) throws IOException {
        out.write(b);
    }
    
    public String getTerminalType() {
        return "dumb";
    }
    
    public Dimension getWindowSize() {
        return new Dimension(80,24);
    }
    
    public void setLocalEcho(boolean echo) {
        debug = echo ? 1 : 0;
        if(debug > 0)
            System.err.println("local echo "+(echo ? "on" : "off"));
    }
}
