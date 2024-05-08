package gestioneObiettivi;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.CartaObiettivo;
import componentiGioco.Colore;
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
					int x=50;
					int y=50;
					int cop = 0;
					int cont = 0;
					while(y<90) {
						y =50+cont;
						x = 50-cont;
						cont++;
						cop = 0;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.viola && m.getCarta(xs--, ys--).getColor()==Colore.viola && m.getCarta(xs++, ys++).getColor()==Colore.viola  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs++, ys++))==false) {
									
									punti=punti+2;
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
					while(y>0) {
						y =50-cont;
						x = 50+cont;
						cont++;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.viola && m.getCarta(xs--, ys--).getColor()==Colore.viola && m.getCarta(xs++, ys++).getColor()==Colore.viola  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs++, ys++))==false) {
									
									punti=punti+2;
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
					int x=50;
					int y=50;
					int cop = 0;
					int cont = 0;
					while(y<90) {
						y =50+cont;
						x = 50-cont;
						cont++;
						cop = 0;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.verde && m.getCarta(xs--, ys--).getColor()==Colore.verde && m.getCarta(xs++, ys++).getColor()==Colore.verde  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs++, ys++))==false) {
									
									punti=punti+2;
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
					while(y>0) {
						y =50-cont;
						x = 50+cont;
						cont++;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.verde && m.getCarta(xs--, ys--).getColor()==Colore.verde && m.getCarta(xs++, ys++).getColor()==Colore.verde  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys--)) ==false && m.search(m.getCarta(xs++, ys++))==false) {
									
									punti=punti+2;
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
					int x=50;
					int y=50;
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
							if(m.getCarta(x, y).getColor()==Colore.rosso && m.getCarta(xs--, ys++).getColor()==Colore.rosso && m.getCarta(xs++, ys--).getColor()==Colore.rosso  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys++)) ==false && m.search(m.getCarta(xs++, ys--))==false) {
									
									punti=punti+2;
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
					while(x>0) {
						y =50-cont;
						x = 50-cont;
						cont++;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.rosso && m.getCarta(xs--, ys++).getColor()==Colore.rosso && m.getCarta(xs++, ys--).getColor()==Colore.rosso  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys++)) ==false && m.search(m.getCarta(xs++, ys--))==false) {
									
									punti=punti+2;
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
					int x=50;
					int y=50;
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
							if(m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs--, ys++).getColor()==Colore.azzurro && m.getCarta(xs++, ys--).getColor()==Colore.azzurro  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys++)) ==false && m.search(m.getCarta(xs++, ys--))==false) {
									
									punti=punti+2;
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
					while(x>0) {
						y =50-cont;
						x = 50-cont;
						cont++;
						int xs = x;
						int ys = y;
						if(m.getCarta(x, y)!=null) {
							if(m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs--, ys++).getColor()==Colore.azzurro && m.getCarta(xs++, ys--).getColor()==Colore.azzurro  ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs--, ys++)) ==false && m.search(m.getCarta(xs++, ys--))==false) {
									
									punti=punti+2;
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
		
		a.getManoscritto().setCarteUsate(m.getCarteUsate());
		return punti;
		
		
	}

}
