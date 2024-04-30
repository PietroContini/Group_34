package main;

import java.util.ArrayList;

import componentiGioco.Angolo;
import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;
import componentiGioco.Colore;
import componentiGioco.Posizione;
import componentiGioco.Risorsa;
import gestioneGioco.Mazzo;

public class Main {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
    
		
	    //Creazione carte obiettivo
		
		CartaObiettivo cartaObiet1 = new CartaObiettivo(2,"/rosso");
		CartaObiettivo cartaObiet2 = new CartaObiettivo(2,"\\verde");
		CartaObiettivo cartaObiet3 = new CartaObiettivo(2,"/azzurra");
		CartaObiettivo cartaObiet4 = new CartaObiettivo(2,"\\viola");
		CartaObiettivo cartaObiet5 = new CartaObiettivo(2,"L");
		CartaObiettivo cartaObiet6 = new CartaObiettivo(2,"J");
		CartaObiettivo cartaObiet7 = new CartaObiettivo(2,"r");
		CartaObiettivo cartaObiet8 = new CartaObiettivo(2,"1");
		Risorsa [] pObiet = {Risorsa.fungo,Risorsa.fungo,Risorsa.fungo};
		CartaObiettivo cartaObiet9 = new CartaObiettivo(2,pObiet);
		pObiet[0]=Risorsa.foglia;
		pObiet[1]=Risorsa.foglia;
		pObiet[2]=Risorsa.foglia;
		CartaObiettivo cartaObiet10 = new CartaObiettivo(2,pObiet);
		pObiet[0]=Risorsa.lupo;
		pObiet[1]=Risorsa.lupo;
		pObiet[2]=Risorsa.lupo;
		CartaObiettivo cartaObiet11 = new CartaObiettivo(2,pObiet);
		pObiet[0]=Risorsa.farfalla;
		pObiet[1]=Risorsa.farfalla;
		pObiet[2]=Risorsa.farfalla;
		CartaObiettivo cartaObiet12 = new CartaObiettivo(2,pObiet);
		CartaObiettivo cartaObiet13 = new CartaObiettivo(3,"3div");
		pObiet[0]=Risorsa.pergamena;
		pObiet[1]=Risorsa.pergamena;
		CartaObiettivo cartaObiet14 = new CartaObiettivo(2,pObiet);
		pObiet[0]=Risorsa.boccetta;
		pObiet[1]=Risorsa.boccetta;
		CartaObiettivo cartaObiet15 = new CartaObiettivo(2,pObiet);
		pObiet[0]=Risorsa.piuma;
		pObiet[1]=Risorsa.piuma;
		CartaObiettivo cartaObiet16 = new CartaObiettivo(2,pObiet);
		
		// Creazione carte iniziali front
		
		Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		
		
