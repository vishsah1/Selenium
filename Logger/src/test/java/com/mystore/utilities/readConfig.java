package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class readConfig {

	Properties properties;

	//path of propFile
	String prop  = "C:\\Users\\Vish Sah\\eclipse-workspace\\Logger\\configuration\\config.properties";

	public readConfig()
	{
		try {
			properties = new Properties();

			FileInputStream  fis = new FileInputStream(prop);
			properties.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getbaseUrl()
	{
		String value = properties.getProperty("baseUrl");

		if(value!=null)
			return value;
		else
			throw new RuntimeErrorException(null,"not valid url");
	}

	public String getBrowser()
	{
		String value = properties.getProperty("browser");

		if(value!=null)
			return value;
		else
			throw new RuntimeErrorException(null,"not valid browser");
	}

}
