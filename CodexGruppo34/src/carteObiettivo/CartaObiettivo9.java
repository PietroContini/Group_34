package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo9 {
	
	
	public static int checkObietTreFunghi(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.fungo);
		punti = (cont/3)*2;
	 
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}
	
