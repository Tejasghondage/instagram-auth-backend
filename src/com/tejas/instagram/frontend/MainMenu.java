package com.tejas.instagram.frontend;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		System.out.println("Enter 1 for signup and 2 For login and 3 to change password :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			SignUpUser.SignUp();
			break;
		}
		case 2: {
			LoginUser.login();
			break;
		}
		case 3: {
			ForgotPassword.forgotpass();
			break;
		}
		default:
			System.out.println("Invalid Input .!!!");
		}
	}
}
