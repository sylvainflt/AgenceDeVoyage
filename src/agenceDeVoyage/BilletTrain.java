package agenceDeVoyage;

public class BilletTrain extends Billet{

	public BilletTrain(String depart, String destination, int nbkilometres, int nbPersonnes, int pourcentReduc) {
		super(depart, destination, nbkilometres, nbPersonnes, pourcentReduc);
	}

	@Override
	double calculPrix() {
		
		double prix = 0.1 * nbkilometres * (1-pourcentReduc*0.01) * nbPersonnes;
		
		return prix;
	}
				
	@Override
	public String toString() {
		return "Reservation de train\nDepart: "+depart
				+" - Arrivee : "+destination
				+" - Distance : "+nbkilometres
				+"\nNbre de places : "+nbPersonnes
				+" - Reduction : "+pourcentReduc+"%\n\t\t\tPrix : "
				+calculPrix()+" euros\n";
	}

}
