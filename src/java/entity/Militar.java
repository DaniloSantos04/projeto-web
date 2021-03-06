package java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "militar", schema = "public")
public class Militar implements java.io.Serializable {

	private static final long serialVersionUID = -3878661634100213587L;
	private int id;
	private Companhia companhia;
	private Pessoa pessoa;
	private String posto;
	private String nomeGuerra;

	public Militar() {
	}

	public Militar(int id, Companhia companhia, Pessoa pessoa, String posto, String nomeGuerra) {
		this.id = id;
		this.companhia = companhia;
		this.pessoa = pessoa;
		this.posto = posto;
		this.nomeGuerra = nomeGuerra;
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
	@JoinColumn(name = "id_pessoa", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "posto", nullable = false, length = 20)
	public String getPosto() {
		return this.posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}

	@Column(name = "nome_guerra", nullable = false, length = 20)
	public String getNomeGuerra() {
		return this.nomeGuerra;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

}
