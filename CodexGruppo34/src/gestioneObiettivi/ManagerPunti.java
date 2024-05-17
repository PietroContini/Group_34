package gestioneObiettivi;

import java.util.ArrayList;

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
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaObiettivoEn;
import gestioneGioco.Giocatore;
import gestioneGioco.Partita;

public class ManagerPunti {
	
	
	
	public int checkObiettivi(Giocatore a, Partita ps) {
		
		ArrayList<CartaObiettivo> b = a.getCarteObiettivo();
		ArrayList<CartaObiettivo> p = ps.getCarteObiettivoComuni();
		
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
			 
			 9 x 9 il centro � 5,5
			 
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
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaRossa || p.get(0).getTipo() == CartaObiettivoEn.COTriplaRossa || p.get(1).getTipo() == CartaObiettivoEn.COTriplaRossa  ) {
					punti = punti + CartaObiettivo1.checkObietTripleRosse(a);
					
				}
				
				// tripla verde
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaVerde || p.get(0).getTipo() == CartaObiettivoEn.COTriplaVerde || p.get(1).getTipo() == CartaObiettivoEn.COTriplaVerde) {
					punti = punti + CartaObiettivo2.checkObietTripleVerdi(a);
					
				}
				
				// tripla viola
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaViola || p.get(0).getTipo() == CartaObiettivoEn.COTriplaViola || p.get(1).getTipo() == CartaObiettivoEn.COTriplaViola) {
					punti = punti + CartaObiettivo3.checkObietTripleViola(a);
					
				}
				
				// tripla azzurra
				if(b.get(0).getTipo() == CartaObiettivoEn.COTriplaAzzurra || p.get(0).getTipo() == CartaObiettivoEn.COTriplaAzzurra || p.get(1).getTipo() == CartaObiettivoEn.COTriplaAzzurra) {
					punti = punti + CartaObiettivo4.checkObietTripleAzzurre(a);
					
				}
				
				
				
				// forma a r
				if(b.get(0).getTipo() == CartaObiettivoEn.COFormaR || p.get(0).getTipo() == CartaObiettivoEn.COFormaR || p.get(1).getTipo() == CartaObiettivoEn.COFormaR) {
					punti = punti + CartaObiettivo5.checkObietFormaR(a);
					
				}
				
				// forma a 1
				if(b.get(0).getTipo() == CartaObiettivoEn.COForma1 || p.get(0).getTipo() == CartaObiettivoEn.COForma1 || p.get(1).getTipo() == CartaObiettivoEn.COForma1) {
					punti = punti + CartaObiettivo6.checkObietForma1(a);
					
				}
				
				// forma a L
				if(b.get(0).getTipo() == CartaObiettivoEn.COFormaL || p.get(0).getTipo() == CartaObiettivoEn.COFormaL || p.get(1).getTipo() == CartaObiettivoEn.COFormaL) {
					punti = punti + CartaObiettivo7.checkObietFormaL(a);
					
				}
				
				// forma a J
				if(b.get(0).getTipo() == CartaObiettivoEn.COFormaJ || p.get(0).getTipo() == CartaObiettivoEn.COFormaJ || p.get(1).getTipo() == CartaObiettivoEn.COFormaJ) {
					punti = punti + CartaObiettivo8.checkObietFormaJ(a);
					
				}
				
				
					
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreFungo || p.get(0).getTipo() == CartaObiettivoEn.COTreFungo || p.get(1).getTipo() == CartaObiettivoEn.COTreFungo) {
					punti = punti + CartaObiettivo9.checkObietTreFunghi(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreLupo || p.get(0).getTipo() == CartaObiettivoEn.COTreLupo || p.get(1).getTipo() == CartaObiettivoEn.COTreLupo) {
					punti = punti + CartaObiettivo10.checkObietTreLupi(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreFarfalla || p.get(0).getTipo() == CartaObiettivoEn.COTreFarfalla || p.get(1).getTipo() == CartaObiettivoEn.COTreFarfalla) {
					punti = punti + CartaObiettivo11.checkObietTreFarfalle(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreFoglia || p.get(0).getTipo() == CartaObiettivoEn.COTreFoglia || p.get(1).getTipo() == CartaObiettivoEn.COTreFoglia) {
					punti = punti + CartaObiettivo12.checkObietTreFoglie(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.CODuePiuma || p.get(0).getTipo() == CartaObiettivoEn.CODuePiuma || p.get(1).getTipo() == CartaObiettivoEn.CODuePiuma) {
					punti = punti + CartaObiettivo13.checkObietDuePiume(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.CODuePergamena || p.get(0).getTipo() == CartaObiettivoEn.CODuePergamena || p.get(1).getTipo() == CartaObiettivoEn.CODuePergamena) {
					punti = punti + CartaObiettivo14.checkObietDuePergamene(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.CODueBoccetta || p.get(0).getTipo() == CartaObiettivoEn.CODueBoccetta || p.get(1).getTipo() == CartaObiettivoEn.CODueBoccetta) {
					punti = punti + CartaObiettivo15.checkObietDueBoccette(a);
				}
				
				if(b.get(0).getTipo() == CartaObiettivoEn.COTreDiversi || p.get(0).getTipo() == CartaObiettivoEn.COTreDiversi || p.get(1).getTipo() == CartaObiettivoEn.COTreDiversi) {
					punti = punti + CartaObiettivo16.checkObietTreDiversi(a);
				}
		
				return punti;
	}

	

}
