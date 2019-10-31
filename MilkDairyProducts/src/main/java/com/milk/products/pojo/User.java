package com.milk.products.pojo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String user_id;
	private String password;
	private String full_name;
	private String dob;
	private String gender;
	private String email_id;
	private String mobile_no;
	
	public User() {
	}
	
	
	public User(String user_id, String password, String full_name, String dob, String gender,
			String email_id, String mobile_no) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.full_name = full_name;
		this.dob = dob;
		this.gender = gender;
		this.email_id = email_id;
		this.mobile_no = mobile_no;
	}


	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", password=" + password + ", full_name=" + full_name + ", dob=" + dob
				+ ", gender=" + gender + ", email_id=" + email_id + ", mobile_no=" + mobile_no + "]";
	}
}
