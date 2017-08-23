package java.rn;

import java.dao.MunicaoDAOImpl;
import java.entity.Arma;
import java.entity.Municao;
import java.util.List;

import javax.inject.Inject;

public class MunicaoRN {


	@Inject
	private MunicaoDAOImpl municaoDAOImpl;
	
	
	public void salvaMunicao(Municao municao) throws Exception{
		municaoDAOImpl.salvaMunicao(municao);
	}
	
	public List<Municao> buscarMunicao(String calibre){
		return municaoDAOImpl.buscarMunicao(calibre);
	}
	
	public List<Municao> todasMunicao(){
		return municaoDAOImpl.todasMunicao();
	}
	
}
