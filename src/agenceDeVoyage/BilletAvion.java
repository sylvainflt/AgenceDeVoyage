package agenceDeVoyage;

public class BilletAvion extends Billet {

	public BilletAvion(String depart, String destination, int nbkilometres, int nbPersonnes, int pourcentReduc) {
		super(depart, destination, nbkilometres, nbPersonnes, pourcentReduc);
	}

	@Override
	double calculPrix() {
		
		double prix = (0.2 * nbkilometres + 20) * (1-pourcentReduc*0.01) * nbPersonnes;
		
		return prix;
	}
	@Override
	public String toString() {
		return "Reservation d'avion\nDepart: "+depart
				+" - Arrivee : "+destination
				+" - Distance : "+nbkilometres
				+"\nNbre de places : "+nbPersonnes
				+" - Reduction : "+pourcentReduc+"%\n\t\t\tPrix : "
				+calculPrix()+" euros\n";
	}

}
