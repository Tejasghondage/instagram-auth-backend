package com.tejas.instagram.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tejas.instagram.config.HibernateConfiguration;
import com.tejas.instagram.entity.User;

public class LoginDao {

	public String loginUserByMail(String userInput, String hashPass) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("Email", userInput));
		@SuppressWarnings("unchecked")
		List<User> list = criteria.list();

		for (User user : list) {
			if (user != null && user.getPassword().equals(hashPass)) {
				return "Login Sucessfull !!!";

			}
		}
		return "Invalid Credentials ";
	}

	@SuppressWarnings("unchecked")
	public String loginUserByMobile(String userInput, String hashPass) {

		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("mobileNo", userInput));
		List<User> list = criteria.list();
		for (User signup : list) {
			if (signup != null && signup.getPassword().equals(hashPass)) {
				return "Login Sucessfull !!!";

			}
		}
		return "Invalid Credentials ";
	}

	public String loginUserByUserName(String userInput, String hashPass) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userInput));
		@SuppressWarnings("unchecked")
		List<User> list = criteria.list();
		for (User signup : list) {
			if (signup != null && signup.getPassword().equals(hashPass)) {
				return "Login Sucessfull !!!";

			}
		}
		return "Invalid Credentials ";
	}

}
