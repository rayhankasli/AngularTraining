package com.selenium.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.selenium.usersrole.UsersRoleDB;

@SuppressWarnings("serial")
@Entity
@Table(name = "user_detail")
public class UserDB implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "employee_id")
	private int employee_id;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDB")
	private Set<UsersRoleDB> usersRole = new HashSet<UsersRoleDB>(0);

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
}