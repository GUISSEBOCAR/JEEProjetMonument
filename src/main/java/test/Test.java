package test;

import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;
import org.projet.m2.metier.IProjetMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
		IProjetMetier metier =(IProjetMetier) context.getBean("metier");
		/*
		 * Departement d1=new Departement("75", "Paris", "Seine", "Ile de france");
		 * Departement d2=new Departement("93", "bobigny", "Seine-Saint-Denis",
		 * "Ile de france"); metier.addDepartement(d1); metier.addDepartement(d2);
		 * 
		 * Celebrite c1 = new Celebrite("Mohamed", "Djiato", "Niger", "Moderne");
		 * Celebrite c2 = new Celebrite("Nidal", "Békkali", "Maroc", "Moderne");
		 * metier.addCelebrite(c1); metier.addCelebrite(c2);
		 * 
		 * Lieu l1 = new Lieu("75000", "Paris", 1.0f, 1.0f, d1); Lieu l2 = new
		 * Lieu("93000", "Bobigny", 1.0f, 1.0f, d2); metier.addLieu(l1);
		 * metier.addLieu(l2);
		 * 
		 * Monument m1 = new Monument("codeM4", "tour eiffel", "Mairie de paris",
		 * "Ediffice", 1.0f, 1.0f, l1); Monument m2 = new Monument("codeM5",
		 * "Musée de l'air et de l'espace", "Mairie de bobigny", "Musée", 1.0f, 1.0f,
		 * l2); metier.addMonumement(m1); metier.addMonumement(m2);
		 */
		//metier.AssocieCelebriteAMonument("codeM1", 1);
		//metier.AssocieCelebriteAMonument("codeM2", 2);
		
		
		
		
		
		
	
		

	}

}
