package gestioneObiettivi;

import java.util.ArrayList;
import java.util.Iterator;

import componentiGioco.Carta;
import componentiGioco.CartaObiettivo;
import componentiGioco.Colore;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class ManagerObiettivo {
	
	
	
	public int checkObiettivi(Giocatore a) {
		
		Manoscritto m = a.getManoscritto();
		
		ArrayList<CartaObiettivo> b = a.getCarteObiettivo();
		
		int punti = 0;
		
		for(int i=0;i<b.size();i++) {
			
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
		if(b.get(i).getTipo().equalsIgnoreCase("/rosso")) {
			int x=50;
			int y=50;
			int cop = 0;
			int cont =0;
			while(x<90) {
				cont++;
				y =50+cont;
				x = 50+cont;
				cop = 0;
				if(m.getCarta(x, y)!=null) {
						int as=x;
						int bs=y;
						while(y<90) {
						Carta fg =	m.getCarta(as-1, bs+1);
						if(fg == null) {
							cop = 0;
							break;
						}
						if(fg.getColor()==Colore.rosso) {
							cop++;
							if(cop==3) {
								punti=punti+2;
							}
						}
						else{
							cop = 0;
						}
							
						}
						while(y>0) {
							Carta fg =	m.getCarta(as-1, bs+1);
							if(fg == null) {
								cop = 0;
								break;
							}
							if(fg.getColor()==Colore.rosso) {
								cop++;
								if(cop==3) {
									punti=punti+2;
								}
							}
							else{
								cop = 0;
							}
								
							}
			
			}
			}
			while(x>0) {
				cont++;
				y =50-cont;
				x = 50-cont;
				if(m.getCarta(x, y)!=null) {
						int as=x;
						int bs=y;
						while(y<90) {
						Carta fg =	m.getCarta(as-1, bs+1);
						if(fg == null) {
							cop = 0;
							break;
						}
						if(fg.getColor()==Colore.rosso) {
							cop++;
							if(cop==3) {
								punti=punti+2;
							}
						}
						else{
							cop = 0;
						}
							
						}
						as=x;
						bs=y;
						while(y>0) {
							Carta fg =	m.getCarta(as+1, bs-1);
							if(fg == null) {
								cop = 0;
								break;
							}
							if(fg.getColor()==Colore.rosso) {
								cop++;
								if(cop==3) {
									punti=punti+2;
								}
							}
							else{
								cop = 0;
							}
								
							}
			
			}
			}
		}
			
			
		}
		
		
		return punti;
		
		
	}

}
