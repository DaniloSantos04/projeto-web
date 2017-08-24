package java.rn;

import java.dao.MilitarDAOImpl;
import java.entity.Militar;
import java.util.List;

import javax.inject.Inject;

public class MilitarRN {

	@Inject
	private MilitarDAOImpl militarDAOImpl;
	
	public void salvarMilitar(Militar companhia) throws Exception{
		militarDAOImpl.salvarMilitar(companhia);
	}
	
	public List<Militar> buscarMilitar(String nome){
		return militarDAOImpl.buscarMilitar(nome);
	}
	
	public List<Militar> todosMilitares(){
		return militarDAOImpl.todosMilitares();
	}
}
