package com.tejas.instagram.controller;

import com.tejas.instagram.entity.User;
import com.tejas.instagram.service.SignUpService;

public class SignUpController {

	public String signUpUser(User user) {
		SignUpService service = new SignUpService();
		return service.signUpUser(user);
	}

}
