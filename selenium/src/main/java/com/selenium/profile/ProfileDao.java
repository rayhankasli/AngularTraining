package com.selenium.profile;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public ProfileDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<ProfileDB> getProfileDetails(String userName) {

		String hql = "SELECT e  FROM ProfileDB e join e.userDB WHERE username=:username";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("username", userName);
		List<ProfileDB> list = query.list();
		return list;

	}

}
