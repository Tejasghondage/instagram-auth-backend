package com.tejas.instagram.frontend;

import java.util.Scanner;

import com.tejas.instagram.controller.LoginController;

public class LoginUser {
	public void login() {
		try (Scanner logindata = new Scanner(System.in)) {
			System.out.println("Welocome to user login desk...");
			System.out.println("-----------------------------------------");
			System.out.println("Enter Username/Phone /Email:");
			String userInput = logindata.nextLine();
			System.out.println("                                         ");
			System.out.println("Enter Password :");
			String password = logindata.nextLine();
			System.out.println("                                         ");
			LoginController controller = new LoginController();
			System.out.println(controller.loginUser(userInput, password));
		}
	}
}
