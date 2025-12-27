package com.tejas.instagram.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tejas.instagram.config.HibernateConfiguration;
import com.tejas.instagram.entity.SignUp;

public class SignUpUserDao {

	public static String signUpDao(SignUp signUp) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		session.persist(signUp);
		session.beginTransaction().commit();
		session.close();
		return "User sucessfully signed up ";
	}

	public static List<SignUp> getUserName(String userName) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		Criteria criteria = session.createCriteria(SignUp.class);
		criteria.add(Restrictions.eq("userName", userName));
		List<SignUp> list = criteria.list();
		return list;
	}

}
