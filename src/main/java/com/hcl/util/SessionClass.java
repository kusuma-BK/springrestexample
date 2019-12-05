package com.hcl.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public  class SessionClass {

	private static  SessionFactory sessionFactory;

	public  Session getSession() {
		 Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

}
