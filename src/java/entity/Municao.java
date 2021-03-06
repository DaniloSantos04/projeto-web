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
@Table(name = "municao", schema = "public")
public class Municao implements java.io.Serializable {

	private static final long serialVersionUID = 7988159695520893255L;
	private int id;
	private String calibre;
	private Set<Item> items = new HashSet<Item>(0);

	public Municao() {
	}

	public Municao(int id) {
		this.id = id;
	}

	public Municao(int id, String calibre, Set<Item> items) {
		this.id = id;
		this.calibre = calibre;
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

	@Column(name = "calibre", length = 5)
	public String getCalibre() {
		return this.calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "municao")
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
