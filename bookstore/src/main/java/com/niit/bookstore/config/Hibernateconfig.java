package com.niit.bookstore.config;

import java.awt.print.Book;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;



public class Hibernateconfig {
	public static SessionFactory createSessionFactory() {
		Properties p=new Properties();
	p.setProperty(Environment.DRIVER, "org.h2.Driver");
	p.setProperty(Environment.URL, "jdbc:h2:~/myproject4");
	p.setProperty(Environment.USER, "sa");
	p.setProperty(Environment.PASS, "sa");
	p.setProperty(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
	p.setProperty(Environment.HBM2DDL_AUTO, "update");
	p.setProperty(Environment.SHOW_SQL, "true");
	Configuration c=new Configuration();
	c.setProperties(p);
	c.addAnnotatedClass(Book.class);
	SessionFactory sessionFactory=c.buildSessionFactory();
	return sessionFactory;
	
	}}
