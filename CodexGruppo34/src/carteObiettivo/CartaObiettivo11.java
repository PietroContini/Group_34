package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo11 {
	
	
	public static int checkObietTreFarfalle(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.farfalla);
		punti = (cont/3)*2;
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}