package com.xworkz.abstractdemo;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.net.*;

public class Amiti {

//	In the Java file, write a program to perform a GET request on the route
	// https://coderbyte.com/api/challenges/json/age-
	// counting which contains a data key and the value is a string which
	// contains items in the format: key=STRING, age=INTEGER. Your goal is to count
	// how many items exist that have an age equal to or greater than 50, and print
	// this final value.
//
//		Example Input
//		{"data":"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47"}
//
//		Example Output
//		2
//	

	  public static String getStringFromStream(final InputStream inputStream) {
	        String result = null;
	        BufferedReader streamReader = null;
	        try {
	            streamReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
	            result = streamReader.lines().collect(Collectors.joining("\n"));
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	            return null;
	        } finally {
	            try {
	                if(streamReader != null) 
	                    streamReader.close();
	                if(inputStream != null)
	                    inputStream.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        return result;
	    }

	    public static String simpleParseArrayProperty(String json, final String propertyName) {
	        if(json == null)
	            return null;
	        int lastIndex = json.lastIndexOf(String.format("\"%s\"", propertyName));
	        System.out.println(lastIndex);
	        json = json.substring(lastIndex);
	        lastIndex = json.lastIndexOf("[");
	        json = json.substring(lastIndex+1);
	        return json = json
	                .replaceAll("[\\]}\"]", "")
	                .replaceAll("\\,", ", ")
	                .trim();
	    }

	    public static void main(String[] args) {
	        System.setProperty("http.agent", "Chrome");
	        try {
	            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
	            try {
	                URLConnection connection = url.openConnection();
	                InputStream inputStream = connection.getInputStream();
	                System.out.println(simpleParseArrayProperty(getStringFromStream(inputStream), "hobbies"));
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	    }
	    }
