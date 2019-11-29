package org.projet.m2.metier;

import java.util.Collection;
import java.util.List;

import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;

public interface IProjetMetier {
	
	public Departement consulterDepartement(String numDepartement);
	public Monument consulterMonument(String codeMonument);
	public Celebrite consulterCelebrite (Integer numCelebrite);
	public Lieu consulterLieu (String codeInsee);
	
	
	public Departement addDepartement(Departement d);
	public Monument addMonumement(Monument m);
	public Celebrite addCelebrite(Celebrite c);
	public Lieu addLieu(Lieu l);
	
	public List<Departement> getListDepartement();
	public List<Monument> getListMonument(String codeInsee);
	public List<Celebrite> getListCelebrite(String codeMonument );
	public List<Lieu> getListLieu(String numDepartement);
	// récuperation de la collection des monument associé à une célébrité
	public List<Monument> getListMonument(Integer numCelebrite );

	
	public void deleteDepartement(String numDepartement);
	public void deleteMonumenent(String nomMonument);
	public void deleteCelebrite(Integer numCelebrite);
	public void deleteLieu(String codeInsee);
	
	public double getDistanceBetweenMonument(String codeMonumentA, String codeMonumentB);
	public List<Monument> getListMonumentByDepartement(String nomDepartement);
	public List<Lieu> getListMonumentByLieu(String nomCommune);
	
	public void addMonumentToLieu(String codeMonument, String codeInsee);
	
	public void AssocieCelebriteAMonument(String codeMonument, Integer numCelebrite);
	
	

}
