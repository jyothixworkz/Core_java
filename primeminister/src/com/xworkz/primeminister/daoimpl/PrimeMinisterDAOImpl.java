package com.xworkz.primeminister.daoimpl;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.primeminister.exception.PrimeMinisterArrayIndexException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {
	private String[] name = new String[5];
	private int index;

	// @Override
	public boolean save(String name)  {
		if(name.length()<this.index) {
			throw  new PrimeMinisterArrayIndexException(" in array  there no space");
		}
		this.name[index] = name;
		System.out.println("name is stored in string array"+ name);
		

		return false;
	}

	// @Override
	public boolean dublicate(String name) {
		for (String string : this.name) {
			if(name.equals(name)) {
				System.out.println(" name is duplicate"+name);
			}
			else {
				System.out.println("name is not duplicate"+name);
				
			}
		}
		return false;
	}

}
