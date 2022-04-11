package br.org.senai.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LivroBean {
	
		@PersistenceContext
		private EntityManager em;
		
		public void inserir(Livro livro) {
			em.persist(livro);
		}
		
		public void atualizar(Livro livro) {
			em.merge(livro);
		}
		
		public void excluir(Livro livro) {
			livro = carregar(livro.getId());
			em.remove(livro);
		}
		
		public Livro carregar(int id) {
			return em.find(Livro.class, id);
		}
		

}
