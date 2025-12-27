package com.tejas.instagram.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tejas.instagram.entity.SignUp;

public class HibernateConfiguration {
	public static final SessionFactory hibernateConfiguration() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SignUp.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
