package com.niit.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int bookid;
	@Column(columnDefinition="text")
	String bookname;
	
	String authorname;
	@Column(nullable=false,unique=true )
	String prologue;
	
	int price;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getPrologue() {
		return prologue;
	}

	public void setPrologue(String prologue) {
		this.prologue = prologue;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
