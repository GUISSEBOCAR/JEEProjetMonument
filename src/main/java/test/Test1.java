package test;

import java.util.List;

import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;
import org.projet.m2.metier.IProjetMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		IProjetMetier metier =(IProjetMetier) context.getBean("metier");
		
		Departement dep=metier.consulterDepartement("34");
		
		System.out.println("chefLieu: "+dep.getChefLieu());
		System.out.println("numeDep: "+dep.getNumDepartement());
		System.out.println("Region: "+dep.getRegion());
		System.out.println("nom dep: "+dep.getNomDepartement());
		
		
		Monument m=metier.consulterMonument("codeM1");
		System.out.println("Code: "+m.getCodeMonument());
		
		Celebrite c=metier.consulterCelebrite(1);
		System.out.println("nom: "+c.getNom());
		
		
		System.out.println(metier.getDistanceBetweenMonument("CodeM1", "codeM4"));
		
		
		
		
		

	}

}
