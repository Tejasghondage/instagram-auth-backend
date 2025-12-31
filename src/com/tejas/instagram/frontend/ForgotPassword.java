package com.tejas.instagram.frontend;

import java.util.Scanner;

import com.tejas.instagram.controller.ForgotPassController;

public class ForgotPassword {
	Scanner sc = new Scanner(System.in);

	public void forgotpass() {
		System.out.println("Enter Username :");
		String userName = sc.nextLine();
		ForgotPassController controller = new ForgotPassController();
		if (controller.forgotpass(userName)) {
			System.out.println("Enter Otp send to your Registred mail ID:");
			int userOtp = sc.nextInt();

			if (controller.validateOtp(userOtp, userName)) {
				System.out.println("Enter new Password ");
				try (Scanner pass = new Scanner(System.in)) {
					String newPassword = pass.nextLine();
					boolean status1 = controller.updatePassword(newPassword, userName);
					if (status1) {
						System.out.println("Password updated Sucessfully...");

					} else {
						System.out.println("Your Password is too weak...");
					}
				}

			}

		} else

		{
			System.out.println("Invalid Username !!!");
		}
		sc.close();
	}

}
