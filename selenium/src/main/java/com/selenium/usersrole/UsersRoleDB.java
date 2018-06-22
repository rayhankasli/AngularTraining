package com.selenium.usersrole;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.selenium.role.RoleDB;
import com.selenium.user.UserDB;

@SuppressWarnings("serial")
@Entity
@Table(name = "user_role")
public class UsersRoleDB implements Serializable {

	@Id
	@Column(name = "user_role_id")
	private int user_role_id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private UserDB userDB;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
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
