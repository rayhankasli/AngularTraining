package com.selenium.chart;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selenium.global.GlobalData;

@Repository
public class ChartDao {
	

	private final SessionFactory sessionFactory;
	
	
	@Autowired
	public ChartDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
	public List<ChartDB> getChartData()
	{
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("CALL chartresult(:username)");
		query.setParameter("username",GlobalData.getUsername());
		
		List result = query.list();
			
		return result;
	}
	
	

}
