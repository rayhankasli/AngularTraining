package com.selenium.user;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

	public UserResource fromEntity(UserDB user) {
		UserResource userResource;

		userResource = new UserResource();
		userResource.setUser_id(user.getUser_id());
		userResource.setUsername(user.getUsername());
		userResource.setPassword(user.getPassword());
		userResource.setEmployee_id(user.getEmployee_id());
		userResource.setUsersRole(user.getUsersRole());

		return userResource;
	}

	public UserDB fromResource(UserResource userResource) {
		UserDB user;

		user = new UserDB();
		user.setUser_id(userResource.getUser_id());
		user.setUsername(userResource.getUsername());
		user.setPassword(userResource.getPassword());
		user.setEmployee_id(userResource.getEmployee_id());
		user.setUsersRole(userResource.getUsersRole());
		return user;

	}

}
