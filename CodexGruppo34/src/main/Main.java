package main;

import java.io.IOException;
import java.util.ArrayList;

import componentiGioco.Angolo;
import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;
import componentiGioco.Colore;
import componentiGioco.Posizione;
import componentiGioco.Risorsa;
import componentiGioco.TipoIni;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;
import gestioneGioco.Partita;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Angolo	angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		Angolo	angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		Angolo	angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		Angolo  angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
			
		
		CartaIniziale cartaIni2 = new CartaIniziale("id.I2",angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni2);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista6 = new ArrayList<Risorsa> ();
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.farfalla);
		CartaOro carta6oro = new CartaOro ("id.O6",angolo1,angolo2,angolo3,angolo4,lista6,2,Risorsa.vuoto,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta4risorsa = new CartaRisorsa("id.R4",angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
		
		Manoscritto m = new Manoscritto();
		m.piazzaCarta(carta6oro, 45, 45);
		m.piazzaCarta(carta4risorsa, 47, 45);
		Partita par = new Partita();
		
		
		Giocatore giocatore = new Giocatore(m,"pietro");
		
		giocatore.piazzaCarta(par, carta4risorsa, 45, 47);
		giocatore.piazzaCarta(par, carta6oro, 45, 45);
		giocatore.piazzaCarta(par, cartaIni2, 46, 46);
		//giocatore.movimentoSuMatrice();
		
		//par.stampaCarteTavolo();
		
		
		
	
	}

	  
	
	
}
