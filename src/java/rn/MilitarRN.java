package java.rn;

import java.dao.MilitarDAOImpl;
import java.entity.Militar;
import java.util.List;

import javax.inject.Inject;

public class MilitarRN {

	@Inject
	private MilitarDAOImpl militarDAOImpl;
	
	public void salvarReserva(Militar companhia) throws Exception{
		militarDAOImpl.salvarReserva(companhia);
	}
	
	public List<Militar> buscarMilitar(String nome){
		return militarDAOImpl.buscarReserva(nome);
	}
	
	public List<Militar> todosMilitares(){
		return militarDAOImpl.todosMilitares();
	}
}
