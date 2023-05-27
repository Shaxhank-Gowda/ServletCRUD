package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Dto;

public class Dao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public String add(Dto d1) {
		et.begin();
		em.persist(d1);
		et.commit();
		return "added";
	}
	
	public Dto find(String x) {
		Dto d1=em.find(Dto.class, x);
		return d1;
	}

}
