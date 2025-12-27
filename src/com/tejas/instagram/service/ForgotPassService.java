package com.tejas.instagram.service;

import com.tejas.instagram.dao.ForgotPassDao;
import com.tejas.instagram.util.EncryptPass;

public class ForgotPassService {

	public static boolean forgotpass(String userName) {
		if (ForgotPassDao.forgotpass(userName)) {
			return true;
		} else {
			return false;
		}
	}

	public static void changepass(String newPass, String userName) {

		ForgotPassDao.changePass(EncryptPass.encryptedPass(newPass), userName);

	}
}
