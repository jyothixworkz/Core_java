package com.xworkz.films;

import com.xworkz.films.dao.FilmDAO;
import com.xworkz.films.daoimpl.FilmDAOImpl;
import com.xworkz.films.service.FilmService;
import com.xworkz.films.serviceimpl.FilmServiceImpl;

public class FilmRunner {
	public static void main(String[] args) {
		FilmDAO dao=new FilmDAOImpl();
		FilmService filmService=new FilmServiceImpl(dao);
		filmService.checkAndSave("manoj");
		filmService.checkAndSave("manoj");
	//	filmService.checkAndSave("n");
	}

	
}
