package com.xworkz.films.serviceimpl;

import com.xworkz.films.dao.FilmDAO;
import com.xworkz.films.service.FilmService;

public class FilmServiceImpl implements FilmService {
	private FilmDAO filmDAO;

	public FilmServiceImpl(FilmDAO filmDAO) {
		this.filmDAO = filmDAO;
	}

	@Override
	public boolean checkAndSave(String name) {

		if (name != null && name.length() < 10 && name.length() > 2 && !filmDAO.checkName(name)) {

			this.filmDAO.save(name);

			return true;
		}
		System.out.println("name is not greater then 2 words");
		return false;
	}

}
