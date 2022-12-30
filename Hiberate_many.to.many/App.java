package com.Nagendra;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

import com.Nagendra.entity.Category;
import com.Nagendra.entity.Stock;
import com.Nagendra.util.HibernateUtil;


public class App 
{
	@SuppressWarnings("deprecation")
	public static void main( String[] args ) {
	 Session ss = HibernateUtil.getSessionFactory().openSession();
	 ss.beginTransaction();
	 Stock s1=new Stock();
	 s1.setStockCode("aa1");
	 s1.setStockName("nifty");
	 
	 Category c=new Category("aaa","bbb");
	 
	 Category c1=new Category("aaaaaa", "raja");
	 
	 Set<Category> categories =new HashSet<Category>();
	 categories.add(c);
	 categories.add(c1);
	 ss.save(s1);
	 ss.getTransaction().commit();
	 ss.close();
	 System.out.println("completed!"); }}