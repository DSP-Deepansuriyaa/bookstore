package com.niit.bookstore.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.niit.bookstore.config.Hibernateconfig;
import com.niit.bookstore.model.book;

public class bookstoreDAOimpl implements bookstoreDAO {
SessionFactory sessionFactory;
	@Override
	public boolean addBook(book b) {
		try {
		 sessionFactory=Hibernateconfig.createSessionFactory();
		Session s= sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(b);
		t.commit();
		s.close();
		return true;
	}catch(Exception e) {
		return false;
	}}
	@Override
	public boolean updateBook(book b) {
		try {
			 sessionFactory=Hibernateconfig.createSessionFactory();
			Session s= sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.update(b);
			t.commit();
			s.close();
			return true;
		}catch(Exception e) {
			return false;
		}}
	

	@Override
	public boolean deleteBook(book b) {
		try {
			 sessionFactory=Hibernateconfig.createSessionFactory();
			Session s= sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.delete(b);
			t.commit();
			s.close();
			return true;
		}catch(Exception e) {
			return false;
		}}
	
	@Override
	public book selectOneBook(String bookname) {
		try {
			 sessionFactory=Hibernateconfig.createSessionFactory();
			Session s= sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			book b=(book)s.createQuery("from book where bookname='"+bookname+"'").uniqueResult();
			t.commit();
			s.close();
			return b;
		}catch(Exception e) {
			return null;
		}}
	
	@Override
	public List<book> selectAll() {
		
		try {
			 sessionFactory=Hibernateconfig.createSessionFactory();
			Session s= sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			List<book> b=s.createQuery("from book").list();
			t.commit();
			s.close();
			return b;
			
		}catch(Exception e) {
			return null;}
	}}


