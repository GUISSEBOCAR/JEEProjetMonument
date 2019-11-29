package org.projet.m2.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Lieu")
public class Lieu implements Serializable {
	@Id
	private String codeInsee;
	private String nomCommune;
	private float logitude;
	private float latitude;
	
	@OneToMany(mappedBy = "localite", fetch = FetchType.LAZY , cascade = CascadeType.ALL )
	private Collection<Monument> monument;
	
	@ManyToOne
	@JoinColumn(name = "FK_numDept")
	private Departement dept;
	

	public Lieu() {
		super();
	}


	public Lieu(String codeInsee, String nomCommune, float logitude, float latitude, Departement dept) {
		super();
		this.codeInsee = codeInsee;
		this.nomCommune = nomCommune;
		this.logitude = logitude;
		this.latitude = latitude;
		this.dept = dept;
	}


	public String getCodeInsee() {
		return codeInsee;
	}


	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}


	public String getNomCommune() {
		return nomCommune;
	}


	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}


	public float getLogitude() {
		return logitude;
	}


	public void setLogitude(float logitude) {
		this.logitude = logitude;
	}


	public float getLatitude() {
		return latitude;
	}


	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}


	public Collection<Monument> getMonument() {
		return monument;
	}


	public void setMonument(Collection<Monument> monument) {
		this.monument = monument;
	}


	public Departement getDept() {
		return dept;
	}


	public void setDept(Departement dept) {
		this.dept = dept;
	}
	
	

}
