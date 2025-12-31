package com.tejas.instagram.frontend;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter you choice ::");
		System.out.println("1. Register / SignUp ");
		System.out.println("2. Login ");
		System.out.println("3. Forgot Password ");
		System.out.println("0. Exit.. ");
		System.out.println("----------------------- ");
		try (Scanner sc = new Scanner(System.in)) {
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				SignUpUser signUpUser = new SignUpUser();
				signUpUser.SignUp();
				break;
			}
			case 2: {
				LoginUser loginUser = new LoginUser();
				loginUser.login();
				break;
			}
			case 3: {
				ForgotPassword forgotPassword = new ForgotPassword();
				forgotPassword.forgotpass();
				break;
			}
			case 0: {
				System.out.println("Thanks for visiting.....");
				System.exit(choice);
				break;
			}
			default:
				System.out.println("Invalid Input !!!");
			}
		}
	}
}
