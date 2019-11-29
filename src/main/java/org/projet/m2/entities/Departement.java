package org.projet.m2.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Departement")
public class Departement implements Serializable {
	
	@Id
	private String numDepartement;
	private String chefLieu;
	private String  nomDepartement;
	private String region;
	
	
	@OneToMany(mappedBy = "dept", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private Collection<Lieu> lieu;


	public Departement() {
		super();
	}


	public Departement(String numDepartement, String chefLieu, String nomDepartement, String region) {
		super();
		this.numDepartement = numDepartement;
		this.chefLieu = chefLieu;
		this.nomDepartement = nomDepartement;
		this.region = region;
	}


	public String getNumDepartement() {
		return numDepartement;
	}


	public void setNumDepartement(String numDepartement) {
		this.numDepartement = numDepartement;
	}


	public String getChefLieu() {
		return chefLieu;
	}


	public void setChefLieu(String chefLieu) {
		this.chefLieu = chefLieu;
	}


	public String getNomDepartement() {
		return nomDepartement;
	}


	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public Collection<Lieu> getLieu() {
		return lieu;
	}


	public void setLieu(Collection<Lieu> lieu) {
		this.lieu = lieu;
	}
	
	


}
