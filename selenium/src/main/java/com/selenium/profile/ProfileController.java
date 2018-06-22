package com.selenium.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.selenium.global.GlobalData;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	private final ProfileService profileService;

	@Autowired
	public ProfileController(ProfileService profileService) {
		this.profileService = profileService;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public List<ProfileResource> getUserProfile() {
		List<ProfileResource> profileResources = profileService.getProfile(GlobalData.getUsername());
		return profileResources;
	}

}
