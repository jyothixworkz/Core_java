package ncom.xworkz.phonenumber.service.impl;

import com.xworkz.phoneNumberException.InvalidPhoneNumberException;
import com.xworkz.phonenumber.dao.PhoneNumberDAO;
import com.xworkz.phonenumber.service.PhoneNumberService;

public class PhoneNumberServiceImpl implements PhoneNumberService {
	private PhoneNumberDAO dao;

	public PhoneNumberServiceImpl(PhoneNumberDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(Long number) throws InvalidPhoneNumberException {
		if (number != null && String.valueOf(number).length() == 10) {
			if (dao.duplicate(number)) {
				//System.err.println("number is allready present in dao");
				throw new InvalidPhoneNumberException("number is duplicate so we cant save this number");
			} else {
				System.out.println(" number is not present in this dao u can store to dao" + number);
				dao.save(number);
			//	throw new InvalidPhoneNumberException(" number is not currect we can not save this number");
			}

		}

		return false;
	}

}
