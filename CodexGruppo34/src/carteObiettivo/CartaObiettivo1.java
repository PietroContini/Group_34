package carteObiettivo;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.Colore;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class CartaObiettivo1 {



public static int checkObietTripleRosse(Giocatore a) {
	
	Manoscritto m = a.getManoscritto();
	ArrayList<Carta> copy = new ArrayList<Carta>();
	
	int punti = 0;
	
	// tripla rossa
		int x=46;
		int y=46;
		int cop = 0;
		int cont = 0;
		while(x<90) {
			y =46+cont;
			x = 46+cont;
			cont++;
			cop = 0;
			int xs = x;
			int ys = y;
			if(m.getCarta(x, y)!=null) {
				if(m.getCarta(x, y).getColor()==Colore.rosso && m.getCarta(xs--, ys++).getColor()==Colore.rosso && m.getCarta(xs+2, ys-2).getColor()==Colore.rosso  ) {
					xs=x; 
					ys=y;
					if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys++)) ==false && m.search(m.getCarta(xs+2, ys-2))==false) {
						copy.add(m.getCarta(x, y));
						xs=x; 
						ys=y;
						copy.add(m.getCarta(xs--, ys++));
						copy.add(m.getCarta(xs+2, ys-2));
						m.addS(copy);
						punti=punti+2;
						copy.clear();
					}
					
				}
					int as=x;
					int bs=y;
					while(y<90) {
					Carta fg =	m.getCarta(as-1, bs+1);
					if(fg == null) {
						cop = 0;
						break;
					}
					if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
						cop++;
						copy.add(fg);
						if(cop==3) {
							m.addS(copy);
							copy.clear();
							punti=punti+2;
						}
					}
					else{
						copy.clear();
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
						if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
							cop++;
							copy.add(fg);
							if(cop==3) {
								m.addS(copy);
								copy.clear();
								punti=punti+2;
							}
						}
						else{
							copy.clear();
							cop = 0;
						}
							
						}
		
		}
		}
		cont = 0;
		while(x>0) {
			y =46-cont;
			x = 46-cont;
			cont++;
			int xs = x;
			int ys = y;
			if(m.getCarta(x, y)!=null) {
				if(m.getCarta(x, y).getColor()==Colore.rosso && m.getCarta(xs--, ys++).getColor()==Colore.rosso && m.getCarta(xs+2, ys-2).getColor()==Colore.rosso  ) {
					xs=x; 
					ys=y;
					if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys++)) ==false && m.search(m.getCarta(xs+2, ys-2))==false) {
						copy.add(m.getCarta(x, y));
						xs=x; 
						ys=y;
						copy.add(m.getCarta(xs--, ys++));
						copy.add(m.getCarta(xs+2, ys-2));
						m.addS(copy);
						punti=punti+2;
						copy.clear();
					}
					
				}
					int as=x;
					int bs=y;
					while(y<90) {
					Carta fg =	m.getCarta(as-1, bs+1);
					if(fg == null) {
						cop = 0;
						break;
					}
					if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
						cop++;
						copy.add(fg);
						if(cop==3) {
							m.addS(copy);
							copy.clear();
							punti=punti+2;
						}
					}
					else{
						copy.clear();
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
						if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
							cop++;
							copy.add(fg);
							if(cop==3) {
								m.addS(copy);
								copy.clear();
								punti=punti+2;
							}
						}
						else{
							copy.clear();
							cop = 0;
						
						}
							
						}
		
		}
		

		}
		 a.getManoscritto().setCarteUsate(m.getCarteUsate());
	     return punti;
		
	}


}