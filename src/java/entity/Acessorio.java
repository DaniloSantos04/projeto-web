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
@Table(name = "acessorio", schema = "public")
public class Acessorio implements java.io.Serializable {

	private static final long serialVersionUID = -6835852498702542371L;
	private int id;
	private String nome;
	private Set<Item> items = new HashSet<Item>(0);

	public Acessorio() {
	}

	public Acessorio(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Acessorio(int id, String nome, Set<Item> items) {
		this.id = id;
		this.nome = nome;
		this.items = items;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "acessorio")
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
