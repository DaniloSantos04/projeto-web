package java.rn;

import java.dao.AcessorioDAOImpl;
import java.entity.Acessorio;
import java.entity.Municao;
import java.util.List;

import javax.inject.Inject;

public class AcessorioRN {

	@Inject
	private AcessorioDAOImpl acessorioDAOImpl;
	
	
	public void salvaAcessorio(Acessorio acessorio) throws Exception{
		acessorioDAOImpl.salvaAcessorio(acessorio);
	}
	
	public List<Acessorio> buscarAcessorio(String nome){
		return acessorioDAOImpl.buscarAcessorio(nome);
	}
	
	public List<Acessorio> todasAcessorio(){
		return acessorioDAOImpl.todasAcessorio();
	}
	
}
