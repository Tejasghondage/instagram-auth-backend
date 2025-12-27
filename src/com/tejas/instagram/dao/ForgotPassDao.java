package com.tejas.instagram.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tejas.instagram.config.HibernateConfiguration;
import com.tejas.instagram.entity.SignUp;

public class ForgotPassDao {

	public static boolean forgotpass(String userName) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		Criteria criteria = session.createCriteria(SignUp.class);
		criteria.add(Restrictions.eq("userName", userName));
		List<SignUp> list = criteria.list();
		if (!list.isEmpty()) {
			return true;
		}
		return false;

	}

	public static void changePass(String newPass, String userName) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		Criteria criteria = session.createCriteria(SignUp.class);
		criteria.add(Restrictions.eq("userName", userName));
		SignUp s = (SignUp) criteria.uniqueResult();
		s.setPassword(newPass);
		s.setDateOfModification(LocalDateTime.now());
		session.save(s);
		session.beginTransaction().commit();

	}

}
