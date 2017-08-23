package java.rn;

import java.dao.CompanhiaDAOImpl;
import java.entity.Companhia;
import java.util.List;

import javax.inject.Inject;


public class CompanhiaRN {

	@Inject
	private CompanhiaDAOImpl companhiaDAOImpl;
	
	public void salvarCompanhia(Companhia companhia) throws Exception{
		companhiaDAOImpl.salvaCompanhia(companhia);
	}
	
	public List<Companhia> buscarCompanhiaNome(String nome){
		return companhiaDAOImpl.buscarCompanhia(nome);
	}
	
	public List<Companhia> todasCompanhia(){
		return companhiaDAOImpl.todasCompanhia();
	}
	
}
