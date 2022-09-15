package com.xworkz.casino;

import com.xworkz.casino.dao.CasinoDAO;
import com.xworkz.casino.dao.impl.CasinoDAOImpl;
import com.xworkz.casino.dao.service.CasinoService;
import com.xworkz.casino.dao.service.impl.CasinoSarviceImpl;

public class CasinoRunner {
	public static void main(String[] args) {
		CasinoDAO casinoDAO= new CasinoDAOImpl();
		CasinoService casinoService= new CasinoSarviceImpl(casinoDAO);
		
		
		casinoService.validAndSave("manoj");
		casinoService.validAndSave("4manoj");
		
		
	}

}
