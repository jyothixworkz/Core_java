package com.xworkz.primeminister.service.impl;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.primeminister.exception.PrimeMinisterCheckedException;
import com.xworkz.primeminister.service.PrimeMinisterService;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	private PrimeMinisterDAO dao;

	public PrimeMinisterServiceImpl(PrimeMinisterDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validAndSve(String name) throws PrimeMinisterCheckedException {
		if (name != null && name.length() < 50 && name.length() > 4) {
			if (dao.dublicate(name)) {
				System.err.println("number is allready present");
				throw new PrimeMinisterCheckedException("name is duplicate ");
			} else {
				System.out.println(" u can save the number to dao ;" + name);
				dao.save(name);
			}
		}
		return false;
	}

}
