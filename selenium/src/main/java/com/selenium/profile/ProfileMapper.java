package com.selenium.profile;

import org.springframework.stereotype.Component;

@Component
public class ProfileMapper {

	public ProfileResource fromEntity(ProfileDB profileDB) {
		ProfileResource profileResource;
		profileResource = new ProfileResource();

		profileResource.setEmployee_id(profileDB.getEmployee_id());
		profileResource.setFirst_name(profileDB.getFirst_name());
		profileResource.setLast_name(profileDB.getLast_name());
		profileResource.setEmail(profileDB.getEmail());
		profileResource.setDate_of_birth(profileDB.getDate_of_birth());
		profileResource.setGender(profileDB.getGender());
		profileResource.setAddress(profileDB.getAddress());
		profileResource.setCity(profileDB.getCity());
		profileResource.setState(profileDB.getState());
		profileResource.setPincode(profileDB.getPincode());
		profileResource.setContact_no(profileDB.getContact_no());

		return profileResource;
	}

}
