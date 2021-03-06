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
@Table(name = "pessoa", schema = "public")
public class Pessoa implements java.io.Serializable {

	private static final long serialVersionUID = 690459943348968755L;
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private Set<Reserva> reservas = new HashSet<Reserva>(0);
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	private Set<Militar> militars = new HashSet<Militar>(0);
	private Set<Cautela> cautelas = new HashSet<Cautela>(0);

	public Pessoa() {
	}

	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Pessoa(int id, String nome, String email, String telefone, Set<Reserva> reservas, Set<Usuario> usuarios,
			Set<Militar> militars, Set<Cautela> cautelas) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.reservas = reservas;
		this.usuarios = usuarios;
		this.militars = militars;
		this.cautelas = cautelas;
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

	@Column(name = "email", length = 40)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telefone", length = 14)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Militar> getMilitars() {
		return this.militars;
	}

	public void setMilitars(Set<Militar> militars) {
		this.militars = militars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Cautela> getCautelas() {
		return this.cautelas;
	}

	public void setCautelas(Set<Cautela> cautelas) {
		this.cautelas = cautelas;
	}

}
