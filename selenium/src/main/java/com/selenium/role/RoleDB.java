package com.selenium.role;

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

@Entity
@Table(name = "role")
public class RoleDB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int role_id;

	@Column(name = "role_name")
	private String role;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRoleDB")
	private Set<UsersRoleDB> userRole = new HashSet<UsersRoleDB>(0);

	public Set<UsersRoleDB> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UsersRoleDB> userRole) {
		this.userRole = userRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

}
