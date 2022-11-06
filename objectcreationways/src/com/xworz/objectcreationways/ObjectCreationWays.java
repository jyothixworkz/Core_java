package com.xworz.objectcreationways;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationWays implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException,
			IOException, ClassNotFoundException {

		// there are 5 ways to create object

		// using new keyword
		ObjectCreationWays ways = new ObjectCreationWays();
		// newinstance method
		ObjectCreationWays creationWays = ObjectCreationWays.class.newInstance();
		// using Constructor newinstance method
		// Constructor<ObjectCreationWays> obj
		// =ObjectCreationWays.class.getConstructor();
		// ObjectCreationWays newInstance = obj.newInstance();
		Constructor<ObjectCreationWays> constructors = ObjectCreationWays.class.getConstructor();
		ObjectCreationWays newInstance = constructors.newInstance();

		// clone method
		ObjectCreationWays objectCreationWays = new ObjectCreationWays();
		ObjectCreationWays clone = (ObjectCreationWays) objectCreationWays.clone();

		// serialization
		ObjectCreationWays objectCreationWays2 = new ObjectCreationWays();

		String name = " manoj.ser";
		FileOutputStream fileOutputStream = new FileOutputStream(name);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(objectCreationWays2);
		fileOutputStream.close();
		objectOutputStream.close();
		InputStream fileOutputStream2 = new FileInputStream(name);
		ObjectInputStream objectOutputStream2 = new ObjectInputStream(fileOutputStream2);
		ObjectCreationWays obj = (ObjectCreationWays) objectOutputStream2.readObject();
		// foctory method;

	}

}
