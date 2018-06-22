package com.selenium.report;

import java.util.Date;
import java.util.List;

import org.apache.lucene.search.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public ReportDao(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	@SuppressWarnings("unchecked")
	public List<ReportDB> getAllReports() {
		return sessionFactory.getCurrentSession().createQuery("FROM ReportDB").list();
	}

	@SuppressWarnings("unchecked")
	public List<ReportDB> getReportsByDate(Date executionDate) {

		return sessionFactory.getCurrentSession().createQuery("FROM ReportDB WHERE executiondate=:executiondate")
				.setParameter("executiondate", executionDate).list();

	}

	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public List<ReportDB> getPerticularReport(String search) {
		try {
			Session session = sessionFactory.getCurrentSession();
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			fullTextSession.createIndexer().startAndWait();
			QueryBuilder queryBuilder = fullTextSession.getSearchFactory().buildQueryBuilder().forEntity(ReportDB.class)
					.get();
			Query query = queryBuilder.keyword().onFields("reportformat", "passfailskip").matching(search)
					.createQuery();
			org.hibernate.Query hql = fullTextSession.createFullTextQuery(query, ReportDB.class);
			List<ReportDB> list = hql.list();
			return list;
		} catch (Exception e) {

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<ReportDB> getReportsByUsername(String username) {
		ReportDB db = new ReportDB();
		System.out.println("Date "+db.getExecutiondate());
		return sessionFactory.getCurrentSession().createQuery("FROM ReportDB WHERE username=:username ORDER BY id DESC")
				.setParameter("username", username).list();

	}

}
