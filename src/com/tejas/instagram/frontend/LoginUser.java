package com.tejas.instagram.frontend;

import java.util.Scanner;

import com.tejas.instagram.controller.LoginController;

public class LoginUser {
	public static void login() {
		Scanner logindata = new Scanner(System.in);
		System.out.println("Enter Username/Phone /Email:");
		String userInput = logindata.nextLine();
		System.out.println("Enter Password :");
		String password = logindata.nextLine();

		System.out.println(LoginController.loginUser(userInput, password));
	}
}
