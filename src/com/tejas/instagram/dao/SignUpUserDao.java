package com.tejas.instagram.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tejas.instagram.config.HibernateConfiguration;
import com.tejas.instagram.entity.User;

public class SignUpUserDao {

	public String signUpDao(User user) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		session.persist(user);
		session.beginTransaction().commit();
		session.close();
		return "User sucessfully signed up ";
	}

	@SuppressWarnings("unchecked")
	public static List<User> getUserName(String userName) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		List<User> list = criteria.list();
		return list;
	}

}
