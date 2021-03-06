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
@Table(name = "arma", schema = "public")
public class Arma implements java.io.Serializable {

	private static final long serialVersionUID = -6043968708030801817L;
	private int id;
	private String numeroSerie;
	private String modelo;
	private String fabricante;
	private String calibre;
	private Set<Item> items = new HashSet<Item>(0);

	public Arma() {
	}

	public Arma(int id, String numeroSerie) {
		this.id = id;
		this.numeroSerie = numeroSerie;
	}

	public Arma(int id, String numeroSerie, String modelo, String fabricante, String calibre, Set<Item> items) {
		this.id = id;
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
		this.fabricante = fabricante;
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

	@Column(name = "numero_serie", nullable = false, length = 40)
	public String getNumeroSerie() {
		return this.numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	@Column(name = "modelo", length = 20)
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name = "fabricante", length = 20)
	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Column(name = "calibre", length = 5)
	public String getCalibre() {
		return this.calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arma")
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
