package com.tejas.instagram.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tejas.instagram.config.HibernateConfiguration;
import com.tejas.instagram.entity.SignUp;

public class LoginDao {

	public static String loginUserByMail(String userInput, String hashPass) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		Criteria criteria = session.createCriteria(SignUp.class);
		criteria.add(Restrictions.eq("Email", userInput));
		List<SignUp> list = criteria.list();

		for (SignUp signup : list) {
			System.out.println(signup.getPassword().equals(hashPass));
			if (signup != null && signup.getPassword().equals(hashPass)) {
				return "Login Sucessfull !!!";

			}
		}
		return "Invalid Credentials ";
	}

	public static String loginUserByMobile(String userInput, String hashPass) {

		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		Criteria criteria = session.createCriteria(SignUp.class);
		criteria.add(Restrictions.eq("mobileNo", userInput));
		List<SignUp> list = criteria.list();
		for (SignUp signup : list) {
			if (signup != null && signup.getPassword().equals(hashPass)) {
				return "Login Sucessfull !!!";

			}
		}
		return "Invalid Credentials ";
	}

	public static String loginUserByUserName(String userInput, String hashPass) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		Criteria criteria = session.createCriteria(SignUp.class);
		criteria.add(Restrictions.eq("userName", userInput));
		List<SignUp> list = criteria.list();
		for (SignUp signup : list) {
			if (signup != null && signup.getPassword().equals(hashPass)) {
				return "Login Sucessfull !!!";

			}
		}
		return "Invalid Credentials ";
	}

}
