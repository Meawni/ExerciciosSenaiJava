package br.org.senai.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class IndexBean implements Serializable {
	
		public String getMensagem() {
			return "Esta mensagem foi enviada pelo Bean2";
			
		}
		
}
