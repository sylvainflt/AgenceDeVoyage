package agenceDeVoyage;

public abstract class Billet {

	protected String depart;
	protected String destination;
	protected int nbkilometres;
	protected int nbPersonnes;
	protected int pourcentReduc;
	
	public Billet(String depart, String destination, int nbkilometres, int nbPersonnes, int pourcentReduc) {
		super();
		this.depart = depart;
		this.destination = destination;
		this.nbkilometres = nbkilometres;
		this.nbPersonnes = nbPersonnes;
		this.pourcentReduc = pourcentReduc;
	}

	public String toString() {
		return "le billet au depart de "+depart+" et à destination de "+destination
				+" parcourt "+nbkilometres+"kilomètres pour "+nbPersonnes
				+" personne(s), tarif reduit : "+pourcentReduc+"%";
	}
	
	abstract double calculPrix();
	
}
