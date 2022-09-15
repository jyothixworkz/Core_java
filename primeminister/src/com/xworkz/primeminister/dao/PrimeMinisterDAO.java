package com.xworkz.primeminister.dao;

import com.xworkz.primeminister.exception.PrimeMinisterArrayIndexException;
import com.xworkz.primeminister.exception.PrimeMinisterCheckedException;

public interface PrimeMinisterDAO {

	boolean save(String name)throws PrimeMinisterCheckedException;

	boolean dublicate(String name);

}
