package com.xworkz.propertyclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyOfMyFamily {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream stream = new FileInputStream("m.m");
		properties.load(stream);
		System.out.println(properties);
		properties.setProperty("name", "manojgowda");
		System.out.println(properties);
	//	properties.getProperty("name", null)
		String property = properties.getProperty("name");
		System.out.println(property);
		Enumeration<?> propertyNames = properties.propertyNames();
		System.out.println(propertyNames);
		FileOutputStream stream2 = new FileOutputStream("m.m");
		properties.store(stream2, "update by manoj simha");
		
	}

} 
