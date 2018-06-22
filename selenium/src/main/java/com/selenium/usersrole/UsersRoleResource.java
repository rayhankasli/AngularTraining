package com.selenium.usersrole;

import com.selenium.role.RoleDB;
import com.selenium.user.UserDB;

public class UsersRoleResource {

	private int user_role_id;
	private UserDB userDB;
	private RoleDB userRoleDB;

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	public UserDB getUserDB() {
		return userDB;
	}

	public void setUserDB(UserDB userDB) {
		this.userDB = userDB;
	}

	public RoleDB getUserRoleDB() {
		return userRoleDB;
	}

	public void setUserRoleDB(RoleDB userRoleDB) {
		this.userRoleDB = userRoleDB;
	}

}
