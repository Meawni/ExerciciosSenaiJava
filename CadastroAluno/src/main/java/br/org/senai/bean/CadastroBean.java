package br.org.senai.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.org.senai.model.Linguagem;

@Named("cadastro")
@RequestScoped
public class CadastroBean implements Serializable {
	
	private String nome;
	private String endereco;
	private String fone;
	private String email;
	private String senha1;
	private String senha2;
	private Integer[] linguagens;
	
	public Linguagem[] getListaLinguagns() {
		return Linguagem.LINGUAGENS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha1() {
		return senha1;
	}

	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public Integer[] getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	
	public String getLinguagensAsString() {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (Integer linguagem : linguagens) {
			if(!first) {
				sb.append(", ");
			}
			sb.append(linguagem);
			first = false;
		}
		return sb.toString();
	}
	
}
