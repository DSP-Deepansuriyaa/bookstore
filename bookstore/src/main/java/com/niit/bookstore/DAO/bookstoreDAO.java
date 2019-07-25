package com.niit.bookstore.DAO;

import java.util.List;

import com.niit.bookstore.model.book;

public interface bookstoreDAO {

	boolean addBook(book b);
	boolean updateBook(book b);
	boolean deleteBook(book b);
	book selectOneBook(String bookname);
	List<book> selectAll();
}
