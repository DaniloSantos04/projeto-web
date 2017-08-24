package java.controller;

import java.entity.Militar;
import java.entity.Reserva;
import java.facade.CadastroFacade;
import java.util.List;

import javax.inject.Inject;

public class MilitarController {
	
	@Inject
	private CadastroFacade cadastroFacade;

	private Militar militar;
	private List<Militar> listaMilitar;
	

	
	public void salvar() {
		try {
			cadastroFacade.salvarMilitar(militar);
			militar = new Militar();
			setListaMilitar(cadastroFacade.todosMilitares());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editar(Militar mil) {
		militar = mil;
	}
	
	public void excluir(Reserva mil) {
		
	}

	public List<Militar> getListaMilitar() {
		return listaMilitar;
	}

	public void setListaMilitar(List<Militar> listaMilitar) {
		this.listaMilitar = listaMilitar;
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

}
