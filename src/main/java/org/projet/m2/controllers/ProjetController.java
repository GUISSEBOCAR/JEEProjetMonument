package org.projet.m2.controllers;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.engine.profile.Association;
import org.projet.m2.entities.Celebrite;
import org.projet.m2.entities.Departement;
import org.projet.m2.entities.Lieu;
import org.projet.m2.entities.Monument;
import org.projet.m2.metier.IProjetMetier;
import org.projet.m2.models.ProjetForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjetController {
	@Autowired
	private IProjetMetier metier;
	
	@RequestMapping(value="/acceuil")
	public String acceuil() {
		return "home";
	}
	
	@RequestMapping(value="/departement")
	public String departement(Model model){
		model.addAttribute("projetForm", new ProjetForm());
		return "departement";
	}
	@RequestMapping(value="/recherchesdep")
	public String rechercheDep(@Valid ProjetForm pf ,BindingResult bindingResult,
			Model model){
		if (bindingResult.hasErrors()) {
			return "departement";
			
		}
		try {
			Departement dep = metier.consulterDepartement(pf.getNumDepartement());
			pf.setDepartement(dep);
			List<Lieu> l=metier.getListLieu(pf.getNumDepartement());
			pf.setLieu(l);
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		model.addAttribute("projetForm", pf);
		return "departement";
		
	}
	
	@RequestMapping(value="/ajoutOuSupDept")
	public String ajoutSup(@Valid ProjetForm pf, BindingResult bindingResult) {
		/*
		 * if (bindingResult.hasErrors()) { return "departement";}
		 */
		if (pf.getValider()!=null) {
		if (pf.getAjoutOuSupDept().equals("ajout")){
			metier.addDepartement(new Departement(pf.getNumDepartement(), pf.getChefLieu(), 
													pf.getNomDepartement(), pf.getRegion()));
			
		}
		
		else if (pf.getAjoutOuSupDept().equals("supprime")){
			metier.deleteDepartement(pf.getNumDepartement());
		}
			
		}
		try {
			Departement dep = metier.consulterDepartement(pf.getNumDepartement());
			pf.setDepartement(dep);
			List<Lieu> l=metier.getListLieu(pf.getNumDepartement());
			pf.setLieu(l);
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		return "departement";
		
	}
	
	@RequestMapping(value="/lieu")
	public String lieu(Model model){
		model.addAttribute("projetForm", new ProjetForm());
		return "lieu";
	}
	
	@RequestMapping(value="/rechercheslieu")
	public String rechercheLieu(ProjetForm pf ,Model model){
		try {
			Lieu li = metier.consulterLieu(pf.getCodeInsee());
			pf.setLieu2(li);
			List<Monument> m=metier.getListMonument(pf.getCodeInsee());
			pf.setMonument(m);
			
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		model.addAttribute("projetForme", pf);
			return "lieu";
			
		}
	
	@RequestMapping(value="/ajoutOuSupLieu")
	public String ajoutSuplieu(@Valid ProjetForm pf, BindingResult bindingResult) {
		/*
		 * if (bindingResult.hasErrors()) { return "departement";}
		 */
		if (pf.getValiderLieu()!=null) {
		if (pf.getAjoutOuSupLieu().equals("ajoutLieu")){
			metier.addLieu(new Lieu(pf.getCodeInsee(), pf.getNomCommune(), pf.getLogitude(), 
					pf.getLatitude(), pf.getLieu2().getDept()));
			
		}
		
		else if (pf.getAjoutOuSupLieu().equals("supprimeLieu")){
			metier.deleteLieu(pf.getCodeInsee());
		}
			
		}
		try {
			
			Lieu li = metier.consulterLieu(pf.getCodeInsee());
			pf.setLieu2(li);
			List<Monument> m=metier.getListMonument(pf.getCodeInsee());
			pf.setMonument(m);
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		return "lieu";
		
	}
	
	@RequestMapping(value="/monument")
	public String monument(Model model){
		model.addAttribute("projetForm", new ProjetForm());
		return "monument";
		
	}
	@RequestMapping(value="/recherchesmonument")
	public String rechercheMonument(ProjetForm pf ,Model model){
		try {
			Monument mo = metier.consulterMonument(pf.getCodeMonument());
			pf.setMonument2(mo);
			List<Celebrite> c=metier.getListCelebrite(pf.getCodeMonument());
			pf.setCelebrite(c);
			
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		model.addAttribute("projetForme", pf);
			return "monument";
			
		}
	
	@RequestMapping(value="/ajoutOuSupMonument")
	public String ajoutSupmonument(@Valid ProjetForm pf, BindingResult bindingResult) {
		/*
		 * if (bindingResult.hasErrors()) { return "departement";}
		 */
		if (pf.getValiderMonument()!=null) {
		if (pf.getAjoutOuSupMonument().equals("ajoutMonument")){
			metier.addMonumement(new Monument(pf.getCodeMonument(), pf.getNomMonument(),pf.getProprietaire() ,pf.getTypeMonument() ,
												pf.getLongitude() , pf.getLatitude() ,pf.getMonument2().getLocalite()));
			
			
		}
		
		else if (pf.getAjoutOuSupMonument().equals("supprimeMonument")){
			metier.deleteMonumenent(pf.getCodeMonument());
		}
			
		}
		try {
			
			Monument m = metier.consulterMonument(pf.getCodeMonument());
			pf.setMonument2(m);
			List<Celebrite> c=metier.getListCelebrite(pf.getCodeMonument());
			pf.setCelebrite(c);
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		return "monument";
		
	}
	
	@RequestMapping(value="/distanceMonument")
	public String distanceEntreMonument (ProjetForm pf ,Model model){
		double distance =metier.getDistanceBetweenMonument(pf.getMonumentA(),pf.getMonumentB());
		
		return "monument";
	}
	
	@RequestMapping(value="/celebrite")
	public String celebrite(Model model){
		model.addAttribute("projetForm", new ProjetForm());
		return "celebrite";
	}
	
	
		
	
	@RequestMapping(value="/recherchescelebrite")
	public String rechercheCelebrite(ProjetForm pf ,Model model){
		try {
			Celebrite c = metier.consulterCelebrite(pf.getNumCelebrite());
			pf.setCelebrite2(c);
			List<Monument> m=metier.getListMonument(pf.getNumCelebrite());
			pf.setMonument(m);
			
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		model.addAttribute("projetForme", pf);
			return "celebrite";
			
		}
	
	@RequestMapping(value="/ajoutOuSupCelebrite")
	public String ajoutSupcelebrite(@Valid ProjetForm pf, BindingResult bindingResult) {
		/*
		 * if (bindingResult.hasErrors()) { return "departement";}
		 */
		if (pf.getValiderCelebrite()!=null) {
		if (pf.getAjoutOuSupCelebrite().equals("ajoutCelebrite")){
			
			metier.addCelebrite(new Celebrite(pf.getNom(), pf.getPrenom(), pf.getNationalite() , pf.getEpoque()));
			
			
		}
		
		else if (pf.getAjoutOuSupCelebrite().equals("supprimeCelebrite")){
			metier.deleteCelebrite(pf.getNumCelebrite());
		}
		
		else if(pf.getAjoutOuSupCelebrite().equals("associeA")) {
			metier.AssocieCelebriteAMonument( pf.getMonument2().getCodeMonument() , pf.getCelebrite2().getNumCelebrite());
		}
			
		}
		try {
			
			Celebrite c = metier.consulterCelebrite(pf.getNumCelebrite());
			pf.setCelebrite2(c);
			List<Monument> m=metier.getListMonument(pf.getNumCelebrite());
			pf.setMonument(m);
		} catch (Exception e) {
			pf.setException(e.getMessage());
		}
		
		return "celebrite";
		
	}
	
	
	}
	
	
	
	

