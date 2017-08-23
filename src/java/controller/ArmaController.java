package java.controller;

import java.entity.Arma;
import java.facade.CadastroFacade;
import java.util.List;

import javax.inject.Inject;

public class ArmaController {
	
	@Inject
	private CadastroFacade cadastroFacade;

	private Arma arma;
	private List<Arma> listaArmas;
	
	public void salvar() {
		try {
			cadastroFacade.salvaArma(arma);
			arma = new Arma();
			listaArmas = cadastroFacade.todasArmas();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editar(Arma weapon) {
		arma = weapon;
	}
	
	public void excluir(Arma weapon) {
		
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}


	public List<Arma> getListaArmas() {
		return listaArmas;
	}


	public void setListaArmas(List<Arma> listaArmas) {
		this.listaArmas = listaArmas;
	}

}
