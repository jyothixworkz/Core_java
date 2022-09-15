package com.xworkz.casino.dao.service.impl;

import com.xworkz.casino.dao.CasinoDAO;
import com.xworkz.casino.dao.service.CasinoService;

public class CasinoSarviceImpl implements CasinoService {
	private CasinoDAO casinoDAO;

	public CasinoSarviceImpl(CasinoDAO name) {

		this.casinoDAO = name;

	}

	@Override
	public boolean validAndSave(String name) {
		if (name != null && name.length() < 10 && name.length() > 2&& !casinoDAO.checkName(name)) {
			System.out.println("this is valid ");
			this.casinoDAO.save(name);
			return true;

		}
		System.out.println("invalid");

		return false;
	}



}
