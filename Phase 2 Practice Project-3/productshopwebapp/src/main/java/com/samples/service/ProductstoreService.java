package com.samples.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Product;
import com.samples.util.HibernateUtil;

public class ProductstoreService {
	
	public void addProduct(Product product) {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction txn = session.getTransaction();
		
		txn.begin();
		
		session.save(product);
		
		txn.commit();
		
		session.close();
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}
