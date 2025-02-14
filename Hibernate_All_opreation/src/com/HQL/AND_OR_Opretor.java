package com.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class AND_OR_Opretor {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from ProductDTO where id >=3 AND id <=5");
		// Query q = session.createQuery("from ProductDTO where id =3 OR id=5");

		List l = q.list();
		Iterator it = l.iterator();

		ProductDTO dto;
		while (it.hasNext()) {
			dto = (ProductDTO) it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getName());
		}

		session.close();
	}
}
