package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//para inserir com o jpa no banco de dados
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/

		// para pesquisar uma pessoa no banco de dados
		/*Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);*/
		
		//remover uma pessoa
		Pessoa p = em.find(Pessoa.class, 8);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		em.close();
		emf.close();
	}
}