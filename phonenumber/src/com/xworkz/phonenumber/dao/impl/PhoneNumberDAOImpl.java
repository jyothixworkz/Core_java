package com.xworkz.phonenumber.dao.impl;

import com.xworkz.phoneNumberException.InvalidPhoneNumberException;
import com.xworkz.phonenumber.dao.PhoneNumberDAO;

public class PhoneNumberDAOImpl implements PhoneNumberDAO {
	private Long[] number = new Long[5];
	private int index;

	// @Override
	public boolean save(long number)  throws InvalidPhoneNumberException{
		this.number[index] = number;
		System.out.println(" number is saved in index;'" + index + "and number is;" + number);
		index++;
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean duplicate(long number) {
		for (Long long1 : this.number) {
			if (long1 != null && this.number.equals(long1)) {
				System.err.println("number is allready present ;" + number);
				return true;

			} else {
				System.out.println(" number is not present in this array " + number);
			}
		}
		return false;
	}

}
