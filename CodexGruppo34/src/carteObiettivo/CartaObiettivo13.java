package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo13 {
	
	
	public static int checkObietDuePiume(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.piuma);
		punti = (cont/2)*2; //tolgo caso dispari
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}