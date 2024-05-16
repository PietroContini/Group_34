package gestioneObiettivi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import carteObiettivo.CartaObiettivo1;
import carteObiettivo.CartaObiettivo10;
import carteObiettivo.CartaObiettivo11;
import carteObiettivo.CartaObiettivo12;
import carteObiettivo.CartaObiettivo13;
import carteObiettivo.CartaObiettivo14;
import carteObiettivo.CartaObiettivo15;
import carteObiettivo.CartaObiettivo16;
import carteObiettivo.CartaObiettivo2;
import carteObiettivo.CartaObiettivo3;
import carteObiettivo.CartaObiettivo4;
import carteObiettivo.CartaObiettivo5;
import carteObiettivo.CartaObiettivo6;
import carteObiettivo.CartaObiettivo7;
import carteObiettivo.CartaObiettivo8;
import carteObiettivo.CartaObiettivo9;
import componentiGioco.Carta;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaObiettivoEn;
import componentiGioco.Colore;
import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class ManagerPunti {
	
	
	
	public int checkObiettivi(Giocatore a) {
		
		ArrayList<CartaObiettivo> b = a.getCarteObiettivo();
		
		int punti = 0;
		
		
			
			/*
			 {0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0
			  0,0,0,0,0,0,0,0,0}
			 
			 9 x 9 il centro è 5,5
			 
			 {0   0   0   0   0
			    0   0   0   0
			  0   0   0   0   0
			    0   0   0   0
			  0   0   1   0   0
			    0   0   0   0
			  0   0   0   0   0
			    0   0   0   0
			  0   0   0   0   0}
			 
			 matrice effettivamente giocabile, dove piazziamo le carte
			 */
				
				// tripla rossa
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaRossa) {
					punti = CartaObiettivo1.checkObietTripleRosse(a);
					
				}
				
				// tripla verde
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaVerde) {
					punti = CartaObiettivo2.checkObietTripleVerdi(a);
					
				}
				
				// tripla viola
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaViola) {
					punti = CartaObiettivo3.checkObietTripleViola(a);
					
				}
				
				// tripla azzurra
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaAzzurra) {
					punti = CartaObiettivo4.checkObietTripleAzzurre(a);
					
				}
				
				
				
				// forma a r
				if(b.get(0).getTipo() == CartaObiettivoEn.COFormaR) {
					punti = CartaObiettivo5.checkObietFormaR(a);
					
				}
				
				// forma a 1
				if(b.get(0).getTipo() == CartaObiettivoEn.COForma1) {
					punti = CartaObiettivo6.checkObietForma1(a);
					
				}
				
				// forma a L
				if(b.get(0).getTipo() == CartaObiettivoEn.COFormaL) {
					punti = CartaObiettivo7.checkObietFormaL(a);
					
				}
				
				// forma a J
				if(b.get(0).getTipo() == CartaObiettivoEn.COFormaJ) {
					punti = CartaObiettivo8.checkObietFormaJ(a);
					
				}
				
				
					
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreFungo) {
					punti = CartaObiettivo9.checkObietTreFunghi(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreLupo) {
					punti = CartaObiettivo10.checkObietTreLupi(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreFarfalla) {
					punti = CartaObiettivo11.checkObietTreFarfalle(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreFoglia) {
					punti = CartaObiettivo12.checkObietTreFoglie(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.CODuePiuma) {
					punti = CartaObiettivo13.checkObietDuePiume(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.CODuePergamena) {
					punti = CartaObiettivo14.checkObietDuePergamene(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.CODueBoccetta) {
					punti = CartaObiettivo15.checkObietDueBoccette(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreDiversi) {
					punti = CartaObiettivo16.checkObietTreDiversi(a);
				}
		
				return punti;
	}

	

}
