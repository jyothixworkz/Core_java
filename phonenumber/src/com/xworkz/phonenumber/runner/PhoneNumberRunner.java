package com.xworkz.phonenumber.runner;

import com.xworkz.phoneNumberException.InvalidPhoneNumberException;
import com.xworkz.phonenumber.dao.PhoneNumberDAO;
import com.xworkz.phonenumber.dao.impl.PhoneNumberDAOImpl;
import com.xworkz.phonenumber.service.PhoneNumberService;

import ncom.xworkz.phonenumber.service.impl.PhoneNumberServiceImpl;

public class PhoneNumberRunner {

	public static void main(String[] args) {
		PhoneNumberDAO impl = new PhoneNumberDAOImpl();
		PhoneNumberService impl2 = new PhoneNumberServiceImpl(impl);
		try {
			impl2.validateAndSave(7204250720l);
		} catch (InvalidPhoneNumberException e) {

			e.printStackTrace();
			System.out.println(e.getStackTrace()[0].getLineNumber());
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}

	}

}
