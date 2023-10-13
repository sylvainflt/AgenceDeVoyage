package agenceDeVoyage;

public class DemoAgence {

	public static void main(String[] args) {

		Voyage tourDuMonde = new Voyage("Foucault", "Sylvain");
		
		tourDuMonde.ajouterReservationTrain("Lille","Etaples",150,1,50);
		
		tourDuMonde.ajouterReservationTrain("Etaples","Paris",300,1,50);
		
		tourDuMonde.ajouterReservationAvion("Paris","Sydney",15000,1,10);
		
		tourDuMonde.ajouterReservationAvion("Sydney","Bangkok",5000,2,20);
		
		tourDuMonde.ajouterReservationAvion("Bangkok","Delhi",2500,2,0);
		
		tourDuMonde.ajouterReservationAvion("Delhi","Pekin",6000,2,25);
		
		tourDuMonde.ajouterReservationTrain("Pekin","Tokyo",4000,2,10);
		
		tourDuMonde.ajouterReservationAvion("Tokyo","Papete",8000,2,15);
		
		tourDuMonde.ajouterReservationAvion("Papete","NewYork",13000,2,0);
		
		tourDuMonde.ajouterReservationTrain("NewYork","Mexico",18000,2,30);
		
		tourDuMonde.ajouterReservationAvion("Mexico","Paris",15000,2,10);
		
		System.out.println(tourDuMonde);
	}

}
