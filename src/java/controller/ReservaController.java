package java.controller;

import java.entity.Militar;
import java.entity.Reserva;
import java.facade.CadastroFacade;
import java.util.List;

import javax.inject.Inject;

public class ReservaController {
	
	@Inject
	private CadastroFacade cadastroFacade;

	private Reserva reserva;
	private List<Reserva> listaReserva;
	private List<Militar> listaMilitar;
	

	
	public void salvar() {
		try {
			cadastroFacade.salvarReserva(reserva);
			reserva = new Reserva();
			setListaReserva(cadastroFacade.todasReservas());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void editar(Reserva rsv) {
		reserva = rsv;
	}
	
	public void excluir(Reserva rsv) {
		
	}

	public List<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}

	public List<Militar> getListaMilitar() {
		return listaMilitar;
	}

	public void setListaMilitar(List<Militar> listaMilitar) {
		this.listaMilitar = listaMilitar;
	}

}
