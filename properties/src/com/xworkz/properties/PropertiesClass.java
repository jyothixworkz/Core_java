package com.xworkz.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream stream = new FileInputStream("jayaram.properties");
	properties.load(stream);
	String property = properties.getProperty("name");
	System.out.println(property);
	properties.setProperty("son", "jayanth");
	System.out.println(properties);
	FileOutputStream stream2 = new FileOutputStream("jayaram.properties");
	properties.store(stream2, "manoj is update this file");
	System.out.println(properties);
		
	}

	
}
