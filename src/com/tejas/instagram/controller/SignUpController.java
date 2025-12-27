package com.tejas.instagram.controller;

import com.tejas.instagram.entity.SignUp;
import com.tejas.instagram.service.SignUpService;

public class SignUpController {

	public static String signUpUser(SignUp signUp) {
		return SignUpService.signUpUser(signUp);
	}

}
