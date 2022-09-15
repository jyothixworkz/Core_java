package com.xworkz.tourist.dao;

import com.xworkz.tourist.custamizedexception.PlaceIsInvalid;

public interface TouristDAO {

	boolean save(String touristPlace)throws PlaceIsInvalid;
	boolean checkDuplicate(String touristPlace);

}
