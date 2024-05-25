package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo10 {
	
	
	public static int checkObietTreLupi(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.lupo);
		punti = (cont/3)*2;
	 
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}