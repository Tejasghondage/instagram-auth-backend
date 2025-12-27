package com.tejas.instagram.service;

import com.tejas.instagram.dao.LoginDao;
import com.tejas.instagram.util.EncryptPass;
import com.tejas.instagram.util.Validation;

public class LoginService {

	public static String loginUser(String userInput, String password) {
		String hashPass = EncryptPass.encryptedPass(password);
		if (userInput.isEmpty()) {
			return "user Input is empty";
		} else if (Validation.isMail(userInput)) {
			return LoginDao.loginUserByMail(userInput.toLowerCase(), hashPass);
		} else if (Validation.isMobile(userInput)) {
			return LoginDao.loginUserByMobile(userInput, hashPass);
		} else {
			return LoginDao.loginUserByUserName(userInput, hashPass);
		}
	}

}
