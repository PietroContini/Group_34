package carteObiettivo;


import java.util.Arrays;
import java.util.Collections;

import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo16 {
	
	
	public static int checkObietTreDiversi(Giocatore a) {
		
	 int punti = 0;
	 
	 Integer [] x = {a.ricercaRisorsa(Risorsa.boccetta),a.ricercaRisorsa(Risorsa.pergamena),a.ricercaRisorsa(Risorsa.piuma),
				a.ricercaRisorsa(Risorsa.foglia),a.ricercaRisorsa(Risorsa.farfalla),a.ricercaRisorsa(Risorsa.lupo),a.ricercaRisorsa(Risorsa.fungo)};
		
		x = sortCrescente(x);
		
		int cont = 0;
		
		while(x[2]!=0 && x[3]!=0) {
			cont = cont + x[2];
			x[1] = x[1] - x[2];
			x[0] = x[0] - x[2];
			x[2] = 0;
			
			x = sortCrescente(x);
		}
		
		punti = cont * 3;
	
		return punti;

	}




	public static Integer[] sortCrescente(Integer [] x) {

		Arrays.sort(x,Collections.reverseOrder());

		return x;
	}
	
}