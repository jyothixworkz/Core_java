package com.xworkz.films.daoimpl;

import com.xworkz.films.dao.FilmDAO;

public class FilmDAOImpl implements FilmDAO {
	private String[] films = new String[5];
	private int index = 0;

	@Override
	public boolean save(String name) {
		this.films[this.index] = name;
		System.out.println("name is saved" + films[0]);
		this.index++;
		return true;

	}

	@Override
	public boolean checkName(String name) {
		for (String string : films) {
			if (string != null && string.equals(name)) {
				System.out.println("name already present");

				return true;
			} else
				System.out.println("name is not present");
			return false;

		}
		return false;
	}

}
