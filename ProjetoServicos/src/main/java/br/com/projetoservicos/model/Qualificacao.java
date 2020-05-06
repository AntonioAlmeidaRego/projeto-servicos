package br.com.projetoservicos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="qualificacao_tb")
public class Qualificacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="prestador_id")
	private Prestador prestador;
	@Column(nullable = false)
	@NotBlank(message = "Campo experiência é obrigatório!")
	private Integer experiencia;
	private String comentario;
	@ManyToMany
	@JoinTable(name="qualificacao_servicos")
	private List<Servico> servicos = new ArrayList<Servico>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Prestador getPrestador() {
		return prestador;
	}
	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	public Integer getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	
}
