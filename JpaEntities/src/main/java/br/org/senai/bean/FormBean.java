package br.org.senai.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.org.senai.ejb.LivroBean;

@Named("form")
@RequestScoped
public class FormBean implements Serializable {
	
	@EJB
	private LivroBean livroBean;
	
	@Inject
	private FacesContext context;
	
	private UIComponent serchInputText;
	
	private Integer livroID;
	
	private Livro livro;
	
	public void gravar(AjaxBehaviorEvent event) {
		if(livro.getId() == null) {
			livroBean.carregar(livro);
		}else {
			livroBean.atualizar(livro);
		}
		livro = null;
	}
	public void pesquisar(AjaxBehaviorEvent event) {
		livro = livroBean.carregar(livroId);
		
		if(livro == null) {
				context.addMessage(searchInputText.getClientId(context), new FacesMessage("Livro não encontrado"));
		}
		livroId = null;
	}
	
	public void excluir (AjaxBehaviorEvent event) {
		livroBean.excluir(livro);
		livro = null;
	}
	
	public UIComponent getSearchInputText() {
		return searchInputText;
	}
	
	public void setSearchInputText(UiComponent searchInputText) {
		this.searchInputText = searchInputText;
	}
	
	public Integer getLivroId() {
		this.livroId = libroId
	}
}
