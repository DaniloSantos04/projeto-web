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
@Table(name = "item", schema = "public")
public class Item implements java.io.Serializable {

	private static final long serialVersionUID = -8059844546032758222L;
	private int id;
	private Acessorio acessorio;
	private Arma arma;
	private Municao municao;
	private String descricao;
	private Set<ItemReserva> itemReservas = new HashSet<ItemReserva>(0);
	private Set<CautelaItem> cautelaItems = new HashSet<CautelaItem>(0);

	public Item() {
	}

	public Item(int id) {
		this.id = id;
	}

	public Item(int id, Acessorio acessorio, Arma arma, Municao municao, String descricao,
			Set<ItemReserva> itemReservas, Set<CautelaItem> cautelaItems) {
		this.id = id;
		this.acessorio = acessorio;
		this.arma = arma;
		this.municao = municao;
		this.descricao = descricao;
		this.itemReservas = itemReservas;
		this.cautelaItems = cautelaItems;
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
	@JoinColumn(name = "id_acessorio")
	public Acessorio getAcessorio() {
		return this.acessorio;
	}

	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_arma")
	public Arma getArma() {
		return this.arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_municao")
	public Municao getMunicao() {
		return this.municao;
	}

	public void setMunicao(Municao municao) {
		this.municao = municao;
	}

	@Column(name = "descricao", length = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<ItemReserva> getItemReservas() {
		return this.itemReservas;
	}

	public void setItemReservas(Set<ItemReserva> itemReservas) {
		this.itemReservas = itemReservas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<CautelaItem> getCautelaItems() {
		return this.cautelaItems;
	}

	public void setCautelaItems(Set<CautelaItem> cautelaItems) {
		this.cautelaItems = cautelaItems;
	}

}
