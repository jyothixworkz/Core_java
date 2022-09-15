package com.xworkz.phonenumber.service;

import com.xworkz.phoneNumberException.InvalidPhoneNumberException;

public interface PhoneNumberService {
	boolean validateAndSave(Long number) throws InvalidPhoneNumberException;

}
