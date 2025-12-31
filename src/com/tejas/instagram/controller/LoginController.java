package com.tejas.instagram.controller;

import com.tejas.instagram.service.LoginService;

public class LoginController {

	public String loginUser(String userInput, String password) {
		LoginService loginService = new LoginService();
		return loginService.loginUser(userInput, password);

	}

}
