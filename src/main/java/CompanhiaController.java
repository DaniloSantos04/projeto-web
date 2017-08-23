import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import business.CompanhiaBusiness;

@ManagedBean(name="companhiaController")
@ViewScoped
public class CompanhiaController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Companhia companhia = new Companhia();
	
	@Inject
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
