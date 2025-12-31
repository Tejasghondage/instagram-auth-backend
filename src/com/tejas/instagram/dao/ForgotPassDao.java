package com.tejas.instagram.dao;

import java.time.LocalDateTime;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tejas.instagram.config.HibernateConfiguration;
import com.tejas.instagram.entity.OTPAuth;
import com.tejas.instagram.entity.User;

public class ForgotPassDao {

	public User forgotpass(String userName) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		User user = (User) criteria.uniqueResult();
		return user;

	}

	public boolean validateOtp(int userOtp, String userName) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(OTPAuth.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(OTPAuth.class);
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("generateOtp", userOtp));
		OTPAuth auth = (OTPAuth) criteria.uniqueResult();
		if (auth == null) {
			session.close();
			return false;
		}
		if (auth.getExpiryTime().isBefore(LocalDateTime.now())) {
			return false;
		}
		session.delete(auth);
		session.beginTransaction().commit();
		session.close();
		return true;
	}

	public boolean updatePassword(String newPassword, String userName) {
		Session session = HibernateConfiguration.hibernateConfiguration().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));

		User user = (User) criteria.uniqueResult();
		user.setPassword(newPassword);
		user.setDateOfModification(LocalDateTime.now());
		session.update(user);
		session.beginTransaction().commit();
		session.close();
		return true;
	}

}
