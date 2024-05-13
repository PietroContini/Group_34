package gestioneObiettivi;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.CartaObiettivo;
import componentiGioco.Colore;
import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class ManagerObiettivo {
	
	
	
	public int checkObiettivi(Giocatore a) {
		
		Manoscritto m = a.getManoscritto();
		
		ArrayList<CartaObiettivo> b = a.getCarteObiettivo();
		ArrayList<Carta> copy = new ArrayList<Carta>();
		
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
		//tripla viola
				if(b.get(0).getTipo().equalsIgnoreCase("\\viola")) {
					int x=46;
					int y=46;
					int cop = 0;
					int cont = 0;
					while(y<90) {
						y =46+cont;
						x = 46-cont;
						cont++;
						cop = 0;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.viola && m.getCarta(xs--, ys--).getColor()==Colore.viola && m.getCarta(xs+2, ys+2).getColor()==Colore.viola  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs+2, ys+2))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs--, ys--));
									copy.add(m.getCarta(xs+2, ys+2));
									m.addS(copy);
									punti=punti+2;
									copy.clear();
								}
							}
							
								int as=x; 
								int bs=y; 
								while(y<90) {
								Carta fg =	m.getCarta(as+1, bs+1);
								if(fg == null) {
									cop = 0;
									break;
								}
								if(fg.getColor()==Colore.viola && m.search(fg)==false) {
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
									Carta fg =	m.getCarta(as-1, bs-1);
									if(fg == null) {
										cop = 0;
										break;
									}
									if(fg.getColor()==Colore.viola && m.search(fg)==false) {
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
					while(y>0) {
						y =46-cont;
						x = 46+cont;
						cont++;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.viola && m.getCarta(xs--, ys--).getColor()==Colore.viola && m.getCarta(xs+2, ys+2).getColor()==Colore.viola  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs+2, ys+2))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs--, ys--));
									copy.add(m.getCarta(xs+2, ys+2));
									m.addS(copy);
									punti=punti+2;
									copy.clear();
								}
							}
							
								int as=x;
								int bs=y;
								while(y<90) {
								Carta fg =	m.getCarta(as+1, bs+1);
								if(fg == null) {
									cop = 0;
									break;
								}
								if(fg.getColor()==Colore.viola && m.search(fg)==false) {
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
									Carta fg =	m.getCarta(as-1, bs-1);
									if(fg == null) {
										cop = 0;
										break;
									}
									if(fg.getColor()==Colore.viola && m.search(fg)==false) {
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
				
					
					
				}
		//tripla verde
				if(b.get(0).getTipo().equalsIgnoreCase("\\verde")) {
					int x=46;
					int y=46;
					int cop = 0;
					int cont = 0;
					while(y<90) {
						y =46+cont;
						x = 46-cont;
						cont++;
						cop = 0;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.verde && m.getCarta(xs--, ys--).getColor()==Colore.verde && m.getCarta(xs+2, ys+2).getColor()==Colore.verde  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs+2, ys+2))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs--, ys--));
									copy.add(m.getCarta(xs+2, ys+2));
									m.addS(copy);
									punti=punti+2;
									copy.clear();
								}
							}
							
								int as=x; 
								int bs=y; 
								while(y<90) {
								Carta fg =	m.getCarta(as+1, bs+1);
								if(fg == null) {
									cop = 0;
									break;
								}
								if(fg.getColor()==Colore.verde && m.search(fg)==false) {
									
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
									Carta fg =	m.getCarta(as-1, bs-1);
									if(fg == null) {
										cop = 0;
										break;
									}
									if(fg.getColor()==Colore.verde && m.search(fg)==false) {
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
					while(y>0) {
						y =46-cont;
						x = 46+cont;
						cont++;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.verde && m.getCarta(xs--, ys--).getColor()==Colore.verde && m.getCarta(xs+2, ys+2).getColor()==Colore.verde  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs+2, ys+2))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs--, ys--));
									copy.add(m.getCarta(xs+2, ys+2));
									m.addS(copy);
									punti=punti+2;
									copy.clear();
								}
							}
							
								int as=x;
								int bs=y;
								while(y<90) {
								Carta fg =	m.getCarta(as+1, bs+1);
								if(fg == null) {
									cop = 0;
									break;
								}
								if(fg.getColor()==Colore.verde && m.search(fg)==false) {
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
									Carta fg =	m.getCarta(as-1, bs-1);
									if(fg == null) {
										cop = 0;
										break;
									}
									if(fg.getColor()==Colore.verde && m.search(fg)==false) {
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
				
					
					
				}
				
				// tripla rossa
				if(b.get(0).getTipo().equalsIgnoreCase("/rosso")) {
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
				
					
				}	
				
				
				// tripla azzurra
				if(b.get(0).getTipo().equalsIgnoreCase("/azzurra")) {
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
							if(m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs--, ys++).getColor()==Colore.azzurro && m.getCarta(xs+2, ys-2).getColor()==Colore.azzurro  ) {
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
								if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
									if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
							if(m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs--, ys++).getColor()==Colore.azzurro && m.getCarta(xs+2, ys-2).getColor()==Colore.azzurro  ) {
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
								if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
									if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
				
					
					
				}
				
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
				
				// forma a r
				if(b.get(0).getTipo().equalsIgnoreCase("r")) {
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
							if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs, ys+2).getColor()==Colore.azzurro && m.getCarta(xs+1, ys+3).getColor()==Colore.rosso  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys+2)) ==false && m.search(m.getCarta(xs+1, ys+3))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs, ys+2));
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
								if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
									cop++;
									copy.add(fg);
									
									fg = m.getCarta(xs,ys-2);
									
									if(fg == null) {
										cop = 0;
										copy.clear();
										break;
									}
									if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
										cop++;
										copy.add(fg);
									}
									fg = m.getCarta(xs+1,ys-1);
									
									if(fg == null) {
										cop = 0;
										copy.clear();
										break;
									}
									if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
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
									if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
										cop++;
										copy.add(fg);
										
										fg = m.getCarta(xs-1,ys+1);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
											cop++;
											copy.add(fg);
										}
										fg = m.getCarta(xs,ys+2);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
							if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs, ys+2).getColor()==Colore.azzurro && m.getCarta(xs+1, ys+3).getColor()==Colore.rosso  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys+2)) ==false && m.search(m.getCarta(xs+1, ys+3))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs, ys+2));
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
							if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
								cop++;
								copy.add(fg);
								
								fg = m.getCarta(xs,ys-2);
								
								if(fg == null) {
									cop = 0;
									copy.clear();
									break;
								}
								if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
									cop++;
									copy.add(fg);
								}
								fg = m.getCarta(xs+1,ys-1);
								
								if(fg == null) {
									cop = 0;
									copy.clear();
									break;
								}
								if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
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
									if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
										cop++;
										copy.add(fg);
										
										fg = m.getCarta(xs-1,ys+1);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
											cop++;
											copy.add(fg);
										}
										fg = m.getCarta(xs,ys+2);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
				
					
					
				}
				
				// forma a 1
				if(b.get(0).getTipo().equalsIgnoreCase("1")) {
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
							if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs, ys+2).getColor()==Colore.azzurro && m.getCarta(xs-1, ys+3).getColor()==Colore.rosso  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys+2)) ==false && m.search(m.getCarta(xs-1, ys+3))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs, ys+2));
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
									
									fg = m.getCarta(xs,ys-2);
									
									if(fg == null) {
										cop = 0;
										copy.clear();
										break;
									}
									if(fg.getColor()==Colore.viola && m.search(fg)==false) {
										cop++;
										copy.add(fg);
									}
									fg = m.getCarta(xs-1,ys-1);
									
									if(fg == null) {
										cop = 0;
										copy.clear();
										break;
									}
									if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
									if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
										cop++;
										copy.add(fg);
										
										fg = m.getCarta(xs+1,ys+1);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.viola && m.search(fg)==false) {
											cop++;
											copy.add(fg);
										}
										fg = m.getCarta(xs,ys+2);
										
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
							if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs, ys+2).getColor()==Colore.azzurro && m.getCarta(xs-1, ys+3).getColor()==Colore.rosso  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys+2)) ==false && m.search(m.getCarta(xs-1, ys+3))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(xs, ys+2));
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
								
								fg = m.getCarta(xs,ys-2);
								
								if(fg == null) {
									cop = 0;
									copy.clear();
									break;
								}
								if(fg.getColor()==Colore.viola && m.search(fg)==false) {
									cop++;
									copy.add(fg);
								}
								fg = m.getCarta(xs-1,ys-1);
								
								if(fg == null) {
									cop = 0;
									copy.clear();
									break;
								}
								if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
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
									if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
										cop++;
										copy.add(fg);
										
										fg = m.getCarta(xs+1,ys+1);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.viola && m.search(fg)==false) {
											cop++;
											copy.add(fg);
										}
										fg = m.getCarta(xs,ys+2);
										
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
					
				}
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
					// forma a L
					if(b.get(0).getTipo().equalsIgnoreCase("L")) {
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
									if(fg.getColor()==Colore.verde && m.search(fg)==false) {
										cop++;
										copy.add(fg);
										
										fg = m.getCarta(x-1,ys-1);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
											cop++;
											copy.add(fg);
										}
										fg = m.getCarta(xs,ys-2);
										
										if(fg == null) {
											cop = 0;
											copy.clear();
											break;
										}
										if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
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
										if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
											cop++;
											copy.add(fg);
											
											fg = m.getCarta(xs,ys+2);
											
											if(fg == null) {
												cop = 0;
												copy.clear();
												break;
											}
											if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
												cop++;
												copy.add(fg);
											}
											fg = m.getCarta(xs+1,ys+1);
											
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
								if(fg.getColor()==Colore.verde && m.search(fg)==false) {
									cop++;
									copy.add(fg);
									
									fg = m.getCarta(x-1,ys-1);
									
									if(fg == null) {
										cop = 0;
										copy.clear();
										break;
									}
									if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
										cop++;
										copy.add(fg);
									}
									fg = m.getCarta(xs,ys-2);
									
									if(fg == null) {
										cop = 0;
										copy.clear();
										break;
									}
									if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
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
										if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
											cop++;
											copy.add(fg);
											
											fg = m.getCarta(xs,ys+2);
											
											if(fg == null) {
												cop = 0;
												copy.clear();
												break;
											}
											if(fg.getColor()==Colore.rosso && m.search(fg)==false) {
												cop++;
												copy.add(fg);
											}
											fg = m.getCarta(xs+1,ys+1);
											
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
							}
						}
					}
				
					// forma a J
					if(b.get(0).getTipo().equalsIgnoreCase("J")) {
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
					}
					
				if(b.get(0).getTipo().equalsIgnoreCase("fungo")) {
					int cont = a.ricercaRisorsa(Risorsa.fungo);
					punti = (cont/3)*2;
				}
				
				if(b.get(0).getTipo().equalsIgnoreCase("lupo")) {
					int cont = a.ricercaRisorsa(Risorsa.lupo);
					punti = (cont/3)*2;
				}
				
				if(b.get(0).getTipo().equalsIgnoreCase("farfalla")) {
					int cont = a.ricercaRisorsa(Risorsa.farfalla);
					punti = (cont/3)*2;
				}
				
				if(b.get(0).getTipo().equalsIgnoreCase("foglia")) {
					int cont = a.ricercaRisorsa(Risorsa.foglia);
					punti = (cont/3)*2;
				}
				
				if(b.get(0).getTipo().equalsIgnoreCase("piuma")) {
					int cont = a.ricercaRisorsa(Risorsa.piuma);
					punti = (cont/2)*2; //tolgo caso dispari
				}
				
				if(b.get(0).getTipo().equalsIgnoreCase("pergamena")) {
					int cont = a.ricercaRisorsa(Risorsa.pergamena);
					punti = (cont/2)*2; //tolgo caso dispari
				}
				
				if(b.get(0).getTipo().equalsIgnoreCase("boccetta")) {
					int cont = a.ricercaRisorsa(Risorsa.boccetta);
					punti = (cont/2)*2; //tolgo caso dispari
				}
				
				
		
		a.getManoscritto().setCarteUsate(m.getCarteUsate());
		return punti;
		
		
	}

}
