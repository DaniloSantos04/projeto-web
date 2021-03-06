package java.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "companhia", schema = "public")
public class Companhia implements java.io.Serializable {

	private static final long serialVersionUID = 5783022626444884846L;
	private int id;
	private String nome;
	private Set<Militar> militars = new HashSet<Militar>(0);
	private Set<Reserva> reservas = new HashSet<Reserva>(0);

	public Companhia() {
	}

	public Companhia(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Companhia(int id, String nome, Set<Militar> militars, Set<Reserva> reservas) {
		this.id = id;
		this.nome = nome;
		this.militars = militars;
		this.reservas = reservas;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nome", nullable = false, length = 40)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companhia")
	public Set<Militar> getMilitars() {
		return this.militars;
	}

	public void setMilitars(Set<Militar> militars) {
		this.militars = militars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companhia")
	public Set<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

}
