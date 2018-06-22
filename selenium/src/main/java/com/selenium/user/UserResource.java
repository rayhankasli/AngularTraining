package com.selenium.user;

import java.util.HashSet;
import java.util.Set;

import com.selenium.usersrole.UsersRoleDB;

public class UserResource {

	private int user_id;
	private String username;
	private String password;
	private int employee_id;
	private Set<UsersRoleDB> usersRole = new HashSet<UsersRoleDB>(0);

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Set<UsersRoleDB> getUsersRole() {
		return usersRole;
	}

	public void setUsersRole(Set<UsersRoleDB> usersRole) {
		this.usersRole = usersRole;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
