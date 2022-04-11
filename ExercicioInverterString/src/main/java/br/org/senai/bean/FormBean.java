package br.org.senai.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FormBean implements Serializable {
	
	private String texto;
	
	public String inverter() {
		StringBuilder sb = new StringBuilder(texto);
		texto = sb.reverse().toString();
		return texto;
	}
	

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
