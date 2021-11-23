package br.com.jogodasorte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.jogodasorte.entidade.Lance;
import br.com.jogodasorte.util.JPAUtil;

public class LanceDao {
	
	public static void salvar(Lance l) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Lance l) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Lance l) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		l = em.find(Lance.class, l.getId());
		em.remove(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Lance> listar() {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select l from Lance l");
		List<Lance> resultado = q.getResultList();
		em.close();
		return resultado;
	}
}