import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import business.CompanhiaBusiness;

@ManagedBean(name="companhiaController")
@ViewScoped
public class CompanhiaController implements Serializable {
	
	private Companhia companhia = new Companhia();
	
	@EJB
	CompanhiaBusiness companhiaBusiness;
	
	@PostConstruct
	public void init() {

	}

	public Companhia getCompanhia() {
		return companhia;
	}

	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}
	
	
	
}
