package java.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cautela", schema = "public")
public class Cautela implements java.io.Serializable {

	private static final long serialVersionUID = -3157989087853818356L;
	private int id;
	private Pessoa pessoa;
	private Reserva reserva;
	private Date dtcRetirada;
	private Set<CautelaItem> cautelaItems = new HashSet<CautelaItem>(0);

	public Cautela() {
	}

	public Cautela(int id, Pessoa pessoa, Reserva reserva, Date dtcRetirada) {
		this.id = id;
		this.pessoa = pessoa;
		this.reserva = reserva;
		this.dtcRetirada = dtcRetirada;
	}

	public Cautela(int id, Pessoa pessoa, Reserva reserva, Date dtcRetirada, Set<CautelaItem> cautelaItems) {
		this.id = id;
		this.pessoa = pessoa;
		this.reserva = reserva;
		this.dtcRetirada = dtcRetirada;
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
	@JoinColumn(name = "id_pessoa", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reserva", nullable = false)
	public Reserva getReserva() {
		return this.reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtc_retirada", nullable = false, length = 29)
	public Date getDtcRetirada() {
		return this.dtcRetirada;
	}

	public void setDtcRetirada(Date dtcRetirada) {
		this.dtcRetirada = dtcRetirada;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cautela")
	public Set<CautelaItem> getCautelaItems() {
		return this.cautelaItems;
	}

	public void setCautelaItems(Set<CautelaItem> cautelaItems) {
		this.cautelaItems = cautelaItems;
	}

}
