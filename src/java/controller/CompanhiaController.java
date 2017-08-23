package java.controller;

import java.entity.Companhia;
import java.facade.CadastroFacade;
import java.util.List;

import javax.inject.Inject;

public class CompanhiaController {

	@Inject
	private CadastroFacade cadastroFacade;

	private Companhia companhia;
	private List<Companhia> listaCompanhias;
	
	

	public void salvar() {
		try {
			cadastroFacade.salvaCompanhia(companhia);
			companhia = new Companhia();
			listaCompanhias = cadastroFacade.todasCompanhia();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editar(Companhia comp) {
		companhia = comp;
	}
	
	public void excluir(Companhia comp) {
		
	}

	public Companhia getCompanhia() {
		return companhia;
	}

	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}
	
	public List<Companhia> getListaCompanhias() {
		return listaCompanhias;
	}

	public void setListaCompanhias(List<Companhia> listaCompanhias) {
		this.listaCompanhias = listaCompanhias;
	}
	
}
