package java.controller;

import java.entity.Acessorio;
import java.facade.CadastroFacade;
import java.util.List;

import javax.inject.Inject;

public class AcessorioController {

	@Inject
	private CadastroFacade cadastroFacade;

	private Acessorio acessorio;
	private List<Acessorio> listaAcessorio;
	
	public void salvar() {
		try {
			cadastroFacade.salvaAcessorio(acessorio);
			acessorio = new Acessorio();
			listaAcessorio = cadastroFacade.todasAcessorio();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editar(Acessorio acess) {
		acessorio = acess;
	}
	
	public void excluir(Acessorio acess) {
		
	}

	public Acessorio getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}

	public List<Acessorio> getListaAcessorio() {
		return listaAcessorio;
	}

	public void setListaAcessorio(List<Acessorio> listaAcessorio) {
		this.listaAcessorio = listaAcessorio;
	}
}
