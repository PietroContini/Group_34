package carteObiettivo;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.Colore;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class CartaObiettivo3 {



	public static int checkObietTripleViola(Giocatore a) {
		
		Manoscritto m = a.getManoscritto();
		ArrayList<Carta> copy = new ArrayList<Carta>();
		
		int punti = 0;
		
		//tripla viola
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
				if(x>=0 && y<90) {
				if(m.getCarta(x, y)!=null) {
					if(m.getCarta(x, y).getColor()==Colore.viola ) {
						if(m.getCarta(--xs, --ys)!=null && m.getCarta(xs=xs+2, ys=ys+2)!=null) {
							xs=x; 
							ys=y;
							if(m.getCarta(--xs, --ys).getColor()==Colore.viola && m.getCarta(xs=xs+2, ys=ys+2).getColor()==Colore.viola ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(--xs, --ys)) ==false && m.search(m.getCarta(xs=xs+2, ys=ys+2))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(--xs, --ys));
									copy.add(m.getCarta(xs=xs+2, ys=ys+2));
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
						Carta fg =	m.getCarta(++as, ++bs);
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
						while(bs>0) {
							Carta fg =	m.getCarta(--as, --bs);
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
			cont = 0;
			while(y>0) {
				y =46-cont;
				x = 46+cont;
				cont++;
				int xs = x;
				int ys = y;
				if(x<90 && y>=0) {
				if(m.getCarta(x, y)!=null) {
					if(m.getCarta(x, y).getColor()==Colore.viola ) {
						if(m.getCarta(--xs, --ys)!=null && m.getCarta(xs=xs+2, ys=ys+2)!=null) {
							xs=x; 
							ys=y;
							if(m.getCarta(--xs, --ys).getColor()==Colore.viola && m.getCarta(xs=xs+2, ys=ys+2).getColor()==Colore.viola ) {
								xs=x; 
								ys=y;
								if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(--xs, --ys)) ==false && m.search(m.getCarta(xs=xs+2, ys=ys+2))==false) {
									copy.add(m.getCarta(x, y));
									xs=x; 
									ys=y;
									copy.add(m.getCarta(--xs, --ys));
									copy.add(m.getCarta(xs=xs+2, ys=ys+2));
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
						Carta fg =	m.getCarta(++as, ++bs);
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
						while(as>0) {
							Carta fg =	m.getCarta(--as, --bs);
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
		   String viola = "\033[48;2;129;13;165m ";
		   String violaS = "\033[48;2;110;13;165m ";
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

		        color[9][x]= violaS;
		
		    }
		   
	        for(int x=0;x<5;x++) {

		        color[0][x]= violaS;
		
		    }
	    	   
			color[2][2] = coloreSp +"2";
			color[3][2] = coloreSp +"p";
			
			color[7][3] = viola;
			color[6][2] = viola;
			color[5][1] = viola;
			
			return color;
			
		
	}
	

}