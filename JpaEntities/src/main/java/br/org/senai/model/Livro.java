package br.org.senai.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Livro
 *
 */
@Entity(name="LIVRO")

public class Livro implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="ID")
	private Integer id;
	@Column (name="NAME", length=50, nullable=false)
	private String name;
	@Column (name="AUTOR", length=60, nullable=false)
	private String autor;
	@Column (name="NUMPAGINAS", nullable=false)
	private Integer numPaginas;
	
	private static final long serialVersionUID = 1L;

	  
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}   
	public Integer getNumPaginas() {
		return this.numPaginas;
	}

	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
   
}
