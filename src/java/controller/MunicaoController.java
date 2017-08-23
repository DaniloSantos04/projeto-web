package java.controller;

import java.entity.Arma;
import java.entity.Municao;
import java.facade.CadastroFacade;
import java.util.List;

import javax.inject.Inject;

public class MunicaoController {
	@Inject
	private CadastroFacade cadastroFacade;

	private Municao municao;
	private List<Municao> listaMunicao;
	
	public void salvar() {
		try {
			cadastroFacade.salvaMunicao(municao);
			municao = new Municao();
			listaMunicao = cadastroFacade.todasMunicao();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editar(Municao municoes) {
		municao = municoes;
	}

	public void excluir(Municao municoes) {
	
	}
	
	public Municao getMunicao() {
		return municao;
	}

	public void setMunicao(Municao municao) {
		this.municao = municao;
	}

	public List<Municao> getListaMunicao() {
		return listaMunicao;
	}

	public void setListaMunicao(List<Municao> listaMunicao) {
		this.listaMunicao = listaMunicao;
	}
}
