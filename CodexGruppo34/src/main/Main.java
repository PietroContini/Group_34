package main;

import java.util.ArrayList;

import componentiGioco.Angolo;
import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaObiettivoEn;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;
import componentiGioco.Colore;
import componentiGioco.Posizione;
import componentiGioco.Risorsa;
import componentiGioco.TipoIni;
import gestioneGioco.Mazzo;

public class Main {

	public static void Main(String[] args) {
    
		
	    //Creazione carte obiettivo
		
		CartaObiettivo cartaObiet1 = new CartaObiettivo(CartaObiettivoEn.COTriplaRossa);
		CartaObiettivo cartaObiet2 = new CartaObiettivo(CartaObiettivoEn.COTriplaVerde);
		CartaObiettivo cartaObiet3 = new CartaObiettivo(CartaObiettivoEn.COTriplaAzzurra);
		CartaObiettivo cartaObiet4 = new CartaObiettivo(CartaObiettivoEn.COTriplaViola);
		CartaObiettivo cartaObiet5 = new CartaObiettivo(CartaObiettivoEn.COFormaL);
		CartaObiettivo cartaObiet6 = new CartaObiettivo(CartaObiettivoEn.COFormaJ);
		CartaObiettivo cartaObiet7 = new CartaObiettivo(CartaObiettivoEn.COFormaR);
		CartaObiettivo cartaObiet8 = new CartaObiettivo(CartaObiettivoEn.COForma1);
	
		CartaObiettivo cartaObiet9 = new CartaObiettivo(CartaObiettivoEn.COTreFungo);
	
		CartaObiettivo cartaObiet10 = new CartaObiettivo(CartaObiettivoEn.COTreFoglia);
		
		CartaObiettivo cartaObiet11 = new CartaObiettivo(CartaObiettivoEn.COTreLupo);
	
		CartaObiettivo cartaObiet12 = new CartaObiettivo(CartaObiettivoEn.COTreFarfalla);
		
		CartaObiettivo cartaObiet13 = new CartaObiettivo(CartaObiettivoEn.COTreDiversi);
	
		CartaObiettivo cartaObiet14 = new CartaObiettivo(CartaObiettivoEn.CODuePergamena);
	
		CartaObiettivo cartaObiet15 = new CartaObiettivo(CartaObiettivoEn.CODueBoccetta);
		
		CartaObiettivo cartaObiet16 = new CartaObiettivo(CartaObiettivoEn.CODuePiuma);
		
		// Creazione carte iniziali front
		
		Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		
		
		CartaIniziale cartaIni1 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni1);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		
		
