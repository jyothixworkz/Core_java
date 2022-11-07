package com.xworz.objectcreationways;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ways1 implements Cloneable, Serializable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException,
			IOException, ClassNotFoundException {
		// using new keyword
		Ways1 ways1 = new Ways1();
		// using new instance method
		Ways1 newInstance = Ways1.class.newInstance();
		// using constructor class
		Constructor<Ways1> constructor = Ways1.class.getConstructor();
		Ways1 newInstance2 = constructor.newInstance();
		// using clone
		Ways1 ways12 = new Ways1();
		Object clone = ways12.clone();
		Ways1 ways13 = (Ways1) clone;

		// serializable
		FileOutputStream stream = new FileOutputStream("manoj.ser");
		ObjectOutputStream stream2 = new ObjectOutputStream(stream);
		stream2.writeObject(ways12);
		stream.close();
		stream2.close();
		// deserialization
		FileInputStream stream3 = new FileInputStream("manoj.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(stream3);
		Object readObject = objectInputStream.readObject();
		Ways1 ways14 = (Ways1) readObject;
		stream3.close();
		objectInputStream.close();

	}

}
