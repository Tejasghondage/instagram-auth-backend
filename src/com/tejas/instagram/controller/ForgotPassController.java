package com.tejas.instagram.controller;

import com.tejas.instagram.service.ForgotPassService;

public class ForgotPassController {
	ForgotPassService service = new ForgotPassService();

	public boolean forgotpass(String userName) {
		return service.forgotpass(userName);
	}

	public boolean validateOtp(int userOtp, String userName) {
		return service.validateOtp(userOtp, userName);

	}

	public boolean updatePassword(String newPassword, String userName) {
		return service.updatePassword(newPassword, userName);
	}

}
