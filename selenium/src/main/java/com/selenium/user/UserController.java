package com.selenium.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.selenium.global.GlobalData;

@RestController
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.OK)
	public UserDetails getUserDetails(@RequestBody UserResource userResource) {
		GlobalData.setUsername(userResource.getUsername());
		UserDetails userDetails = userService.loadUserByUsername(GlobalData.getUsername());
		if (userDetails != null && userDetails.getPassword().equals(userResource.getPassword())) {
			return userDetails;
		}

		return null;
	}
}
