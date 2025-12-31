package com.tejas.instagram.otpauth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tejas.instagram.entity.OTPAuth;

public class SaveOtp {

	public static boolean saveOtp(OTPAuth auth) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(OTPAuth.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.saveOrUpdate(auth);
		session.beginTransaction().commit();
		session.close();
		return true;
	}

}
