package com.tejas.instagram.otpauth;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class SendOtp {

	public static boolean sendOtp(int generatedOtp, String email) {

		final String from = "ghondagetejas96@gmail.com";
		final String appPassword = "lehn xedq gnqz qsdv";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, appPassword);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("OTP Verification");
			message.setText("Your OTP is: " + generatedOtp + "\nValid for 5 minutes.");

			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
