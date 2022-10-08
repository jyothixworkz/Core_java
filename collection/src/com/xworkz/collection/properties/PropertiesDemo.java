package com.xworkz.collection.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream stream = new FileInputStream("manoj.properties");
	properties.load(stream);
	System.out.println(properties);
	String property = properties.getProperty("passward");
	System.out.println(property);
 properties.setProperty("user", "jayanth");
 FileOutputStream stream2 = new FileOutputStream("manoj.properties");
 //System.out.println(properties);
	
	}

}
