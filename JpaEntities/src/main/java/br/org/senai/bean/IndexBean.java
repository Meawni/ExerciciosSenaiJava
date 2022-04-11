package br.org.senai.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("index")
@RequestScoped
public class IndexBean implements Serializable {
		
		private String id;
		private String name;
		private String autor;
		private Integer numPaginas;
		
		public IndexBean() {
			
		}
		
		public IndexBean(String id, String name, String autor, Integer numPaginas) {
			
			this.id = id;
			this.name = name;
			this.autor = autor;
			this.numPaginas = numPaginas;
		}
		public void gravar() {
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public Integer getNumPaginas() {
			return numPaginas;
		}
		public void setNumPaginas(Integer numPaginas) {
			this.numPaginas = numPaginas;
		}

		
}
