package com.app.safari;

/* <!-- in case someone opens this in a browser... --> <pre> */

/**
  * a very simple example of using the JakartaFtpWrapper class,
  * available at http://www.nsftools.com/tips/JavaFtp.htm
  */

public class JakartaWrapperTest {
	public static void main (String[] args) {
		try {
			JakartaFtpWrapper ftp = new JakartaFtpWrapper();
			String serverName = "mirrors.kernel.org";
			if (ftp.connectAndLogin(serverName, "Anonymous", "me@whatever.com")) {
				System.out.println("Connected to " + serverName);
				try {
					System.out.println("Welcome message:\n" + ftp.getReplyString());
					System.out.println("Current Directory: " + ftp.printWorkingDirectory());
					ftp.setPassiveMode(true);
					System.out.println("Files in this directory:\n" + ftp.listFileNamesString());
					System.out.println("Subdirectories in this directory:\n" + ftp.listSubdirNamesString());
					System.out.println("Downloading file robots.txt");
					ftp.ascii();
					ftp.downloadFile("robots.txt", "C:\\robots.txt");
				} catch (Exception ftpe) {
					ftpe.printStackTrace();
				} finally {
					ftp.logout();
					ftp.disconnect();
				}
			} else {
				System.out.println("Unable to connect to" + serverName);
			}
			System.out.println("Finished");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

