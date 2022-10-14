package com.xworkz.propertyclass.creation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
	
	
	public static void main(String[] args) throws IOException {
		 Properties properties = new Properties();
		 FileInputStream fileInputStream = new FileInputStream("basu.properties");
		 System.out.println(properties);
		 properties.load(fileInputStream);
		 System.out.println(properties);
		 
		Object object = properties.get("name");
		System.out.println(object);
		Object setProperty = properties.setProperty("name", "bang");
		System.out.println(setProperty);
		FileOutputStream stream = new FileOutputStream("basu.properties");
		properties.store(stream, "update by manoj");
		System.out.println(properties);
		
		
	}
	
}
