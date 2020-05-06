package br.com.projetoservicos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="authorization_tb")
public class Authorization implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToMany
	@JoinTable(name="authorization_http_requests")
	private List<HttpRequest> httpRequests = new ArrayList<HttpRequest>();
	@ManyToMany
	@JoinTable(name="authorization_roles")
	private List<Role> roles = new ArrayList<Role>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<HttpRequest> getHttpRequests() {
		return httpRequests;
	}
	public void setHttpRequests(List<HttpRequest> httpRequests) {
		this.httpRequests = httpRequests;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
