package poropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadCofigFile {
	
	Properties properties;
	String path = "C:\\Users\\Vish Sah\\eclipse-workspace\\Selenium\\src\\poropertiesFile\\config.properties";
	
	public ReadCofigFile() throws IOException
	{
		properties= new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	}
	
	
	public String getURL()
	{
		String url = properties.getProperty("url");
		
		if(url!=null)
		return url;
		else
			throw new RuntimeException("Not valid url in config file");
	}
	
	public String getUsername()
	{
		String username = properties.getProperty("username");
		
		if(username!=null)
		return username;
		else
			throw new RuntimeException("Not valid username in config file");
	}
	
	public String getPassword()
	{
		String password = properties.getProperty("password");
		
		if(password!=null)
		return password;
		else
			throw new RuntimeException("Not valid password in config file");
	}

}
