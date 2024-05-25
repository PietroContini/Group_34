package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo12 {
	
	
	public static int checkObietTreFoglie(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.foglia);
		punti = (cont/3)*2;
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}