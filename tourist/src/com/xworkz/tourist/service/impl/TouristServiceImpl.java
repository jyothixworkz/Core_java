package com.xworkz.tourist.service.impl;

import com.xworkz.tourist.custamizedexception.PlaceIsInvalid;
import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.service.TouristService;

public class TouristServiceImpl implements TouristService {
	private TouristDAO dao;

	public TouristServiceImpl(TouristDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateTourist(String touristPlace) throws PlaceIsInvalid {
		if (touristPlace != null && touristPlace.length() < 10 && touristPlace.length() > 2) {
			if (dao.checkDuplicate(touristPlace)) {
				System.out.println("place allready present;" + touristPlace);

				return true;
			} else {
				System.out.println("name is not present we can save the data to the dao;" + touristPlace);

				dao.save(touristPlace);
				throw new PlaceIsInvalid("place is invalid");

				//return true;

			}
		}

		return false;
	}

}
