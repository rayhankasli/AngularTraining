package com.selenium.profile;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProfileService {

	private final ProfileDao profileDao;
	private final ProfileMapper profileMapper;

	public ProfileService(ProfileDao profileDao, ProfileMapper profileMapper) {
		this.profileDao = profileDao;
		this.profileMapper = profileMapper;
	}

	public List<ProfileResource> getProfile(String username) {
		List<ProfileDB> dbList = (List<ProfileDB>) profileDao.getProfileDetails(username);
		List<ProfileResource> resourcesList = (List<ProfileResource>) dbList.stream().map(profileMapper::fromEntity)
				.collect(Collectors.toList());
		return resourcesList;
	}

}
