package com.xworkz.primeminister.service;

import com.xworkz.primeminister.exception.PrimeMinisterCheckedException;

public interface PrimeMinisterService {
	 boolean validAndSve(String name) throws PrimeMinisterCheckedException;

}
