package aulajpa.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpa.dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
	
		
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 3);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
		
		
		
		System.out.println("Pronto!");
		em.close();
		enf.close();
		
		
		

	}

}
