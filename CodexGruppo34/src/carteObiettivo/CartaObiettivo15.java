package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo15 {
	
	
	public static int checkObietDueBoccette(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.boccetta);
		punti = (cont/2)*2; //tolgo caso dispari
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}