package com.xworkz.primeminister;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.primeminister.daoimpl.PrimeMinisterDAOImpl;
import com.xworkz.primeminister.exception.PrimeMinisterCheckedException;
import com.xworkz.primeminister.service.PrimeMinisterService;
import com.xworkz.primeminister.service.impl.PrimeMinisterServiceImpl;

public class PrimeMinisterRunner {
	public static void main(String[] args) {
		PrimeMinisterDAO impl = new PrimeMinisterDAOImpl();
		PrimeMinisterService impl2 = new PrimeMinisterServiceImpl(impl);
		try {
			impl2.validAndSve("manoj");
			impl2.validAndSve("jayanth");
			impl2.validAndSve("jayaram");
			impl2.validAndSve("darshan");
			impl2.validAndSve("malthesh");
			impl2.validAndSve("nandish");
		} catch (PrimeMinisterCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getStackTrace()[0].getLineNumber());
		}
		
	}

}
