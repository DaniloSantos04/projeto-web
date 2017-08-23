package java.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reserva", schema = "public")
public class Reserva implements java.io.Serializable {

	private static final long serialVersionUID = -641336568940380231L;
	private int id;
	private Companhia companhia;
	private Militar militarResponsavel;
	private String sigla;
	private String descricao;
	private Set<Cautela> cautelas = new HashSet<Cautela>(0);
	private Set<ItemReserva> itemReservas = new HashSet<ItemReserva>(0);

	public Reserva() {
	}

	public Reserva(int id, Companhia companhia, Militar militar, String sigla) {
		this.id = id;
		this.companhia = companhia;
		this.militarResponsavel = militar;
		this.sigla = sigla;
	}

	public Reserva(int id, Companhia companhia, Militar militar, String sigla, String descricao, Set<Cautela> cautelas,
			Set<ItemReserva> itemReservas) {
		this.id = id;
		this.companhia = companhia;
		this.militarResponsavel = militar;
		this.sigla = sigla;
		this.descricao = descricao;
		this.cautelas = cautelas;
		this.itemReservas = itemReservas;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_companhia", nullable = false)
	public Companhia getCompanhia() {
		return this.companhia;
	}

	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_responsavel", nullable = false)
	public Militar getMilitar() {
		return this.militarResponsavel;
	}

	public void setMilitar(Militar militar) {
		this.militarResponsavel = militar;
	}

	@Column(name = "sigla", nullable = false, length = 10)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "descricao", length = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public Set<Cautela> getCautelas() {
		return this.cautelas;
	}

	public void setCautelas(Set<Cautela> cautelas) {
		this.cautelas = cautelas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public Set<ItemReserva> getItemReservas() {
		return this.itemReservas;
	}

	public void setItemReservas(Set<ItemReserva> itemReservas) {
		this.itemReservas = itemReservas;
	}

}
