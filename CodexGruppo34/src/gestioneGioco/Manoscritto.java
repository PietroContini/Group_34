package gestioneGioco;

import componentiGioco.Carta;

public class Manoscritto {

	private Carta [][] carteManoscritto = new Carta [90][90];
	
	public Manoscritto() {
		
	}
	
	public Carta getCarta(int x,int y) {
		
		Carta f = carteManoscritto[x][y];
		return f;
		
		
	}
	
}
