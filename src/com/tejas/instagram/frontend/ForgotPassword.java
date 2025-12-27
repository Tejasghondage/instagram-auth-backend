package com.tejas.instagram.frontend;

import java.util.Scanner;

import com.tejas.instagram.controller.ForgotPassController;

public class ForgotPassword {

	public static void forgotpass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username :");
		String userName = sc.nextLine();

		if (ForgotPassController.forgotpass(userName)) {
			System.out.println("Enter New Password:");
			String newPass = sc.nextLine();
			ForgotPassController.changePass(newPass, userName);
			sc.close();
		} else {
			System.out.println("Invalid Username !!!");
		}
	}

}
