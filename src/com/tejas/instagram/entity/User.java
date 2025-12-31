package com.tejas.instagram.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserID;
	private String mobileNo;
	private String Email;
	private String userFullName;
	private String userName;
	private LocalDateTime dateOfCreation;
	private LocalDateTime dateOfModification;
	private String Password;

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(LocalDateTime dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public LocalDateTime getDateOfModification() {
		return dateOfModification;
	}

	public void setDateOfModification(LocalDateTime dateOfModification) {
		this.dateOfModification = dateOfModification;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", mobileNo=" + mobileNo + ", Email=" + Email + ", userFullName="
				+ userFullName + ", userName=" + userName + ", dateOfCreation=" + dateOfCreation
				+ ", dateOfModification=" + dateOfModification + ", Password=" + Password + "]";
	}

}
