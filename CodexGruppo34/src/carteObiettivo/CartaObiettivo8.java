package carteObiettivo;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.Colore;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class CartaObiettivo8 {



public static int checkObietFormaJ(Giocatore a) {
	
	Manoscritto m = a.getManoscritto();
	ArrayList<Carta> copy = new ArrayList<Carta>();
	
	int punti = 0;
	
	// forma a J
		int x=46;
		int y=46;
		int cop = 0;
		int cont = 0;
		while(x<90) {
			y =50+cont;
			x = 50+cont;
			cont++;
			cop = 0;
			int xs = x;
			int ys = y;
			if(m.getCarta(x, y)!=null) {
				if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.verde && m.getCarta(xs, ys-2).getColor()==Colore.verde && m.getCarta(xs-1, ys+3).getColor()==Colore.viola  ) {
					xs=x; 
					ys=y;
					if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys-2)) ==false && m.search(m.getCarta(xs-1, ys+3))==false) {
						copy.add(m.getCarta(x, y));
						xs=x; 
						ys=y;
						copy.add(m.getCarta(xs, ys-2));
						copy.add(m.getCarta(xs-1, ys+3));
						m.addS(copy);
						punti=punti+2;
						copy.clear();
					}
					
				}
				
				
					int as=x;
					int bs=y;
					while(y<90) {
					Carta fg =	m.getCarta(as-1, bs+1);
					xs=as;
					ys=bs;
					if(fg == null) {
						cop = 0;
						break;
					}
					if(fg.getColor()==Colore.viola && m.search(fg)==false) {
						cop++;
						copy.add(fg);
						
						fg = m.getCarta(x+1,ys+1);
						
						if(fg == null) {
							cop = 0;
							copy.clear();
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
						}
						fg = m.getCarta(xs,ys-2);
						
						if(fg == null) {
							cop = 0;
							copy.clear();
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
						}
						
						if(cop==3) {
							m.addS(copy);
							copy.clear();
							punti=punti+2;
						}
						else{
							copy.clear();
							cop = 0;
						}
					}
					else{
						copy.clear();
						cop = 0;
					}
						
					}
					as=x;
					bs=y;
					xs=x;
					ys=y;
					while(y>0) {
						Carta fg =	m.getCarta(as+1, bs-1);
						xs=as;
						ys=bs;
						if(fg == null) {
							cop = 0;
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
							
							fg = m.getCarta(xs,ys+2);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.verde && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							fg = m.getCarta(xs-1,ys+1);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.viola && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							
							if(cop==3) {
								m.addS(copy);
								copy.clear();
								punti=punti+2;
							}
							else{
								copy.clear();
								cop = 0;
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
				if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.rosso && m.getCarta(xs, ys-2).getColor()==Colore.rosso && m.getCarta(xs+1, ys+3).getColor()==Colore.verde  ) {
					xs=x; 
					ys=y;
					if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys-2)) ==false && m.search(m.getCarta(xs+1, ys+3))==false) {
						copy.add(m.getCarta(x, y));
						xs=x; 
						ys=y;
						copy.add(m.getCarta(xs, ys-2));
						copy.add(m.getCarta(xs+1, ys+3));
						m.addS(copy);
						punti=punti+2;
						copy.clear();
					}
					
				}
				
				
				int as=x;
				int bs=y;
				while(y<90) {
				Carta fg =	m.getCarta(as-1, bs+1);
				xs=as;
				ys=bs;
				if(fg == null) {
					cop = 0;
					break;
				}
				if(fg.getColor()==Colore.viola && m.search(fg)==false) {
					cop++;
					copy.add(fg);
					
					fg = m.getCarta(x+1,ys+1);
					
					if(fg == null) {
						cop = 0;
						copy.clear();
						break;
					}
					if(fg.getColor()==Colore.verde && m.search(fg)==false) {
						cop++;
						copy.add(fg);
					}
					fg = m.getCarta(xs,ys-2);
					
					if(fg == null) {
						cop = 0;
						copy.clear();
						break;
					}
					if(fg.getColor()==Colore.verde && m.search(fg)==false) {
						cop++;
						copy.add(fg);
					}
					
					
					
					if(cop==3) {
						m.addS(copy);
						copy.clear();
						punti=punti+2;
					}
					else{
						copy.clear();
						cop = 0;
					}
				}
				else{
					copy.clear();
					cop = 0;
				}
					
				}
				as=x;
				bs=y;
				xs=x;
				ys=y;
					while(y>0) {
						Carta fg =	m.getCarta(as+1, bs-1);
						xs=as;
						ys=bs;
						if(fg == null) {
							cop = 0;
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
							
							fg = m.getCarta(xs,ys+2);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.verde && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							fg = m.getCarta(xs-1,ys+1);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.viola && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							
							if(cop==3) {
								m.addS(copy);
								copy.clear();
								punti=punti+2;
							}
							else{
								copy.clear();
								cop = 0;
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