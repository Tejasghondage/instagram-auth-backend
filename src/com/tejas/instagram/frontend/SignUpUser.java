package com.tejas.instagram.frontend;

import java.util.Scanner;

import com.tejas.instagram.controller.SignUpController;
import com.tejas.instagram.entity.SignUp;

public class SignUpUser {
	public static void SignUp() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Mobile No:");
		String mobileNo = sc.nextLine();

		System.out.println("Enter Email:");
		String email = sc.nextLine();

		System.out.println("Enter Full Name:");
		String fullName = sc.nextLine();

		System.out.println("Enter User Name (lowercase:johndoe123):");
		String userName = sc.nextLine();

		System.out.println("Enter User Password:");
		String password = sc.nextLine();

		SignUp signUp = new SignUp();
		signUp.setMobileNo(mobileNo);
		signUp.setEmail(email.toLowerCase());
		signUp.setUserFullName(fullName);
		signUp.setUserName(userName);
		signUp.setPassword(password);

		System.out.println(SignUpController.signUpUser(signUp));

		sc.close();
	}

}
