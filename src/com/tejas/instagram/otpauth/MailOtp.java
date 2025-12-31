package com.tejas.instagram.otpauth;

import java.time.LocalDateTime;

import com.tejas.instagram.entity.OTPAuth;

public class MailOtp {

	public static boolean mailOtp(String email, String userName) {
		int generatedOtp = (int) (Math.random() * 900000) + 100000;
		OTPAuth auth = new OTPAuth();
		auth.setGenerateOtp(generatedOtp);
		auth.setMail(email);
		auth.setExpiryTime(LocalDateTime.now().plusMinutes(5));
		auth.setUserName(userName);
		if (SaveOtp.saveOtp(auth)) {
			return SendOtp.sendOtp(generatedOtp, email);
		}
		return false;
	}

}
