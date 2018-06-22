package com.selenium.role;

import java.util.HashSet;
import java.util.Set;

import com.selenium.usersrole.UsersRoleDB;

public class RoleResource {

	private int role_id;
	private String role;
	private Set<UsersRoleDB> userRole = new HashSet<UsersRoleDB>(0);

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UsersRoleDB> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UsersRoleDB> userRole) {
		this.userRole = userRole;
	}

}
