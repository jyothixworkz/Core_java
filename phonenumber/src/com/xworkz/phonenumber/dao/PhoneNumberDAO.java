package com.xworkz.phonenumber.dao;

import com.xworkz.phoneNumberException.InvalidPhoneNumberException;

public interface PhoneNumberDAO {

	boolean save(long number) throws InvalidPhoneNumberException;
	boolean duplicate(long number);

}
