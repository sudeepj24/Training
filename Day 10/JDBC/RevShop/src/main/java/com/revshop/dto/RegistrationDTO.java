package com.revshop.dto;

public class RegistrationDTO {

	private int loginid;
	private int userid;
	private String email;
	private String password;
	private boolean isFirstLogin;
	private String role;

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isFirstLogin() {
		return isFirstLogin;
	}

	public void setFirstLogin(boolean isFirstLogin) {
		this.isFirstLogin = isFirstLogin;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public RegistrationDTO(int loginid, int userid, String email, String password, boolean isFirstLogin, String role) {
		super();
		this.loginid = loginid;
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.isFirstLogin = isFirstLogin;
		this.role = role;
	}

	public RegistrationDTO() {
		super();
	}

	@Override
	public String toString() {
		return "RegistrationDTO [loginid=" + loginid + ", userid=" + userid + ", email=" + email + ", password="
				+ password + ", isFirstLogin=" + isFirstLogin + ", role=" + role + "]";
	}
	
	
	
	

}
