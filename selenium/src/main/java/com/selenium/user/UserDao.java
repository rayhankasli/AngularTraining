package com.selenium.user;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public UserDao(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	public UserDB getUserDetails(String username) {
		UserDB userDB = (UserDB) sessionFactory.getCurrentSession().createQuery("FROM UserDB WHERE username=:username")
				.setParameter("username", username).uniqueResult();
		return userDB;
	}

}
