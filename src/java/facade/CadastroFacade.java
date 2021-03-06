package java.facade;

import java.entity.Acessorio;
import java.entity.Arma;
import java.entity.Companhia;
import java.entity.Militar;
import java.entity.Municao;
import java.entity.Reserva;
import java.rn.AcessorioRN;
import java.rn.ArmaRN;
import java.rn.CompanhiaRN;
import java.rn.MilitarRN;
import java.rn.MunicaoRN;
import java.rn.ReservaRN;
import java.util.List;

import javax.inject.Inject;

public class CadastroFacade {
	
	@Inject
	private CompanhiaRN companhiaRN;
	
	@Inject
	private ArmaRN armaRN;
	
	@Inject
	private MunicaoRN municaoRN;
	
	@Inject
	private AcessorioRN acessorioRN;
	
	@Inject
	private ReservaRN reservaRN;
	
	@Inject
	private MilitarRN militarRN;
	
	
	public List<Companhia> buscarCompanhiaNome(String nome){
		return companhiaRN.buscarCompanhiaNome(nome);
	}
	
	public void salvaCompanhia(Companhia companhia) throws Exception {
		companhiaRN.salvarCompanhia(companhia);
	}
	
	public List<Companhia> todasCompanhia(){
		return companhiaRN.todasCompanhia();
	}
	
	public void salvaArma(Arma arma) throws Exception{
		armaRN.salvaArma(arma);
	}
	
	public List<Arma> buscarArma(Arma arma){
		return armaRN.buscarArma(arma);
	}
	
	public List<Arma> todasArmas(){
		return armaRN.todasArmas();
	}
	
	public void salvaMunicao(Municao municao) throws Exception{
		municaoRN.salvaMunicao(municao);
	}
	
	public List<Municao> buscarMunicao(String calibre){
		return municaoRN.buscarMunicao(calibre);
	}
	
	public List<Municao> todasMunicao(){
		return municaoRN.todasMunicao();
	}
	
	public void salvaAcessorio(Acessorio acessorio) throws Exception{
		acessorioRN.salvaAcessorio(acessorio);
	}
	
	public List<Acessorio> buscarAcessorio(String nome){
		return acessorioRN.buscarAcessorio(nome);
	}
	
	public List<Acessorio> todasAcessorio(){
		return acessorioRN.todasAcessorio();
	}
	
	public List<Reserva> buscarReserva(String nome){
		return reservaRN.buscarReserva(nome);
	}
	
	public void salvarReserva(Reserva companhia) throws Exception {
		reservaRN.salvarReserva(companhia);
	}
	
	public List<Reserva> todasReservas(){
		return reservaRN.todasReservas();
	}
	
	public List<Militar> buscarMilitar(String nome){
		return militarRN.buscarMilitar(nome);
	}
	
	public void salvarMilitar(Militar companhia) throws Exception {
		militarRN.salvarMilitar(companhia);
	}
	
	public List<Militar> todosMilitares(){
		return militarRN.todosMilitares();
	}


}
