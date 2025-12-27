package com.tejas.instagram.controller;

import com.tejas.instagram.service.LoginService;

public class LoginController {

	public static String loginUser(String userInput, String password) {
		return LoginService.loginUser(userInput, password);

	}

}
