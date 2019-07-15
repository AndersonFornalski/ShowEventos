package com.fornalskiapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ConvidadosEvento implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idConvidado;
	private String rg;
	private String Nome;
	private String email;
	private String fone;
	
	@ManyToOne
	private CadastroEvento cadEvento;

	public ConvidadosEvento() {
		
	}

	public ConvidadosEvento(long idConvidado, String rg, String nome, String email, String fone) {
		super();
		this.idConvidado = idConvidado;
		this.rg = rg;
		Nome = nome;
		this.email = email;
		this.fone = fone;
	}


	public long getIdConvidado() {
		return idConvidado;
	}

	public void setIdConvidado(long idConvidado) {
		this.idConvidado = idConvidado;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public CadastroEvento getCadEvento() {
		return cadEvento;
	}

	public void setCadEvento(CadastroEvento cadEvento) {
		this.cadEvento = cadEvento;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idConvidado ^ (idConvidado >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConvidadosEvento other = (ConvidadosEvento) obj;
		if (idConvidado != other.idConvidado)
			return false;
		return true;
	}
	
	

}

