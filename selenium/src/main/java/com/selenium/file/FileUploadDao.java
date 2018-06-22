package com.selenium.file;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileUploadDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public FileUploadDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public ArrayList<FileUploadDB> insertTestcase(ArrayList<FileUploadDB> testCase) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		for (FileUploadDB data : testCase) {

			session.save(data);

			session.flush();

		}
		tx.commit();

		return (ArrayList<FileUploadDB>) testCase;
	}

}
