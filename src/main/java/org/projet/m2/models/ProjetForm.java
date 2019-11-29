package org.projet.m2.models;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;

public class ProjetForm {
	//gestion departement
	@NotEmpty
	@Size(min=2,max=3)
	private  String numDepartement;
	private Departement departement;
	private List<Lieu> lieu;
	//gesttion ajout et supprimer departement
		private String ajoutOuSupDept;
		private String chefLieu;
		private String  nomDepartement;
		private String region;
		private String DepAttache;
		private String valider;
	
	// gestion Lieu
	
	private Lieu lieu2;
	//@NotEmpty
	//@Size(min=4, max=10)
	private String codeInsee;
	private String nomCommune;
	private float logitude;
	private float latitude;
	private List<Monument> monument;
	//gesttion ajout et supprimer Lieu
	private String ajoutOuSupLieu;
	private String validerLieu;
	
	
	//gestion Monument*
	private Monument monument2;
	private String codeMonument;
	private String nomMonument;
	private String proprietaire;
	private String typeMonument;
	private float longitude;
	
	private List<Celebrite> celebrite;
	
	// calcul distance
	private String monumentA;
	private String monumentB;
	private double distance;
	private String distanceMonument;
	
	
	// gesttion ajout et supprimer Lieu
	private String ajoutOuSupMonument;
	private String validerMonument;
	
	
	//getstion Célébrité
	private Celebrite celebrite2;
	private Integer numCelebrite;
	private String nom;
	private String prenom;
	private String nationalite;
	private String epoque;
	//gesttion ajout et supprimer Lieu
		private String ajoutOuSupCelebrite;
		private String validerCelebrite;
	
	
	
	

	public List<Lieu> getLieu() {
		return lieu;
	}
	public void setLieu(List<Lieu> lieu) {
		this.lieu = lieu;
	}
	private String exception;
	
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getNumDepartement() {
		return numDepartement;
	}
	public void setNumDepartement(String numDepartement) {
		this.numDepartement = numDepartement;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public String getAjoutOuSupDept() {
		return ajoutOuSupDept;
	}
	public void setAjoutOuSupDept(String ajoutOuSupDept) {
		this.ajoutOuSupDept = ajoutOuSupDept;
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
	public String getValider() {
		return valider;
	}
	public void setValider(String valider) {
		this.valider = valider;
	}
	public Lieu getLieu2() {
		return lieu2;
	}
	public void setLieu2(Lieu lieu2) {
		this.lieu2 = lieu2;
	}
	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	public List<Monument> getMonument() {
		return monument;
	}
	public void setMonument(List<Monument> monument) {
		this.monument = monument;
	}
	public String getAjoutOuSupLieu() {
		return ajoutOuSupLieu;
	}
	public void setAjoutOuSupLieu(String ajoutOuSupLieu) {
		this.ajoutOuSupLieu = ajoutOuSupLieu;
	}
	public String getValiderLieu() {
		return validerLieu;
	}
	public void setValiderLieu(String validerLieu) {
		this.validerLieu = validerLieu;
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
	public String getDepAttache() {
		return DepAttache;
	}
	public void setDepAttache(String depAttache) {
		DepAttache = depAttache;
	}
	public Monument getMonument2() {
		return monument2;
	}
	public void setMonument2(Monument monument2) {
		this.monument2 = monument2;
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
	public List<Celebrite> getCelebrite() {
		return celebrite;
	}
	public void setCelebrite(List<Celebrite> celebrite) {
		this.celebrite = celebrite;
	}
	public String getAjoutOuSupMonument() {
		return ajoutOuSupMonument;
	}
	public void setAjoutOuSupMonument(String ajoutOuSupMonument) {
		this.ajoutOuSupMonument = ajoutOuSupMonument;
	}
	public String getValiderMonument() {
		return validerMonument;
	}
	public void setValiderMonument(String validerMonument) {
		this.validerMonument = validerMonument;
	}
	public Celebrite getCelebrite2() {
		return celebrite2;
	}
	public void setCelebrite2(Celebrite celebrite2) {
		this.celebrite2 = celebrite2;
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
	public String getAjoutOuSupCelebrite() {
		return ajoutOuSupCelebrite;
	}
	public void setAjoutOuSupCelebrite(String ajoutOuSupCelebrite) {
		this.ajoutOuSupCelebrite = ajoutOuSupCelebrite;
	}
	public String getValiderCelebrite() {
		return validerCelebrite;
	}
	public void setValiderCelebrite(String validerCelebrite) {
		this.validerCelebrite = validerCelebrite;
	}
	public String getMonumentA() {
		return monumentA;
	}
	public void setMonumentA(String monumentA) {
		this.monumentA = monumentA;
	}
	public String getMonumentB() {
		return monumentB;
	}
	public void setMonumentB(String monumentB) {
		this.monumentB = monumentB;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	
}