		CartaIniziale cartaIni1 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,1);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		
		
		CartaIniziale cartaIni2 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,2);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		
		
		CartaIniziale cartaIni3 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,3);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		
		
		CartaIniziale cartaIni4 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,4);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
	
		CartaIniziale cartaIni5 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,5);
		
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
	
		
		CartaIniziale cartaIni6 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,6);
		
		
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
		CartaOro carta1oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista1,1,Risorsa.piuma,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.boccetta);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista2 = new ArrayList<> ();
		lista2.add(Risorsa.fungo);
		lista2.add(Risorsa.fungo);
		lista2.add(Risorsa.foglia);
		CartaOro carta2oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista2,1,Risorsa.boccetta,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista3 = new ArrayList<> ();
		lista3.add(Risorsa.fungo);
		lista3.add(Risorsa.fungo);
		lista3.add(Risorsa.farfalla);
		CartaOro carta3oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista3,1,Risorsa.pergamena,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);  
		angolo2 = new Angolo(Posizione.BassoSinistra,null);           
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista4 = new ArrayList<> ();
		lista4.add(Risorsa.fungo);
		lista4.add(Risorsa.fungo);
		lista4.add(Risorsa.fungo);
		lista4.add(Risorsa.lupo);
		CartaOro carta4oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista4,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista5 = new ArrayList<> ();
		lista5.add(Risorsa.fungo);
		lista5.add(Risorsa.fungo);
		lista5.add(Risorsa.fungo);
		lista5.add(Risorsa.foglia);
		CartaOro carta5oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista5,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista6 = new ArrayList<> ();
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.fungo);
		lista6.add(Risorsa.farfalla);
		CartaOro carta6oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista6,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista7 = new ArrayList<> ();
		lista7.add(Risorsa.fungo);
		lista7.add(Risorsa.fungo);
		lista7.add(Risorsa.fungo);
		CartaOro carta7oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista7,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.piuma);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista8 = new ArrayList<> ();
		lista8.add(Risorsa.fungo);
		lista8.add(Risorsa.fungo);
		lista8.add(Risorsa.fungo);
		CartaOro carta8oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista8,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.pergamena);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista9 = new ArrayList<> ();
		lista9.add(Risorsa.fungo);
		lista9.add(Risorsa.fungo);
		lista9.add(Risorsa.fungo);
		CartaOro carta9oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista9,3,null,Colore.rosso);
		
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
		CartaOro carta10oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista10,5,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.piuma);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista11 = new ArrayList<> ();
		lista11.add(Risorsa.foglia);
		lista11.add(Risorsa.foglia);
		lista11.add(Risorsa.farfalla);
		CartaOro carta11oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista11,1,Risorsa.piuma,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.pergamena);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista12 = new ArrayList<> ();
		lista12.add(Risorsa.foglia);
		lista12.add(Risorsa.foglia);
		lista12.add(Risorsa.fungo);
		CartaOro carta12oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista12,1,Risorsa.pergamena,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista13 = new ArrayList<> ();
		lista13.add(Risorsa.foglia);
		lista13.add(Risorsa.foglia);
		lista13.add(Risorsa.lupo);
		CartaOro carta13oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista13,1,Risorsa.boccetta,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);            
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);   
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista14 = new ArrayList<> ();
		lista14.add(Risorsa.foglia);
		lista14.add(Risorsa.foglia);
		lista14.add(Risorsa.foglia);
		lista14.add(Risorsa.farfalla);
		CartaOro carta14oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista14,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista15 = new ArrayList<> ();
		lista15.add(Risorsa.foglia);
		lista15.add(Risorsa.foglia);
		lista15.add(Risorsa.foglia);
		lista15.add(Risorsa.lupo);
		CartaOro carta15oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista15,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista16 = new ArrayList<> ();
		lista16.add(Risorsa.foglia);
		lista16.add(Risorsa.foglia);
		lista16.add(Risorsa.foglia);
		lista16.add(Risorsa.fungo);
		CartaOro carta16oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista16,2,Risorsa.vuoto,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista17 = new ArrayList<> ();
		lista17.add(Risorsa.foglia);
		lista17.add(Risorsa.foglia);
		lista17.add(Risorsa.foglia);
		CartaOro carta17oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista17,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista18 = new ArrayList<> ();
		lista18.add(Risorsa.foglia);
		lista18.add(Risorsa.foglia);
		lista18.add(Risorsa.foglia);
		CartaOro carta18oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista18,3,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.boccetta);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista19 = new ArrayList<> ();
		lista19.add(Risorsa.foglia);
		lista19.add(Risorsa.foglia);
		lista19.add(Risorsa.foglia);
		CartaOro carta19oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista19,3,null,Colore.rosso);
		
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
		CartaOro carta20oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista20,5,null,Colore.rosso);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.boccetta);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista21 = new ArrayList<> ();
		lista21.add(Risorsa.lupo);
		lista21.add(Risorsa.lupo);
		lista21.add(Risorsa.farfalla);
		CartaOro carta21oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista21,1,Risorsa.boccetta,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.pergamena);
		ArrayList<Risorsa> lista22 = new ArrayList<> ();
		lista22.add(Risorsa.lupo);
		lista22.add(Risorsa.lupo);
		lista22.add(Risorsa.foglia);
		CartaOro carta22oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista22,1,Risorsa.pergamena,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista23 = new ArrayList<> ();
		lista23.add(Risorsa.lupo);
		lista23.add(Risorsa.lupo);
		lista23.add(Risorsa.fungo);
		CartaOro carta23oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista23,1,Risorsa.piuma,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);            
		angolo2 = new Angolo(Posizione.BassoSinistra,null);   
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista24 = new ArrayList<> ();
		lista24.add(Risorsa.lupo);
		lista24.add(Risorsa.lupo);
		lista24.add(Risorsa.lupo);
		lista24.add(Risorsa.farfalla);
		CartaOro carta24oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista24,2,Risorsa.vuoto,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista25 = new ArrayList<> ();
		lista25.add(Risorsa.lupo);
		lista25.add(Risorsa.lupo);
		lista25.add(Risorsa.lupo);
		lista25.add(Risorsa.fungo);
		CartaOro carta25oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista25,2,Risorsa.vuoto,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista26 = new ArrayList<> ();
		lista26.add(Risorsa.lupo);
		lista26.add(Risorsa.lupo);
		lista26.add(Risorsa.lupo);
		lista26.add(Risorsa.foglia);
		CartaOro carta26oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista26,2,Risorsa.vuoto,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.pergamena);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista27 = new ArrayList<> ();
		lista27.add(Risorsa.lupo);
		lista27.add(Risorsa.lupo);
		lista27.add(Risorsa.lupo);
		CartaOro carta27oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista27,3,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.boccetta);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista28 = new ArrayList<> ();
		lista28.add(Risorsa.lupo);
		lista28.add(Risorsa.lupo);
		lista28.add(Risorsa.lupo);
		CartaOro carta28oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista28,3,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.piuma);
		ArrayList<Risorsa> lista29 = new ArrayList<> ();
		lista29.add(Risorsa.lupo);
		lista29.add(Risorsa.lupo);
		lista29.add(Risorsa.lupo);
		CartaOro carta29oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista29,3,null,Colore.azzurro);
		
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
		CartaOro carta30oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista30,5,null,Colore.azzurro);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.piuma);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista31 = new ArrayList<> ();
		lista31.add(Risorsa.farfalla);
		lista31.add(Risorsa.farfalla);
		lista31.add(Risorsa.foglia);
		CartaOro carta31oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista31,1,Risorsa.piuma,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.pergamena);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista32 = new ArrayList<> ();
		lista32.add(Risorsa.farfalla);
		lista32.add(Risorsa.farfalla);
		lista32.add(Risorsa.lupo);
		CartaOro carta32oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista32,1,Risorsa.pergamena,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.boccetta);
		ArrayList<Risorsa> lista33 = new ArrayList<> ();
		lista33.add(Risorsa.farfalla);
		lista33.add(Risorsa.farfalla);
		lista33.add(Risorsa.fungo);
		CartaOro carta33oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista33,1,Risorsa.boccetta,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);            
		angolo2 = new Angolo(Posizione.BassoSinistra,null);   
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);      
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista34 = new ArrayList<> ();
		lista34.add(Risorsa.farfalla);
		lista34.add(Risorsa.farfalla);
		lista34.add(Risorsa.farfalla);
		lista34.add(Risorsa.lupo);
		CartaOro carta34oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista34,2,Risorsa.vuoto,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista35 = new ArrayList<> ();
		lista35.add(Risorsa.farfalla);
		lista35.add(Risorsa.farfalla);
		lista35.add(Risorsa.farfalla);
		lista35.add(Risorsa.foglia);
		CartaOro carta35oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista35,2,Risorsa.vuoto,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista36 = new ArrayList<> ();
		lista36.add(Risorsa.farfalla);
		lista36.add(Risorsa.farfalla);
		lista36.add(Risorsa.farfalla);
		lista36.add(Risorsa.fungo);
		CartaOro carta36oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista36,2,Risorsa.vuoto,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.boccetta);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista37 = new ArrayList<> ();
		lista37.add(Risorsa.farfalla);
		lista37.add(Risorsa.farfalla);
		lista37.add(Risorsa.farfalla);
		CartaOro carta37oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista37,3,null,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.pergamena);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		ArrayList<Risorsa> lista38 = new ArrayList<> ();
		lista38.add(Risorsa.farfalla);
		lista38.add(Risorsa.farfalla);
		lista38.add(Risorsa.farfalla);
		CartaOro carta38oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista38,3,null,Colore.viola);
		
		angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		ArrayList<Risorsa> lista39 = new ArrayList<> ();
		lista39.add(Risorsa.farfalla);
		lista39.add(Risorsa.farfalla);
		lista39.add(Risorsa.farfalla);
		CartaOro carta39oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista39,3,null,Colore.viola);
		
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
		CartaOro carta40oro = new CartaOro (angolo1,angolo2,angolo3,angolo4,lista40,5,null,Colore.viola);
		
		//creazione 40 carte risorsa
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
	    angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
	    angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
	    angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta1risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
	    angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta2risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		 
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta3risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		 
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta4risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.piuma);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta5risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.boccetta);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta6risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.pergamena);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta7risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.fungo);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta8risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta9risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.fungo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta10risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.rosso);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta11risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta12risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta13risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta14risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.piuma);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta15risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.fungo);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.boccetta);
		CartaRisorsa carta16risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta17risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.foglia);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta18risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.foglia);
		CartaRisorsa carta19risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta20risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.verde);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta21risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta22risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta23risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta24risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta25risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.foglia);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.pergamena);
		CartaRisorsa carta26risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.piuma);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta27risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta28risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.lupo);
		CartaRisorsa carta29risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.lupo);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta30risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.azzurro);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta31risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta32risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta33risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta34risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.lupo);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.piuma);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta35risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.pergamena);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		CartaRisorsa carta36risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.boccetta);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		CartaRisorsa carta37risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,0,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.farfalla);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta38risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.farfalla);
		CartaRisorsa carta39risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.viola);
		
	    angolo1 = new Angolo(Posizione.AltoSinistra,null);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.farfalla);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		CartaRisorsa carta40risorsa = new CartaRisorsa(angolo1,angolo2,angolo3,angolo4,1,Colore.viola);
		
		Carta[] carterisorsa = new Carta [] {carta1risorsa,carta2risorsa,carta3risorsa,carta4risorsa,carta5risorsa,carta6risorsa,
			                        carta7risorsa,carta8risorsa,carta9risorsa,carta10risorsa,
			                        carta11risorsa,carta12risorsa,carta13risorsa,carta14risorsa,carta15risorsa,carta16risorsa, carta17risorsa,carta18risorsa,carta19risorsa,
			                        carta20risorsa,carta21risorsa,carta22risorsa,carta23risorsa,
			                        carta24risorsa,carta25risorsa,carta26risorsa,carta27risorsa,carta28risorsa,carta29risorsa,
			                        carta30risorsa,carta31risorsa,carta32risorsa,carta33risorsa,carta34risorsa,carta35risorsa,carta36risorsa,
			                        carta37risorsa,carta38risorsa,carta39risorsa,carta40risorsa};
		Mazzo carteRisorsa = new Mazzo(40,carterisorsa);
		
		
		Carta[] carteoro = new Carta[] {carta1oro,carta2oro,carta3oro,carta4oro,carta5oro,carta6oro,carta7oro,carta8oro,carta9oro,carta10oro,
				carta11oro,carta12oro,carta13oro,carta14oro,carta15oro,carta16oro,carta17oro,carta18oro,carta19oro,carta20oro,
				carta21oro,carta22oro,carta23oro,carta24oro,carta25oro,carta26oro,carta27oro,carta28oro,carta29oro,carta30oro,
				carta31oro,carta32oro,carta33oro,carta34oro,carta35oro,carta36oro, carta37oro,carta38oro,carta39oro,carta40oro};
		Mazzo carteOro = new Mazzo(40,carteoro);
		
		Carta [] cart = new Carta []{cartaIni1,cartaIni2,cartaIni3,cartaIni4,cartaIni5,cartaIni6};
        Mazzo carteIniziali = new Mazzo(6,cart);

        Carta [] car = new Carta [] {cartaObiet1,cartaObiet2,cartaObiet3,cartaObiet4,cartaObiet5,cartaObiet6,
                                     cartaObiet7,cartaObiet8,cartaObiet9,cartaObiet10,cartaObiet11,cartaObiet12,
                                     cartaObiet13,cartaObiet14,cartaObiet15,cartaObiet16};
        Mazzo carteObiettivo = new Mazzo(16,car);
		
		
	}

	  
	
	
}
