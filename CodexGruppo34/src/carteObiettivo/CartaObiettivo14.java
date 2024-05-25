package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo14 {
	
	
	public static int checkObietDuePergamene(Giocatore a) {
		
	 int punti = 0;
	 
	 int cont = a.ricercaRisorsa(Risorsa.pergamena);
		punti = (cont/2)*2; //tolgo caso dispari
	 
	 return punti;
	}
	
	public static void stampaCarta() {
		   
	}
}