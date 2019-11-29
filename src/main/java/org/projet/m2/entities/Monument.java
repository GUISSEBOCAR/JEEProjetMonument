package org.projet.m2.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Monument")
public class Monument implements Serializable {
	@Id
	private String codeMonument;
	private String nomMonument;
	private String proprietaire;
	private String typeMonument;
	private float longitude;
	private float latitude;
	
	@ManyToMany
	@JoinTable(name = "AssocieA")
	private Collection<Celebrite> celebrite;
	
	@ManyToOne
	@JoinColumn(name = "FK_codeInsee")
	private Lieu localite;

	public Monument() {
		super();
	}

	public Monument(String codeMonument, String nomMonument, String proprietaire, String typeMonument, float longitude,
			float latitude, Lieu localite) {
		super();
		this.codeMonument = codeMonument;
		this.nomMonument = nomMonument;
		this.proprietaire = proprietaire;
		this.typeMonument = typeMonument;
		this.longitude = longitude;
		this.latitude = latitude;
		this.localite = localite;
	}

	public String getCodeMonument() {
		return codeMonument;
	}

	public void setCodeMonument(String codeMonument) {
		this.codeMonument = codeMonument;
	}

	public String getNomMonument() {
		return nomMonument;
	}

	public void setNomMonument(String nomMonument) {
		this.nomMonument = nomMonument;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getTypeMonument() {
		return typeMonument;
	}

	public void setTypeMonument(String typeMonument) {
		this.typeMonument = typeMonument;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public Collection<Celebrite> getCelebrite() {
		return celebrite;
	}

	public void setCelebrite(Collection<Celebrite> celebrite) {
		this.celebrite = celebrite;
	}

	public Lieu getLocalite() {
		return localite;
	}

	public void setLocalite(Lieu localite) {
		this.localite = localite;
	}
	

}
