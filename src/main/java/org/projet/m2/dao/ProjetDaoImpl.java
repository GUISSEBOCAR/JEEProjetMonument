package org.projet.m2.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;

public class ProjetDaoImpl implements IProjetDao {
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Departement consulterDepartement(String numDepartement) {
		Departement dep = em.find(Departement.class, numDepartement);
		if (dep ==null) throw new RuntimeException("ce departement ne figure pas dans notre Base!!!");
		return dep;
	}

	@Override
	public Monument consulterMonument(String codeMonument) {
		Monument monument = em.find(Monument.class, codeMonument);
		if (monument ==null) throw new RuntimeException("ce monument ne figure pas dans notre Base!!!");
		return monument;
	}

	@Override
	public Celebrite consulterCelebrite(Integer numCelebrite) {
		Celebrite cel = em.find(Celebrite.class, numCelebrite);
		if (cel ==null) throw new RuntimeException(" ne figure pas dans notre Base!!!");
		return cel;
	}

	@Override
	public Lieu consulterLieu(String codeInsee) {
		Lieu l = em.find(Lieu.class, codeInsee);
		if (l ==null) throw new RuntimeException("ce lieu ne figure pas dans notre Base!!!");
		return l;
	}

	@Override
	public Departement addDepartement(Departement d) {
		em.persist(d);
		return d;
	}

	@Override
	public Monument addMonumement(Monument m) {
		em.persist(m);
		return m;
	}

	@Override
	public Celebrite addCelebrite(Celebrite c) {
		em.persist(c);
		return c;
	}

	@Override
	public Lieu addLieu(Lieu l) {
		em.persist(l);		
		return l;
	}

	@Override
	public List<Departement> getListDepartement() {
		Query req = em.createQuery("select d from Departement");
		return req.getResultList();
	}

	@Override
	public List<Monument> getListMonument(String codeInsee) {
		Query req = em.createQuery("select m from Monument m where m.localite.codeInsee=:x");
		req.setParameter("x", codeInsee);
		return req.getResultList();
	}

	@Override
	public List<Celebrite> getListCelebrite(String codeMonument ) {
		Query req = em.createQuery("select c from Celebrite c where c.monument.codeMonument=:x");
		req.setParameter("x",codeMonument );
		return req.getResultList();
	}

	@Override
	public List<Lieu> getListLieu(String numDepartement) {
		Query req = em.createQuery("select l from Lieu l where l.dept.numDepartement=:x");
		req.setParameter("x", numDepartement);
		return req.getResultList();
	}

	@Override
	public void deleteDepartement(String numDepartement) {
		Departement d=em.find(Departement.class, numDepartement);
		em.remove(d);
		
	}

	@Override
	public void deleteMonumenent(String codeMonument) {
		Monument m=em.find(Monument.class, codeMonument);
		em.remove(m);
	}

	@Override
	public void deleteCelebrite(Integer numCelebrite) {
		Celebrite c=em.find(Celebrite.class, numCelebrite);
		em.remove(c);
		
	}

	@Override
	public void deleteLieu(String codeInsee) {
		Lieu l=em.find(Lieu.class, codeInsee);
		em.remove(l);
		
	}

	@Override
	public double getDistanceBetweenMonument(String codeMonumentA, String codeMonumentB) {
		double distance =  0;
		double a = 111.16;
		//String[] parts = monumentA.split(",");
		Monument mA=em.find(Monument.class, codeMonumentA);
		Monument mB=em.find(Monument.class, codeMonumentB);
		double dLong = mA.getLongitude()-mB.getLongitude();
		double dLat = mA.getLatitude()-mB.getLatitude();
		
		distance =Math.sqrt((dLong*dLat)+(dLat*dLat))*a;
		
		return distance;
	}

	@Override
	public List<Monument> getListMonumentByDepartement(String nomDepartement) {
		Query req=em.createQuery("select m from Monument m where m.nomDepartement=:x");
		req.setParameter("x", nomDepartement);
		
		return req.getResultList();
	}

	@Override
	public List<Lieu> getListMonumentByLieu(String nomCommune) {
		Query req=em.createQuery("select l from Lieu m where l.localilite.nomCommune=:x");
		req.setParameter("x", nomCommune);
		
		return req.getResultList();
	}

	@Override
	public void addMonumentToLieu(String codeMonument, String codeInsee) {
		Monument m=em.find(Monument.class,codeMonument);
		Lieu l=em.find(Lieu.class,codeInsee);
		
		l.getMonument().add(m);
		
		
	}

	@Override
	public void AssocieCelebriteAMonument(String codeMonument, Integer numCelebrite) {
		Monument m=em.find(Monument.class, codeMonument);
		Celebrite c=em.find(Celebrite.class, numCelebrite );
		c.getMonument().add(m);
		m.getCelebrite().add(c);
		
		
		
	}

	@Override
	public List<Monument> getListMonument(Integer numCelebrite) {
		Query req=em.createQuery("select m from Monument m where m.celebrite.numCelebrite=:x");
		//Query req = em.createQuery("select m from Monument m FETCH JOIN m.celebrite where m.celebrite.numCelebrite=:x");
		req.setParameter("x", numCelebrite );
		return req.getResultList();		
		
	}

	
	

}
