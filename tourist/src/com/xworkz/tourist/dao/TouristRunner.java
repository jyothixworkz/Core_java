package com.xworkz.tourist.dao;

import com.xworkz.tourist.custamizedexception.PlaceIsInvalid;
import com.xworkz.tourist.dao.impl.TouristDAOImpl;
import com.xworkz.tourist.service.impl.TouristServiceImpl;

public class TouristRunner {
	public static void main(String[] args) {
		TouristDAOImpl touristDAOImpl = new TouristDAOImpl();
		TouristServiceImpl touristServiceImpl = new TouristServiceImpl(touristDAOImpl);
		try {
			touristServiceImpl.validateTourist("maddur");
			touristServiceImpl.validateTourist("maddur");
			touristServiceImpl.validateTourist("mandya");
			touristServiceImpl.validateTourist("srirangapatna");
			touristServiceImpl.validateTourist("chanpatna");
			touristServiceImpl.validateTourist("sathnur");
			

		} catch (PlaceIsInvalid e) {

			System.err.println(e.getMessage());
			System.err.println(e.getStackTrace());

		}

	}

}
