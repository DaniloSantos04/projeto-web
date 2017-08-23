package java.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cautela_item", schema = "public")
public class CautelaItem implements java.io.Serializable {

	private static final long serialVersionUID = 6228780091830679831L;
	private int id;
	private Cautela cautela;
	private Item item;
	private int qtdCautela;
	private int qtdDevolucao;
	private Date dtcDevolucao;

	public CautelaItem() {
	}

	public CautelaItem(int id, Cautela cautela, Item item, int qtdCautela, int qtdDevolucao) {
		this.id = id;
		this.cautela = cautela;
		this.item = item;
		this.qtdCautela = qtdCautela;
		this.qtdDevolucao = qtdDevolucao;
	}

	public CautelaItem(int id, Cautela cautela, Item item, int qtdCautela, int qtdDevolucao, Date dtcDevolucao) {
		this.id = id;
		this.cautela = cautela;
		this.item = item;
		this.qtdCautela = qtdCautela;
		this.qtdDevolucao = qtdDevolucao;
		this.dtcDevolucao = dtcDevolucao;
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
	@JoinColumn(name = "id_cautela", nullable = false)
	public Cautela getCautela() {
		return this.cautela;
	}

	public void setCautela(Cautela cautela) {
		this.cautela = cautela;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_item", nullable = false)
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Column(name = "qtd_cautela", nullable = false)
	public int getQtdCautela() {
		return this.qtdCautela;
	}

	public void setQtdCautela(int qtdCautela) {
		this.qtdCautela = qtdCautela;
	}

	@Column(name = "qtd_devolucao", nullable = false)
	public int getQtdDevolucao() {
		return this.qtdDevolucao;
	}

	public void setQtdDevolucao(int qtdDevolucao) {
		this.qtdDevolucao = qtdDevolucao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtc_devolucao", length = 29)
	public Date getDtcDevolucao() {
		return this.dtcDevolucao;
	}

	public void setDtcDevolucao(Date dtcDevolucao) {
		this.dtcDevolucao = dtcDevolucao;
	}

}
