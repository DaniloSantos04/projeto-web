package java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_reserva", schema = "public")
public class ItemReserva implements java.io.Serializable {

	private static final long serialVersionUID = -7912492484235365800L;
	private int id;
	private Item item;
	private Reserva reserva;
	private boolean indCautela;
	private int quantidade;

	public ItemReserva() {
	}

	public ItemReserva(int id, Item item, Reserva reserva, boolean indCautela, int quantidade) {
		this.id = id;
		this.item = item;
		this.reserva = reserva;
		this.indCautela = indCautela;
		this.quantidade = quantidade;
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
	@JoinColumn(name = "id_item", nullable = false)
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reserva", nullable = false)
	public Reserva getReserva() {
		return this.reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	@Column(name = "ind_cautela", nullable = false)
	public boolean isIndCautela() {
		return this.indCautela;
	}

	public void setIndCautela(boolean indCautela) {
		this.indCautela = indCautela;
	}

	@Column(name = "quantidade", nullable = false)
	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
