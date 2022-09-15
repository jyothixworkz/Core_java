package com.xworkz.tourist.service;

import com.xworkz.tourist.custamizedexception.PlaceIsInvalid;

public interface TouristService {
	boolean validateTourist(String touristPlace) throws PlaceIsInvalid ;

}
