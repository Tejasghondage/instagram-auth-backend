package com.tejas.instagram.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tejas.instagram.entity.User;

public class HibernateConfiguration {
	public static final SessionFactory hibernateConfiguration() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(User.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
