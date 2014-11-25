package com.app.intraway.consulta.ids;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import com.app.safari.consulta.LineaSip;

public class UploadFile extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String path = "/tmp/titan";

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//out.println("<html>");
		//out.println("<head>");
		//out.println("<title>Servlet</title>");
		//out.println("</head>");
		//out.println("<body>");

		File tmpTitan = new File(path);
		if(!tmpTitan.isDirectory())
			tmpTitan.mkdir();
		
		System.out.println("Comenzamos procesamiento ficheros");

		File f = procesaFicheros(request); 
		String filename = f.getName();
		
		int length = 0;
		ServletOutputStream op = response.getOutputStream();
		ServletContext context = getServletConfig().getServletContext();
		String mimetype = context.getMimeType( filename );
		response.setContentType( (mimetype != null) ? mimetype : "application/octet-stream" );
		response.setContentLength( (int)f.length() );
		response.setHeader( "Content-Disposition", "attachment; filename=\"" + filename + "\"" );
		//
		// Stream to the requester.
		//
		byte[] bbuf = new byte[filename.length()];
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		
		while ((in != null) && ((length = in.read(bbuf)) != -1))
			op.write(bbuf,0,length);
		
		 
		in.close();
		op.flush();
		op.close();
		 
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/ids.jsp");
		rd.forward(request, response);
		
		
		//response.sendRedirect("ids.jsp");
		
		
		//out.println("");
		
		//out.println("</body>");
		//out.println("</html>");

		//out.close();
	}


	void depura(String cadena){
		System.out.println("El error es " + cadena);
	}

	@SuppressWarnings("deprecation")
	public File procesaFicheros(HttpServletRequest req) {
		try {
			// construimos el objeto que es capaz de parsear la perición
			DiskFileUpload fu = new DiskFileUpload();
			
			// maximo numero de bytes
			fu.setSizeMax(5120*512); // 512 K

			// tamaño por encima del cual los ficheros son escritos directamente en disco
			fu.setSizeThreshold(4096);

			// directorio en el que se escribirán los ficheros con tamaño superior al soportado en memoria
			fu.setRepositoryPath(path);

			// ordenamos procesar los ficheros
			List fileItems = fu.parseRequest(req);

			
			if(fileItems == null){
				depura("La lista es nula");
				//return "Favor seleccione un archivo";
			}

			//out.print("<br>El número de ficheros subidos es: " +  (fileItems.size()-1));

			// Iteramos por cada fichero
			//Iterator i = fileItems.iterator();
			FileItem actual = null;
			
			String pagina;
			
			//while (i.hasNext())	{
				
				actual = (FileItem)fileItems.get(0);//i.next();
				String fileName = actual.getName();
				
				// construimos un objeto file para recuperar el trayecto completo
				File fichero = new File(fileName);
				// nos quedamos solo con el nombre y descartamos el path
				String[] resul = fichero.getName().toString().split("\\.");
				String name = resul[0].trim();
				String ext = resul[1].trim();
				
				String newName = name+"_"+new GregorianCalendar().getInstance().getTime()+"."+ext;
				fichero = new  File(path + newName );

				// escribimos el fichero en el nuevo path
				actual.write(fichero);
					
				pagina = ((FileItem)fileItems.get(1)).getString();
				
				System.out.println("Pagina de donde viene "+pagina);
				
				if(pagina.equals("intraway"))
					return new CableModem(req.getSession().getAttribute("usuario").toString(), 
						req.getRemoteHost(), req.getRemoteAddr()).Regularizacion(fichero);
				else if(pagina.equals("safari"))
					return new LineaSip(req.getSession().getAttribute("usuario").toString(), 
						req.getRemoteHost(), req.getRemoteAddr()).Regularizacion(fichero);
				
			//}
	
		}
		catch(Exception e) {
			e.printStackTrace();
			depura("Error de Aplicación " + e.getMessage());
			//return e.getMessage();
		}

		return null;
	}

	/** Handles the HTTP <code>POST</code> method.
	 * @param request servlet request
	 * @param response servlet response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		processRequest(request, response);
	}


}
