package com.tejas.instagram.service;

import java.time.LocalDateTime;

import com.tejas.instagram.dao.SignUpUserDao;
import com.tejas.instagram.entity.User;
import com.tejas.instagram.util.EncryptPass;
import com.tejas.instagram.util.Validation;

public class SignUpService {

	public String signUpUser(User user) {

		if (Validation.isValidUserName(user.getUserName())) {
			return "User name not available !!";

		} else if (!Validation.isValidPassword(user.getPassword())) {
			return "Password is to weak !!!";

		} else if (!Validation.isValidMobile(user.getMobileNo())) {
			return "Enter Valid Mobile No";
		} else if (!Validation.isValidEmail(user.getEmail())) {
			return "Enter Valid Email ID";
		} else {
			user.setPassword(EncryptPass.encryptedPass(user.getPassword()));
			user.setDateOfCreation(LocalDateTime.now());
			user.setDateOfModification(LocalDateTime.now());
			SignUpUserDao dao = new SignUpUserDao();
			return dao.signUpDao(user);
		}

	}
}
