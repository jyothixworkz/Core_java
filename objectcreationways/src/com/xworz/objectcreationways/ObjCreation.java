package com.xworz.objectcreationways;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ObjCreation implements Cloneable, Serializable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws Throwable, IllegalAccessException {
		// new key
		ObjCreation objCreation = new ObjCreation();
		// using newinstance class
		ObjCreation newInstance = ObjCreation.class.newInstance();
		// using constructor class new instance method
		Constructor<ObjCreation> constructor = ObjCreation.class.getConstructor();
		ObjCreation newInstance2 = constructor.newInstance();
		// using clone
		ObjCreation objCreation2 = new ObjCreation();
		Object clone = objCreation2.clone();
		ObjCreation creation = (ObjCreation) clone;
		// serialization
		String name = "manoj.ser";
		FileOutputStream fileOutputStream = new FileOutputStream(name);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(objCreation);
		fileOutputStream.close();
		objectOutputStream.close();
		// de serialization
		FileInputStream fileInputStream = new FileInputStream(name);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Object readObject = objectInputStream.readObject();
		ObjCreation creation2 = (ObjCreation) readObject;

	}

}
