package java.dao;

import java.entity.Arma;
import java.entity.Companhia;
import java.entity.Municao;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.jboss.logging.Logger;

public class MunicaoDAOImpl {

	private static final String EMPTY = "";
	private Session session;

	private Logger logger = Logger.getLogger(Companhia.class);

	public MunicaoDAOImpl(Session session) {
		logger.info("Construtor" + session);
		this.session = session;
	}
	
	public void salvaMunicao(Municao municao) {
		session.saveOrUpdate(municao);
	}
	
	public List<Municao> buscarMunicao(String calibre){
		Query query = (Query) session.createQuery("select * from municao as municao where municao.calibre = :calibre")
				.setResultTransformer(new AliasToBeanResultTransformer(Municao.class));
		query.setParameter("calibre", calibre);
		return query.getResultList();
	}
	
	public List<Municao> todasMunicao(){
		Query query = (Query) session.createQuery("select * from municao as municao")
				.setResultTransformer(new AliasToBeanResultTransformer(Municao.class));
	
		return query.getResultList();
	}
}
