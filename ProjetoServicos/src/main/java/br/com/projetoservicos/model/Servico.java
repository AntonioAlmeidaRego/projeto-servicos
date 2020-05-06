package br.com.projetoservicos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="servico_tb")
public class Servico implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	@NotBlank(message = "Campo nome é obrigátorio!")
	private String nome;
	@ManyToMany(mappedBy = "servicos")
	private List<Qualificacao> qualificacaos = new ArrayList<Qualificacao>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Qualificacao> getQualificacaos() {
		return qualificacaos;
	}
	public void setQualificacaos(List<Qualificacao> qualificacaos) {
		this.qualificacaos = qualificacaos;
	}
	
}
