package com.tejas.instagram.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OTPAuth {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String mail;
	private String userName;
	private int generateOtp;
	private LocalDateTime expiryTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getGenerateOtp() {
		return generateOtp;
	}

	public void setGenerateOtp(int generateOtp) {
		this.generateOtp = generateOtp;
	}

	public LocalDateTime getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(LocalDateTime expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "OTPAuth [id=" + id + ", mail=" + mail + ", userName=" + userName + ", generateOtp=" + generateOtp
				+ ", expiryTime=" + expiryTime + "]";
	}

}
