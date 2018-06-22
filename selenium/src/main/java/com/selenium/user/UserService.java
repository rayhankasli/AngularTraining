package com.selenium.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.selenium.usersrole.UsersRoleDB;

@Service
@Transactional
public class UserService implements UserDetailsService {

	private final UserDao userDao;

	@SuppressWarnings("unused")
	private final UserMapper userMapper;

	@Autowired
	public UserService(UserDao userDao, UserMapper userMapper) {
		this.userDao = userDao;
		this.userMapper = userMapper;
	}

	public UserDetails loadUserByUsername(String username) {
		UserDB userDB = (UserDB) userDao.getUserDetails(username);
		if (userDB != null) {
			List<GrantedAuthority> authorities = buildUserAuthority(userDB.getUsersRole());
			return (UserDetails) buildUserforAuthentication(userDB, authorities);
		} else {
			return null;
		}
	}

	private User buildUserforAuthentication(UserDB userDB, List<GrantedAuthority> authorities) {
		return new User(userDB.getUsername(), userDB.getPassword(), authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UsersRoleDB> userRole) {
		Set<GrantedAuthority> setAuth = new HashSet<GrantedAuthority>();

		for (UsersRoleDB role : userRole) {
			setAuth.add(new SimpleGrantedAuthority(role.getUserRoleDB().getRole()));
		}
		List<GrantedAuthority> result = new ArrayList<GrantedAuthority>(setAuth);
		return result;

	}

}