		CartaIniziale cartaIni2 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni2);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		
		
		CartaIniziale cartaIni3 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni3);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		
		
		CartaIniziale cartaIni4 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni4);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
	
		CartaIniziale cartaIni5 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni5);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
	
		
		CartaIniziale cartaIni6 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,TipoIni.CartaIni6);
		
		
		//Creazione carte iniziali retro
		/*
		
		Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> listaIni = new ArrayList<> ();
		listaIni.add(Risorsa.farfalla);
		
		CartaIniziale cartaIni1 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		listaIni.clear();
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		listaIni.add(Risorsa.fungo);
		
		CartaIniziale cartaIni2 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		listaIni.clear();
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		listaIni.add(Risorsa.foglia);
		listaIni.add(Risorsa.fungo);
		
		CartaIniziale cartaIni3 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		listaIni.clear();
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		listaIni.add(Risorsa.lupo);
		listaIni.add(Risorsa.farfalla);
		
		CartaIniziale cartaIni4 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		listaIni.clear();
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		listaIni.add(Risorsa.lupo);
		listaIni.add(Risorsa.farfalla);
		listaIni.add(Risorsa.foglia);
		
		CartaIniziale cartaIni5 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		listaIni.clear();
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		listaIni.add(Risorsa.foglia);
		listaIni.add(Risorsa.lupo);
		listaIni.add(Risorsa.fungo);
		
		CartaIniziale cartaIni6 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		listaIni.clear();
		
		*/
		
		// Creazione carte oro
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.piuma);
		ArrayList<Risorsa> lista1 = new ArrayList<> ();
		lista1.add(Risorsa.fungo);
		lista1.add(Risorsa.fungo);
		lista1.add(Risorsa.lupo);
		CartaOro carta1oro = new CartaOro ("id.O1",angolo1,angolo2,angolo3,angolo4,lista1,1,Risorsa.piuma,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.boccetta);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista2 = new ArrayList<> ();
		lista2.add(Risorsa.fungo);
		lista2.add(Risorsa.fungo);
		lista2.add(Risorsa.foglia);
		CartaOro carta2oro = new CartaOro ("id.O2",angolo1,angolo2,angolo3,angolo4,lista2,1,Risorsa.boccetta,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista3 = new ArrayList<> ();
		lista3.add(Risorsa.fungo);
		lista3.add(Risorsa.fungo);
		lista3.add(Risorsa.farfalla);
		CartaOro carta3oro = new CartaOro ("id.O3",angolo1,angolo2,angolo3,angolo4,lista3,1,Risorsa.pergamena,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);  
		angolo2 = new Angolo(Posizione.BassoSinistra,null);           
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista4 = new ArrayList<> ();
		lista4.add(Risorsa.fungo);
		lista4.add(Risorsa.fungo);
		lista4.add(Risorsa.fungo);
		lista4.add(Risorsa.lupo);
		CartaOro carta4oro = new CartaOro ("id.O4",angolo1,angolo2,angolo3,angolo4,lista4,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista5 = new ArrayList<> ();
		lista5.add(Risorsa.fungo);
		lista5.add(Risorsa.fungo);
		lista5.add(Risorsa.fungo);
		lista5.add(Risorsa.foglia);
		CartaOro carta5oro = new CartaOro ("id.O5",angolo1,angolo2,angolo3,angolo4,lista5,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista6 = new ArrayList<> ();
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.farfalla);
		CartaOro carta6oro = new CartaOro ("id.O6",angolo1,angolo2,angolo3,angolo4,lista6,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista7 = new ArrayList<> ();
		lista7.add(Risorsa.fungo);
		lista7.add(Risorsa.fungo);
		lista7.add(Risorsa.fungo);
		CartaOro carta7oro = new CartaOro ("id.O7",angolo1,angolo2,angolo3,angolo4,lista7,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.piuma);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista8 = new ArrayList<> ();
		lista8.add(Risorsa.fungo);
		lista8.add(Risorsa.fungo);
		lista8.add(Risorsa.fungo);
		CartaOro carta8oro = new CartaOro ("id.O8",angolo1,angolo2,angolo3,angolo4,lista8,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.pergamena);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista9 = new ArrayList<> ();
		lista9.add(Risorsa.fungo);
		lista9.add(Risorsa.fungo);
		lista9.add(Risorsa.fungo);
		CartaOro carta9oro = new CartaOro ("id.O9",angolo1,angolo2,angolo3,angolo4,lista9,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista10 = new ArrayList<> ();
		lista10.add(Risorsa.fungo);
		lista10.add(Risorsa.fungo);
		lista10.add(Risorsa.fungo);
		lista10.add(Risorsa.fungo);
		lista10.add(Risorsa.fungo);
		CartaOro carta10oro = new CartaOro ("id.O10",angolo1,angolo2,angolo3,angolo4,lista10,5,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.piuma);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista11 = new ArrayList<> ();
		lista11.add(Risorsa.foglia);
		lista11.add(Risorsa.foglia);
		lista11.add(Risorsa.farfalla);
		CartaOro carta11oro = new CartaOro ("id.O11",angolo1,angolo2,angolo3,angolo4,lista11,1,Risorsa.piuma,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.pergamena);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista12 = new ArrayList<> ();
		lista12.add(Risorsa.foglia);
		lista12.add(Risorsa.foglia);
		lista12.add(Risorsa.fungo);
		CartaOro carta12oro = new CartaOro ("id.O12",angolo1,angolo2,angolo3,angolo4,lista12,1,Risorsa.pergamena,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista13 = new ArrayList<> ();
		lista13.add(Risorsa.foglia);
		lista13.add(Risorsa.foglia);
		lista13.add(Risorsa.lupo);
		CartaOro carta13oro = new CartaOro ("id.O13",angolo1,angolo2,angolo3,angolo4,lista13,1,Risorsa.boccetta,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);            
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);   
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista14 = new ArrayList<> ();
		lista14.add(Risorsa.foglia);
		lista14.add(Risorsa.foglia);
		lista14.add(Risorsa.foglia);
		lista14.add(Risorsa.farfalla);
		CartaOro carta14oro = new CartaOro ("id.O14",angolo1,angolo2,angolo3,angolo4,lista14,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista15 = new ArrayList<> ();
		lista15.add(Risorsa.foglia);
		lista15.add(Risorsa.foglia);
		lista15.add(Risorsa.foglia);
		lista15.add(Risorsa.lupo);
		CartaOro carta15oro = new CartaOro ("id.O15",angolo1,angolo2,angolo3,angolo4,lista15,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista16 = new ArrayList<> ();
		lista16.add(Risorsa.foglia);
		lista16.add(Risorsa.foglia);
		lista16.add(Risorsa.foglia);
		lista16.add(Risorsa.fungo);
		CartaOro carta16oro = new CartaOro ("id.O16",angolo1,angolo2,angolo3,angolo4,lista16,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista17 = new ArrayList<> ();
		lista17.add(Risorsa.foglia);
		lista17.add(Risorsa.foglia);
		lista17.add(Risorsa.foglia);
		CartaOro carta17oro = new CartaOro ("id.O17",angolo1,angolo2,angolo3,angolo4,lista17,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista18 = new ArrayList<> ();
		lista18.add(Risorsa.foglia);
		lista18.add(Risorsa.foglia);
		lista18.add(Risorsa.foglia);
		CartaOro carta18oro = new CartaOro ("id.O18",angolo1,angolo2,angolo3,angolo4,lista18,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.boccetta);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista19 = new ArrayList<> ();
		lista19.add(Risorsa.foglia);
		lista19.add(Risorsa.foglia);
		lista19.add(Risorsa.foglia);
		CartaOro carta19oro = new CartaOro ("id.O19",angolo1,angolo2,angolo3,angolo4,lista19,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista20 = new ArrayList<> ();
		lista20.add(Risorsa.foglia);
		lista20.add(Risorsa.foglia);
		lista20.add(Risorsa.foglia);
		lista20.add(Risorsa.foglia);
		lista20.add(Risorsa.foglia);
		CartaOro carta20oro = new CartaOro ("id.O20",angolo1,angolo2,angolo3,angolo4,lista20,5,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.boccetta);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista21 = new ArrayList<> ();
		lista21.add(Risorsa.lupo);
		lista21.add(Risorsa.lupo);
		lista21.add(Risorsa.farfalla);
		CartaOro carta21oro = new CartaOro ("id.O21",angolo1,angolo2,angolo3,angolo4,lista21,1,Risorsa.boccetta,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.pergamena);
		ArrayList<Risorsa> lista22 = new ArrayList<> ();
		lista22.add(Risorsa.lupo);
		lista22.add(Risorsa.lupo);
		lista22.add(Risorsa.foglia);
		CartaOro carta22oro = new CartaOro ("id.O22",angolo1,angolo2,angolo3,angolo4,lista22,1,Risorsa.pergamena,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista23 = new ArrayList<> ();
		lista23.add(Risorsa.lupo);
		lista23.add(Risorsa.lupo);
		lista23.add(Risorsa.fungo);
		CartaOro carta23oro = new CartaOro ("id.O23",angolo1,angolo2,angolo3,angolo4,lista23,1,Risorsa.piuma,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);            
		angolo2 = new Angolo(Posizione.BassoSinistra,null);   
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista24 = new ArrayList<> ();
		lista24.add(Risorsa.lupo);
		lista24.add(Risorsa.lupo);
		lista24.add(Risorsa.lupo);
		lista24.add(Risorsa.farfalla);
		CartaOro carta24oro = new CartaOro ("id.O24",angolo1,angolo2,angolo3,angolo4,lista24,2,Risorsa.vuoto,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista25 = new ArrayList<> ();
		lista25.add(Risorsa.lupo);
		lista25.add(Risorsa.lupo);
		lista25.add(Risorsa.lupo);
		lista25.add(Risorsa.fungo);
		CartaOro carta25oro = new CartaOro ("id.O25",angolo1,angolo2,angolo3,angolo4,lista25,2,Risorsa.vuoto,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista26 = new ArrayList<> ();
		lista26.add(Risorsa.lupo);
		lista26.add(Risorsa.lupo);
		lista26.add(Risorsa.lupo);
		lista26.add(Risorsa.foglia);
		CartaOro carta26oro = new CartaOro ("id.O26",angolo1,angolo2,angolo3,angolo4,lista26,2,Risorsa.vuoto,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.pergamena);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista27 = new ArrayList<> ();
		lista27.add(Risorsa.lupo);
		lista27.add(Risorsa.lupo);
		lista27.add(Risorsa.lupo);
		CartaOro carta27oro = new CartaOro ("id.O27",angolo1,angolo2,angolo3,angolo4,lista27,3,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.boccetta);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista28 = new ArrayList<> ();
		lista28.add(Risorsa.lupo);
		lista28.add(Risorsa.lupo);
		lista28.add(Risorsa.lupo);
		CartaOro carta28oro = new CartaOro ("id.O28",angolo1,angolo2,angolo3,angolo4,lista28,3,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.piuma);
		ArrayList<Risorsa> lista29 = new ArrayList<> ();
		lista29.add(Risorsa.lupo);
		lista29.add(Risorsa.lupo);
		lista29.add(Risorsa.lupo);
		CartaOro carta29oro = new CartaOro ("id.O29",angolo1,angolo2,angolo3,angolo4,lista29,3,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista30 = new ArrayList<> ();
		lista30.add(Risorsa.lupo);
		lista30.add(Risorsa.lupo);
		lista30.add(Risorsa.lupo);
		lista30.add(Risorsa.lupo);
		lista30.add(Risorsa.lupo);
		CartaOro carta30oro = new CartaOro ("id.O30",angolo1,angolo2,angolo3,angolo4,lista30,5,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.piuma);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista31 = new ArrayList<> ();
		lista31.add(Risorsa.farfalla);
		lista31.add(Risorsa.farfalla);
		lista31.add(Risorsa.foglia);
		CartaOro carta31oro = new CartaOro ("id.O31",angolo1,angolo2,angolo3,angolo4,lista31,1,Risorsa.piuma,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.pergamena);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista32 = new ArrayList<> ();
		lista32.add(Risorsa.farfalla);
		lista32.add(Risorsa.farfalla);
		lista32.add(Risorsa.lupo);
		CartaOro carta32oro = new CartaOro ("id.O32",angolo1,angolo2,angolo3,angolo4,lista32,1,Risorsa.pergamena,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.boccetta);
		ArrayList<Risorsa> lista33 = new ArrayList<> ();
		lista33.add(Risorsa.farfalla);
		lista33.add(Risorsa.farfalla);
		lista33.add(Risorsa.fungo);
		CartaOro carta33oro = new CartaOro ("id.O33",angolo1,angolo2,angolo3,angolo4,lista33,1,Risorsa.boccetta,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);            
		angolo2 = new Angolo(Posizione.BassoSinistra,null);   
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista34 = new ArrayList<> ();
		lista34.add(Risorsa.farfalla);
		lista34.add(Risorsa.farfalla);
		lista34.add(Risorsa.farfalla);
		lista34.add(Risorsa.lupo);
		CartaOro carta34oro = new CartaOro ("id.O34",angolo1,angolo2,angolo3,angolo4,lista34,2,Risorsa.vuoto,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista35 = new ArrayList<> ();
		lista35.add(Risorsa.farfalla);
		lista35.add(Risorsa.farfalla);
		lista35.add(Risorsa.farfalla);
		lista35.add(Risorsa.foglia);
		CartaOro carta35oro = new CartaOro ("id.O35",angolo1,angolo2,angolo3,angolo4,lista35,2,Risorsa.vuoto,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista36 = new ArrayList<> ();
		lista36.add(Risorsa.farfalla);
		lista36.add(Risorsa.farfalla);
		lista36.add(Risorsa.farfalla);
		lista36.add(Risorsa.fungo);
		CartaOro carta36oro = new CartaOro ("id.O36",angolo1,angolo2,angolo3,angolo4,lista36,2,Risorsa.vuoto,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.boccetta);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista37 = new ArrayList<> ();
		lista37.add(Risorsa.farfalla);
		lista37.add(Risorsa.farfalla);
		lista37.add(Risorsa.farfalla);
		CartaOro carta37oro = new CartaOro ("id.O37",angolo1,angolo2,angolo3,angolo4,lista37,3,null,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.pergamena);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista38 = new ArrayList<> ();
		lista38.add(Risorsa.farfalla);
		lista38.add(Risorsa.farfalla);
		lista38.add(Risorsa.farfalla);
		CartaOro carta38oro = new CartaOro ("id.O38",angolo1,angolo2,angolo3,angolo4,lista38,3,null,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista39 = new ArrayList<> ();
		lista39.add(Risorsa.farfalla);
		lista39.add(Risorsa.farfalla);
		lista39.add(Risorsa.farfalla);
		CartaOro carta39oro = new CartaOro ("id.O39",angolo1,angolo2,angolo3,angolo4,lista39,3,null,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista40 = new ArrayList<> ();
		lista40.add(Risorsa.farfalla);
		lista40.add(Risorsa.farfalla);
		lista40.add(Risorsa.farfalla);
		lista40.add(Risorsa.farfalla);
		lista40.add(Risorsa.farfalla);
		CartaOro carta40oro = new CartaOro ("id.O40",angolo1,angolo2,angolo3,angolo4,lista40,5,null,Colore.viola);
		
		//creazione 40 carte risorsa
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
	    angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
	    angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
	    angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta1risorsa = new CartaRisorsa("id.R1",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
	    angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta2risorsa = new CartaRisorsa("id.R2",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		 
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta3risorsa = new CartaRisorsa("id.R3",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		 
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta4risorsa = new CartaRisorsa("id.R4",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.piuma);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta5risorsa = new CartaRisorsa("id.R5",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.boccetta);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta6risorsa = new CartaRisorsa("id.R6",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.pergamena);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta7risorsa = new CartaRisorsa("id.R7",angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta8risorsa = new CartaRisorsa("id.R8",angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta9risorsa = new CartaRisorsa("id.R9",angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta10risorsa = new CartaRisorsa("id.R10",angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta11risorsa = new CartaRisorsa("id.R11",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta12risorsa = new CartaRisorsa("id.R12",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta13risorsa = new CartaRisorsa("id.R13",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta14risorsa = new CartaRisorsa("id.R14",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta15risorsa = new CartaRisorsa("id.R15",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.boccetta);
		CartaRisorsa carta16risorsa = new CartaRisorsa("id.R16",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta17risorsa = new CartaRisorsa("id.R17",angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta18risorsa = new CartaRisorsa("id.R18",angolo1,angolo2,angolo3,angolo4,1,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta19risorsa = new CartaRisorsa("id.R19",angolo1,angolo2,angolo3,angolo4,1,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta20risorsa = new CartaRisorsa("id.R20",angolo1,angolo2,angolo3,angolo4,1,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta21risorsa = new CartaRisorsa("id.R21",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta22risorsa = new CartaRisorsa("id.R22",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta23risorsa = new CartaRisorsa("id.R23",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta24risorsa = new CartaRisorsa("id.R24",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta25risorsa = new CartaRisorsa("id.R25",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.pergamena);
		CartaRisorsa carta26risorsa = new CartaRisorsa("id.R26",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.piuma);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta27risorsa = new CartaRisorsa("id.R27",angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta28risorsa = new CartaRisorsa("id.R28",angolo1,angolo2,angolo3,angolo4,1,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta29risorsa = new CartaRisorsa("id.R29",angolo1,angolo2,angolo3,angolo4,1,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta30risorsa = new CartaRisorsa("id.R30",angolo1,angolo2,angolo3,angolo4,1,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta31risorsa = new CartaRisorsa("id.R31",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta32risorsa = new CartaRisorsa("id.R32",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta33risorsa = new CartaRisorsa("id.R33",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta34risorsa = new CartaRisorsa("id.R34",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.piuma);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta35risorsa = new CartaRisorsa("id.R35",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta36risorsa = new CartaRisorsa("id.R36",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta37risorsa = new CartaRisorsa("id.R37",angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta38risorsa = new CartaRisorsa("id.R38",angolo1,angolo2,angolo3,angolo4,1,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta39risorsa = new CartaRisorsa("id.R39",angolo1,angolo2,angolo3,angolo4,1,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta40risorsa = new CartaRisorsa("id.R40",angolo1,angolo2,angolo3,angolo4,1,Colore.viola);
		

		ArrayList<Carta> carteRisorsa = new ArrayList<Carta>();
		carteRisorsa.add(carta1risorsa);
		carteRisorsa.add(carta2risorsa);
		carteRisorsa.add(carta3risorsa);
		carteRisorsa.add(carta4risorsa);
		carteRisorsa.add(carta5risorsa);
		carteRisorsa.add(carta6risorsa);
		carteRisorsa.add(carta7risorsa);
		carteRisorsa.add(carta8risorsa);
		carteRisorsa.add(carta9risorsa);
		carteRisorsa.add(carta10risorsa);
		carteRisorsa.add(carta11risorsa);
		carteRisorsa.add(carta12risorsa);
		carteRisorsa.add(carta13risorsa);
		carteRisorsa.add(carta14risorsa);
		carteRisorsa.add(carta15risorsa);
		carteRisorsa.add(carta16risorsa);
		carteRisorsa.add(carta17risorsa);
		carteRisorsa.add(carta18risorsa);
		carteRisorsa.add(carta19risorsa);
		carteRisorsa.add(carta20risorsa);
		carteRisorsa.add(carta21risorsa);
		carteRisorsa.add(carta22risorsa);
		carteRisorsa.add(carta23risorsa);
		carteRisorsa.add(carta24risorsa);
		carteRisorsa.add(carta25risorsa);
		carteRisorsa.add(carta26risorsa);
		carteRisorsa.add(carta27risorsa);
		carteRisorsa.add(carta28risorsa);
		carteRisorsa.add(carta29risorsa);
		carteRisorsa.add(carta30risorsa);
		carteRisorsa.add(carta31risorsa);
		carteRisorsa.add(carta32risorsa);
		carteRisorsa.add(carta33risorsa);
		carteRisorsa.add(carta34risorsa);
		carteRisorsa.add(carta35risorsa);
		carteRisorsa.add(carta36risorsa);
		carteRisorsa.add(carta37risorsa);
		carteRisorsa.add(carta38risorsa);
		carteRisorsa.add(carta39risorsa);
		carteRisorsa.add(carta40risorsa);
		Mazzo carteRisorse = new Mazzo(40,carteRisorsa);
		
		
		ArrayList<Carta> carteoro = new ArrayList<Carta>();
        carteoro.add(carta1oro);
        carteoro.add(carta2oro);
        carteoro.add(carta3oro);
        carteoro.add(carta4oro);
        carteoro.add(carta5oro);
        carteoro.add(carta6oro);
        carteoro.add(carta7oro);
        carteoro.add(carta8oro);
        carteoro.add(carta9oro);
        carteoro.add(carta10oro);
        carteoro.add(carta11oro);
        carteoro.add(carta12oro);
        carteoro.add(carta13oro);
        carteoro.add(carta14oro);
        carteoro.add(carta15oro);
        carteoro.add(carta16oro);
        carteoro.add(carta17oro);
        carteoro.add(carta18oro);
        carteoro.add(carta19oro);
        carteoro.add(carta20oro);
        carteoro.add(carta21oro);
        carteoro.add(carta22oro);
        carteoro.add(carta23oro);
        carteoro.add(carta24oro);
        carteoro.add(carta25oro);
        carteoro.add(carta26oro);
        carteoro.add(carta27oro);
        carteoro.add(carta28oro);
        carteoro.add(carta29oro);
        carteoro.add(carta30oro);
        carteoro.add(carta31oro);
        carteoro.add(carta32oro);
        carteoro.add(carta33oro);
        carteoro.add(carta34oro);
        carteoro.add(carta35oro);
        carteoro.add(carta36oro);
        carteoro.add(carta37oro);
        carteoro.add(carta38oro);
        carteoro.add(carta39oro);
        carteoro.add(carta40oro);
		Mazzo carteOro = new Mazzo(40,carteoro);
		
		ArrayList<Carta> cartainiziale = new ArrayList<Carta>();
		cartainiziale.add(cartaIni1);
		cartainiziale.add(cartaIni2);
		cartainiziale.add(cartaIni3);
		cartainiziale.add(cartaIni4);
		cartainiziale.add(cartaIni5);
		cartainiziale.add(cartaIni6);
        Mazzo carteIniziali = new Mazzo(6,cartainiziale);

        ArrayList<Carta> carteobiettivo = new ArrayList<Carta>();
        carteobiettivo.add(cartaObiet1);
        carteobiettivo.add(cartaObiet2);
        carteobiettivo.add(cartaObiet3);
        carteobiettivo.add(cartaObiet4);
        carteobiettivo.add(cartaObiet5);
        carteobiettivo.add(cartaObiet6);
        carteobiettivo.add(cartaObiet7);
        carteobiettivo.add(cartaObiet8);
        carteobiettivo.add(cartaObiet9);
        carteobiettivo.add(cartaObiet10);
        carteobiettivo.add(cartaObiet11);
        carteobiettivo.add(cartaObiet12);
        carteobiettivo.add(cartaObiet13);
        carteobiettivo.add(cartaObiet14);
        carteobiettivo.add(cartaObiet15);
        carteobiettivo.add(cartaObiet16);

        Mazzo carteObiettivo = new Mazzo(16,carteobiettivo);
		
		
	}

	  
	
	
}
