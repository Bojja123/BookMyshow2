package com.tcs.bookmyshow.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USER_TABLE")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userID;

	@Column(name = "USER_NAME")
	private String usernamae;

	@Column(name = "USER_PASSWORD")
	private String password;

	@Column(name = "USER_EMAIL")
	@Email(message = "Email should be valid")
	private String email;
	@Size(max=10,min=5,message="criteria not met")
	@Column(name = "USER_MOBILENO")
	private long mobileno;

	@Column(name = "USER_ADDRESS")
	private String address;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Cinema> cinemas = new ArrayList<>();


	public List<Cinema> getCinemas() {
		return cinemas;
	}

	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUsernamae() {
		return usernamae;
	}

	public void setUsernamae(String usernamae) {
		this.usernamae = usernamae;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", usernamae=" + usernamae + ", password=" + password + ", email=" + email
				+ ", mobileno=" + mobileno + ", address=" + address + ", cinemas=" + cinemas + "]";
	}

}
