package org.projet.m2.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Celebrite")
public class Celebrite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numCelebrite;
	private String nom;
	private String prenom;
	private String nationalite;
	private String epoque;

	@ManyToMany
	@JoinTable(name = "AssocieA")
	private Collection<Monument> monument;

	public Celebrite() {
		super();
	}

	public Celebrite(String nom, String prenom, String nationalite, String epoque) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
	}

	public Integer getNumCelebrite() {
		return numCelebrite;
	}

	public void setNumCelebrite(Integer numCelebrite) {
		this.numCelebrite = numCelebrite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getEpoque() {
		return epoque;
	}

	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}

	public Collection<Monument> getMonument() {
		return monument;
	}

	public void setMonument(Collection<Monument> monument) {
		this.monument = monument;
	}
	
	

}
