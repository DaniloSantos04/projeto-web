package java.rn;

import java.dao.ArmaDAOImpl;
import java.entity.Arma;
import java.util.List;

import javax.inject.Inject;

public class ArmaRN {
	
	@Inject
	private ArmaDAOImpl armaDAOImpl;
	
	
	public void salvaArma(Arma arma) throws Exception{
		armaDAOImpl.salvaArma(arma);
	}
	
	public List<Arma> buscarArma(Arma arma){
		return armaDAOImpl.buscarArma(arma);
	}
	
	public List<Arma> todasArmas(){
		return armaDAOImpl.todasArmas();
	}
	

}
