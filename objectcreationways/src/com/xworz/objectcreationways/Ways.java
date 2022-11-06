package com.xworz.objectcreationways;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Ways implements Cloneable, Serializable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws Throwable, IllegalAccessException {
		// 1 way new keyword
		Ways ways = new Ways();
		// 2 ways is newInstance method
		Ways newInstance = Ways.class.newInstance();
		// 3 ways using constructor class new instance method
		Constructor<Ways> constructor = Ways.class.getConstructor();
		Ways newInstance2 = constructor.newInstance();
		// 4 using clone method
		// converting dublicate
		// 2 types deep and shallow
		Ways ways2 = new Ways();
		Object clone = ways2.clone();
		Ways ways3 = (Ways) clone;
		// 5 using serialization
		String name = "manoj.ser";
		FileOutputStream fileOutputStream = new FileOutputStream(name);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(ways);
		fileOutputStream.close();
		objectOutputStream.close();
		Ways ways4 = null;
		FileInputStream fileInputStream = new FileInputStream(name);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ways4 = (Ways) objectInputStream.readObject();
		fileInputStream.close();
		objectInputStream.close();

	}

}
