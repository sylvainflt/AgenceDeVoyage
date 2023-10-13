package agenceDeVoyage;

import java.util.List;
import java.util.Vector;

public class Voyage {

	private String nom;
	
	private String prenom;
	
	private List<Billet> billets;
	
	private int maxBillets = 10;

	public Voyage(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		billets = new Vector<Billet>();
	}
	
	public void ajouterReservationTrain(String depart, String destination, int nbkilometres, int nbPersonnes, int pourcentReduc) {
		if(billets.size()<maxBillets) {
			billets.add(new BilletTrain(depart, destination, nbkilometres, nbPersonnes, pourcentReduc));
		}else {
			System.out.println("Le nombre maximum de billets pour un voyage est atteint.");
		}		
	}
	public void ajouterReservationAvion(String depart, String destination, int nbkilometres, int nbPersonnes, int pourcentReduc) {
		if(billets.size()<maxBillets) {
			billets.add(new BilletAvion(depart, destination, nbkilometres, nbPersonnes, pourcentReduc));
		}else {
			System.out.println("Le nombre maximum de billets pour un voyage est atteint.");
		}		
	}
	public String toString() {
		String s = "Voyage de "+prenom+" "+nom+"\n";
		double total = 0;
		for(Billet b : billets) {
			s += b;
			total += b.calculPrix();
		}
		s+="Total : "+total+" euros\n";
		return s;
	}
	
}
