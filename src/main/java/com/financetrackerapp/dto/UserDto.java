package com.financetrackerapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserDto {
	private int id;
	private String firstName;
	private String lastName;
	@NotEmpty(message="Username cannot be empty")
	@NotNull(message ="Username connot be null")
	private String userName;
	@NotEmpty(message="Username cannot be empty")
	@NotNull(message ="Username connot be null")
	private String password;
	@Email
	private String email;
	private String role;
	public UserDto() {
		super();
	}
	public UserDto(int id, String firstName, String lastName,
			@NotEmpty(message = "Username cannot be empty") @NotNull(message = "Username connot be null") String userName,
			@NotEmpty(message = "Username cannot be empty") @NotNull(message = "Username connot be null") String password,
			@Email String email, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
