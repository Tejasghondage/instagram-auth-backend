package com.tejas.instagram.controller;

import com.tejas.instagram.service.ForgotPassService;

public class ForgotPassController {

	public static boolean forgotpass(String userName) {
		return ForgotPassService.forgotpass(userName);
	}

	public static void changePass(String newPass, String userName) {
		ForgotPassService.changepass(newPass, userName);
	}

}
