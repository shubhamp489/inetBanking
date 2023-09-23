package com.inetbanking.utilities;
import java.util.Properties;
import java.io.*;
public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		
				}
		catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
		
	}
	
	
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getApplicationURL2() {
		String url = pro.getProperty("baseURL2");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}
	

	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}


	public String getfirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	
	
	
	
}
