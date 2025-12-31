package com.tejas.instagram.util;

import java.util.List;

import com.tejas.instagram.dao.SignUpUserDao;
import com.tejas.instagram.entity.User;

public class Validation {
//               mobile number validation 
	public static boolean isValidMobile(String mobile) {
		return mobile != null && mobile.matches("^[6-9][0-9]{9}$");
	}

//               user name validation 
	public static boolean isValidUserName(String userName) {
		List<User> list = SignUpUserDao.getUserName(userName);
		boolean check = false;
		for (User user : list) {
			if (user.getUserName().equals(userName)) {
				check = true;
			}
		}
		return check;
	}

//              password validation
	public static boolean isValidPassword(String password) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
		return password != null && password.matches(regex);
	}

//              Email Validation 
	public static boolean isValidEmail(String email) {
		return email.contains("@");
	}

//	public static boolean isMail(String userInput) {
//		return userInput.contains("@");
//	}

//	public static boolean isMobile(String userInput) {
//		return userInput.matches("\\d{10}");
//	}

}
