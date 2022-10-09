package com.xworkz.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProprtiesFileReader {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream stream = new FileInputStream("manoj.manoj");
		properties.load(stream);
		System.out.println(properties);
		properties.setProperty("name", "barath");
		FileOutputStream stream2 = new FileOutputStream("manoj.manoj");
		properties.store(stream2, "manoj updated");
		
	}

}
