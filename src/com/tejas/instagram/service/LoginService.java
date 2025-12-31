package com.tejas.instagram.service;

import com.tejas.instagram.dao.LoginDao;
import com.tejas.instagram.util.EncryptPass;
import com.tejas.instagram.util.Validation;

public class LoginService {

	public String loginUser(String userInput, String password) {
		LoginDao dao = new LoginDao();
		String hashPass = EncryptPass.encryptedPass(password);
		if (userInput.isEmpty()) {
			return "user Input is empty";
		} else if (Validation.isValidEmail(userInput)) {
			return dao.loginUserByMail(userInput.toLowerCase(), hashPass);
		} else if (Validation.isValidMobile(userInput)) {
			return dao.loginUserByMobile(userInput, hashPass);
		} else {
			return dao.loginUserByUserName(userInput, hashPass);
		}
	}

}
