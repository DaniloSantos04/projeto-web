package java.rn;

import java.dao.ReservaDAOImpl;
import java.entity.Reserva;
import java.util.List;

import javax.inject.Inject;

public class ReservaRN {

	@Inject
	private ReservaDAOImpl reservaDAOImpl;
	
	public void salvarReserva(Reserva companhia) throws Exception{
		reservaDAOImpl.salvarReserva(companhia);
	}
	
	public List<Reserva> buscarReserva(String nome){
		return reservaDAOImpl.buscarReserva(nome);
	}
	
	public List<Reserva> todasReservas(){
		return reservaDAOImpl.todasReservas();
	}
	
	
	
	
}
