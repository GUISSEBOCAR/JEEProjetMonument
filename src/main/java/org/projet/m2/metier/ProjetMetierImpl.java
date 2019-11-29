package org.projet.m2.metier;

import java.util.Collection;
import java.util.List;

import org.projet.m2.dao.IProjetDao;
import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class ProjetMetierImpl implements IProjetMetier {
	
	private IProjetDao dao;
	
	

	public void setDao(IProjetDao dao) {
		this.dao = dao;
	}

	@Override
	public Departement consulterDepartement(String numDepartement) {
		// TODO Auto-generated method stub
		return dao.consulterDepartement(numDepartement);
	}

	@Override
	public Monument consulterMonument(String nomMonument) {
		// TODO Auto-generated method stub
		return dao.consulterMonument(nomMonument);
	}

	@Override
	public Celebrite consulterCelebrite(Integer numCelebrite) {
		// TODO Auto-generated method stub
		return dao.consulterCelebrite(numCelebrite);
	}

	@Override
	public Lieu consulterLieu(String codeInsee) {
		// TODO Auto-generated method stub
		return dao.consulterLieu(codeInsee);
	}

	@Override
	public Departement addDepartement(Departement d) {
		// TODO Auto-generated method stub
		return dao.addDepartement(d);
	}

	@Override
	public Monument addMonumement(Monument m) {
		// TODO Auto-generated method stub
		return dao.addMonumement(m);
	}

	@Override
	public Celebrite addCelebrite(Celebrite c) {
		// TODO Auto-generated method stub
		return dao.addCelebrite(c);
	}

	@Override
	public Lieu addLieu(Lieu l) {
		// TODO Auto-generated method stub
		return dao.addLieu(l);
	}

	@Override
	public List<Departement> getListDepartement() {
		// TODO Auto-generated method stub
		return dao.getListDepartement();
	}

	@Override
	public List<Monument> getListMonument(String codeInsee) {
		// TODO Auto-generated method stub
		return dao.getListMonument(codeInsee);
	}

	@Override
	public List<Celebrite> getListCelebrite(String codeMonument) {
		// TODO Auto-generated method stub
		return dao.getListCelebrite(codeMonument );
	}

	@Override
	public List<Lieu> getListLieu(String numDepartement ) {
		// TODO Auto-generated method stub
		return dao.getListLieu(numDepartement);
	}

	@Override
	public void deleteDepartement(String numDepartement) {
		// TODO Auto-generated method stub
		dao.deleteDepartement(numDepartement);
	}

	@Override
	public void deleteMonumenent(String codeMonument) {
		// TODO Auto-generated method stub
		dao.deleteMonumenent(codeMonument);
	}

	@Override
	public void deleteCelebrite(Integer numCelebrite) {
		// TODO Auto-generated method stub
		dao.deleteCelebrite(numCelebrite);
	}

	@Override
	public void deleteLieu(String codeInsee) {
		// TODO Auto-generated method stub
		dao.deleteLieu(codeInsee);
	}

	@Override
	public double getDistanceBetweenMonument(String codeMonumentA, String codeMonumentB) {
		// TODO Auto-generated method stub
		return dao.getDistanceBetweenMonument(codeMonumentA, codeMonumentB);
	}

	@Override
	public List<Monument> getListMonumentByDepartement(String nomDepartement) {
		// TODO Auto-generated method stub
		return dao.getListMonumentByDepartement(nomDepartement);
	}

	@Override
	public List<Lieu> getListMonumentByLieu(String nomCommune) {
		// TODO Auto-generated method stub
		return dao.getListMonumentByLieu(nomCommune);
	}

	@Override
	public void addMonumentToLieu(String codeMonument, String codeInsee) {
		// TODO Auto-generated method stub
		dao.addMonumentToLieu(codeMonument, codeInsee);
	}

	@Override
	public void AssocieCelebriteAMonument(String codeMonument, Integer numCelebrite) {
		// TODO Auto-generated method stub
		dao.AssocieCelebriteAMonument(codeMonument, numCelebrite);
	}

	@Override
	public List<Monument> getListMonument(Integer numCelebrite) {
		return dao.getListMonument(numCelebrite);
		 
	}

	

}
