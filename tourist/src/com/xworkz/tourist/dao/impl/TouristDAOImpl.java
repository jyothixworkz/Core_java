package com.xworkz.tourist.dao.impl;

import com.xworkz.tourist.custamizedexception.PlaceIsInvalid;
import com.xworkz.tourist.dao.TouristDAO;

public class TouristDAOImpl implements TouristDAO {
	String[] touristPlace = new String[5];
	int position;

	@Override
	public boolean save(String touristPlace)throws PlaceIsInvalid {
		this.touristPlace[position] = touristPlace;
		System.out.println("place is saved;" + touristPlace);
		position++;

		return false;
	}

	@Override
	public boolean checkDuplicate(String touristPlace) {
		for (String ref : this.touristPlace) {
			if (ref != null && ref.equals(touristPlace)) {
				System.out.println("place is present;" + touristPlace);
				return true;
			}

		}

		System.out.println("place is not present;" + touristPlace);
		return false;
	}

}
