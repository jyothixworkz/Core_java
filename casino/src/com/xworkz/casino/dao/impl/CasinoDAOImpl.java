package com.xworkz.casino.dao.impl;

import java.util.Arrays;

import com.xworkz.casino.dao.CasinoDAO;

public class CasinoDAOImpl implements CasinoDAO {
	String[] value = new String[5];
	private int index = 0;

	@Override
	public boolean save(String name) {
		System.out.println("save method calling" + this.index + "saved" + Arrays.toString(this.value));
		this.value[this.index] = name;
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : this.value) {
			if (ref!= null&&ref.equals(name)) {
				System.out.println("name already present");
				return true;

			}
			else
			System.out.println("name is not present");

		}

		return false;
	}
}
