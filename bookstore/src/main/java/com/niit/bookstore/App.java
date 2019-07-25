package com.niit.bookstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.niit.bookstore.DAO.bookstoreDAO;
import com.niit.bookstore.DAO.bookstoreDAOimpl;
import com.niit.bookstore.model.book;

import jdk.internal.util.xml.impl.Input;
import jdk.nashorn.internal.ir.WhileNode;

public class App {

	public static void main( String[] args )
    {
        bookstoreDAO d=new bookstoreDAOimpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        int c=sc.nextInt();
       
        	switch(c)
        	{
        	case 1:
        		book e=new book();
        		e.setBookid(1);
        		e.setBookname("everyone has a story");
        		e.setAuthorname("SaviSharma");
        		e.setPrologue("gain nostalgia");
        		e.setPrice(500);
        		if(d.addBook(e))
        		
        		break;
        	case 2:
        		book e1=d.selectOneBook("everyone has a story");
        		d.deleteBook(e1);
        		break;
        	case 3:
        		book e2=d.selectOneBook("everyone has a story");
        		e2.setPrice(250);
        		if(d.updateBook(e2))
        		break;
        	case 4:
        		ArrayList<book> list=(ArrayList<book>)d.selectAll();
        		Iterator<book> it=list.iterator();
        		while(it.hasNext())
        		{
        		book book=(book)it.next();
        		System.out.println(book.getBookname()+"\t"+book.getAuthorname()+"\t"+book.getPrologue()+"\t"+book.getPrice());
        		}
        	
        	}}}  
