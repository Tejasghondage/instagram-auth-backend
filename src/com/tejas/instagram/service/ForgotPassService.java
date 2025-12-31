package com.tejas.instagram.service;

import com.tejas.instagram.dao.ForgotPassDao;
import com.tejas.instagram.entity.User;
import com.tejas.instagram.otpauth.MailOtp;
import com.tejas.instagram.util.EncryptPass;
import com.tejas.instagram.util.Validation;

public class ForgotPassService {
	ForgotPassDao dao = new ForgotPassDao();

	public boolean forgotpass(String userName) {
		User user = dao.forgotpass(userName);
		if (user == null) {
			return false;
		} else if (user.getUserName().equals(userName)) {
			System.out.println("Send mail to me ");
			return MailOtp.mailOtp(user.getEmail(), user.getUserName());
		} else {

			return false;
		}
	}

	public boolean validateOtp(int userOtp, String userName) {
		return dao.validateOtp(userOtp, userName);
	}

	public boolean updatePassword(String newPassword, String userName) {
		if (Validation.isValidPassword(newPassword)) {
			return dao.updatePassword(EncryptPass.encryptedPass(newPassword), userName);
		}
		return false;
	}

}
