package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();

		Session session1 = sessionFactory.openSession();
		ProductDTO productDTO = (ProductDTO) session1.get(ProductDTO.class, 1);
		System.out.println(productDTO);
		session1.close();

		// Stop a Program......
		// Thread.sleep(20000);

		Session session2 = sessionFactory.openSession();
		ProductDTO productDTO1 = (ProductDTO) session2.get(ProductDTO.class, 1);
		System.out.println(productDTO1);
		session2.close();

	}

}
