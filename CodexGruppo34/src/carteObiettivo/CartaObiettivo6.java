package carteObiettivo;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.Colore;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class CartaObiettivo6 {


	
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
			y =46+cont;
			x = 46+cont;
			cont++;
			cop = 0;
			int xs = x;
			int ys = y;
			if(x<90 && y<90) {
			if(m.getCarta(x, y)!=null) {
				if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.verde  ) {
					if(m.getCarta(xs, ys=ys-2)!=null && m.getCarta(--xs, ys=ys+3)!=null) {
						xs=x; 
						ys=y;
						if(m.getCarta(xs, ys=ys-2).getColor()==Colore.verde && m.getCarta(--xs, ys=ys+3).getColor()==Colore.viola ) {
							xs=x; 
							ys=y;
							if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys=ys-2)) ==false && m.search(m.getCarta(--xs, ys=ys+3))==false) {
								copy.add(m.getCarta(x, y));
								xs=x; 
								ys=y;
								copy.add(m.getCarta(xs, ys=ys-2));
								copy.add(m.getCarta(--xs, ys=ys+3));
								m.addS(copy);
								punti=punti+2;
								copy.clear();
							}
						}
					}
				}
				
				
					int as=x;
					int bs=y;
					while(bs<90) {
					Carta fg =	m.getCarta(--as, ++bs);
					xs=as;
					ys=bs;
					if(fg == null) {
						cop = 0;
						break;
					}
					if(fg.getColor()==Colore.viola && m.search(fg)==false) {
						cop++;
						copy.add(fg);
						
						fg = m.getCarta(++xs,++ys);
						
						if(fg == null) {
							cop = 0;
							copy.clear();
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
						}
						fg = m.getCarta(xs, ys=ys-2);
						
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
					while(bs>0) {
						Carta fg =	m.getCarta(++as, --bs);
						xs=as;
						ys=bs;
						if(fg == null) {
							cop = 0;
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
							
							fg = m.getCarta(xs, ys=ys+2);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.verde && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							fg = m.getCarta(--xs,++ys);
							
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
		cont = 0;
		while(x>0) {
			y =46-cont;
			x = 46-cont;
			cont++;
			int xs = x;
			int ys = y;
			if(x>=0 && y>=0) {
			if(m.getCarta(x, y)!=null) {
				if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.verde  ) {
					if(m.getCarta(xs, ys=ys-2)!=null && m.getCarta(--xs, ys=ys+3)!=null) {
						xs=x; 
						ys=y;
						if(m.getCarta(xs, ys=ys-2).getColor()==Colore.verde && m.getCarta(--xs, ys=ys+3).getColor()==Colore.viola ) {
							xs=x; 
							ys=y;
							if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys=ys-2)) ==false && m.search(m.getCarta(--xs, ys=ys+3))==false) {
								copy.add(m.getCarta(x, y));
								xs=x; 
								ys=y;
								copy.add(m.getCarta(xs, ys=ys-2));
								copy.add(m.getCarta(--xs, ys=ys+3));
								m.addS(copy);
								punti=punti+2;
								copy.clear();
							}
						}
					}
					
				}
				
				
				int as=x;
				int bs=y;
				while(bs<90) {
				Carta fg =	m.getCarta(--as, ++bs);
				xs=as;
				ys=bs;
				if(fg == null) {
					cop = 0;
					break;
				}
				if(fg.getColor()==Colore.viola && m.search(fg)==false) {
					cop++;
					copy.add(fg);
					
					fg = m.getCarta(++x,++ys);
					
					if(fg == null) {
						cop = 0;
						copy.clear();
						break;
					}
					if(fg.getColor()==Colore.verde && m.search(fg)==false) {
						cop++;
						copy.add(fg);
					}
					fg = m.getCarta(xs, ys=ys-2);
					
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
					while(bs>0) {
						Carta fg =	m.getCarta(++as, --bs);
						xs=as;
						ys=bs;
						if(fg == null) {
							cop = 0;
							break;
						}
						if(fg.getColor()==Colore.verde && m.search(fg)==false) {
							cop++;
							copy.add(fg);
							
							fg = m.getCarta(xs, ys=ys+2);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.verde && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							fg = m.getCarta(--xs,++ys);
							
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
	
	
		
		 m.getCarteUsate().clear();
	     return punti;
		
	}

	public static void stampaCarta() {
		  
			String color[][] = creaCarta();
		       
	     	for(int x=0;x<color[0].length;x++) {
	    	      for(int y=0;y<color.length;y++) {
	    	        System.out.print(color[y][x]+" ");
	    	      }
	    	      System.out.println("");
	    	    }
	       System.out.print("\033[0m ");
	   
	}

	public static String [][] creaCarta() {
		
		// assegnazione colori carta 
		  
		   String colore = "\033[48;2;213;212;179m ";
		   String coloreS = "\033[48;2;255;215;0m ";
		   String verde = "\033[48;2;28;165;13m ";
		   String verdeS = "\033[48;2;28;150;13m ";
		   String coloreSp = "\033[48;2;235;231;137m";
	  	
	       
		   String[][] color = new String[10][5];
		   
		// impostazione colori righe 
	        for(int x=0;x<5;x++) {

	           for(int y=0;y<10;y++) {
	            
	                	   color[y][x]= colore;
	                   
	           }

	        }
	        
	        for(int y=0;y<10;y++) {
	            
	   color[y][0]= coloreS;
  
	        }

	        for(int y=0;y<10;y++) {
	            
	           color[y][4]= coloreS;
	            
		    }
		          
	        for(int x=0;x<5;x++) {

		        color[9][x]= verdeS;
		
		    }
		   
	        for(int x=0;x<5;x++) {

		        color[0][x]= verdeS;
		
		    }
	    	   
			color[2][2] = coloreSp +"3";
			color[3][2] = coloreSp +"p";
			
			color[5][3] = "\033[48;2;129;13;165m ";
			color[6][2] = verde;
			color[6][1] = verde;
			
			return color;
			
				
				
		
	}
}