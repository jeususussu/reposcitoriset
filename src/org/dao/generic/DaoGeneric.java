package org.dao.generic;

import java.util.List;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.modelo.ciudad.Ciudad;
import org.modelo.cuenta.Cuenta;
import org.modelo.hta.Hta;

public class DaoGeneric {
	
	@SuppressWarnings("unchecked")
	public List<Ciudad> listCiudad(){
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		List<Ciudad> list = null;
		try {
			session.beginTransaction();
			list= (List<Ciudad>) session.createQuery("from Ciudad").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Exception list ciudad" +e.getMessage());
			// TODO: handle exception
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cuenta> listCuenta(){
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		List<Cuenta> list = null;
		try {
			session.beginTransaction();
			list= (List<Cuenta>) session.createQuery("from Cuenta").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Exception list Cuenta" +e.getMessage());
			// TODO: handle exception
		}
		return list;
	}
	
	public void addHta(Hta hta) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(hta);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Exception list Cuenta" +e.getMessage());
			// TODO: handle exception
		}
		
	}

}
