package main;

import java.util.ArrayList;

import componentiGioco.Angolo;
import componentiGioco.Carta;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;
import componentiGioco.Posizione;
import componentiGioco.Risorsa;

public class Main {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
    
		
	    Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta1risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.piuma);
		ArrayList<Risorsa> lista = new ArrayList<> ();
		lista.add(Risorsa.fungo);
		lista.add(Risorsa.fungo);
		lista.add(Risorsa.lupo);
		CartaOro carta1oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista,1,Risorsa.piuma);
	}

}
