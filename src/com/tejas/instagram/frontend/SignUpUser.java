package com.tejas.instagram.frontend;

import java.util.Scanner;

import com.tejas.instagram.controller.SignUpController;
import com.tejas.instagram.entity.User;

public class SignUpUser {
	public void SignUp() {

		System.out.println("Welocome to new user registration desk...");
		System.out.println("-----------------------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Mobile No (Ex. 8767068705):");
		String mobileNo = sc.nextLine();
		System.out.println("                                           ");

		System.out.println("Enter Email (Ex. example@gmail.com):");
		String email = sc.nextLine();
		System.out.println("                                           ");

		System.out.println("Enter Full Name (Ex. Tejas Ghondage):");
		String fullName = sc.nextLine();
		System.out.println("                                           ");
		System.out.println("Enter User Name (Ex. tejasghondage):");
		String userName = sc.nextLine();
		System.out.println("                                           ");

		System.out.println("Enter User Password (Ex. Tejas#2004):");
		String password = sc.nextLine();

		User user = new User();
		user.setMobileNo(mobileNo);
		user.setEmail(email.toLowerCase());
		user.setUserFullName(fullName);
		user.setUserName(userName);
		user.setPassword(password);
		SignUpController controller = new SignUpController();
		System.out.println(controller.signUpUser(user));
		sc.close();
	}

}
