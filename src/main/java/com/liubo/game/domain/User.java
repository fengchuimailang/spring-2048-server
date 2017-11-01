package com.liubo.game.domain;

import java.util.Date;

public class User {
	
	private int userID;
	
	private String account;
	
	private String password;
	
	private Boolean gender;
	
	private Date birthday;
	
	private String phone;
	
	private String email;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "User [userID=" + userID+ ",account="+account+",password="+password+
				",gender="+gender+",birthday="+birthday+",phone="+phone+",email="+email+"]";
	}
	
	public static void main(String[] args){
		User user = new User();
		System.out.println(user.toString());
	}

}
