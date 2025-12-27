package com.tejas.instagram.service;

import java.time.LocalDateTime;

import com.tejas.instagram.dao.SignUpUserDao;
import com.tejas.instagram.entity.SignUp;
import com.tejas.instagram.util.EncryptPass;
import com.tejas.instagram.util.Validation;

public class SignUpService {

	public static String signUpUser(SignUp signUp) {

		if (Validation.isValidUserName(signUp.getUserName())) {
			return "User name not available !!";

		} else if (!Validation.isValidPassword(signUp.getPassword())) {
			return "Enter password with at least Minimum 8 characters, " + "1 uppercase letter, 1 lowercase letter, "
					+ "1 digit, 1 special character, No spaces";

		} else if (!Validation.isValidMobile(signUp.getMobileNo())) {
			return "Enter Valid Mobile No";
		} else if (!Validation.isValidEmail(signUp.getEmail())) {
			return "Enter Valid Email ID";
		} else {
			signUp.setPassword(EncryptPass.encryptedPass(signUp.getPassword()));
			signUp.setDateOfCreation(LocalDateTime.now());
			signUp.setDateOfModification(LocalDateTime.now());
			return SignUpUserDao.signUpDao(signUp);
		}

	}
}
