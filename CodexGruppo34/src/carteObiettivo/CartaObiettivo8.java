package carteObiettivo;

import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.Colore;
import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;

public class CartaObiettivo8 {

	public static int checkObietForma1(Giocatore a) {
		
		Manoscritto m = a.getManoscritto();
		ArrayList<Carta> copy = new ArrayList<Carta>();
		
		int punti = 0;
		
		// forma a 1
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
					if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs, ys=ys+2).getColor()==Colore.azzurro && m.getCarta(--xs, ys=ys+3).getColor()==Colore.rosso  ) {
						xs=x; 
						ys=y;
						if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys=ys+2)) ==false && m.search(m.getCarta(--xs, ys=ys+3))==false) {
							copy.add(m.getCarta(x, y));
							xs=x; 
							ys=y;
							copy.add(m.getCarta(xs, ys=ys+2));
							copy.add(m.getCarta(--xs, ys=ys+3));
							m.addS(copy);
							punti=punti+2;
							copy.clear();
						}
						
					}
					
					
						int as=x;
						int bs=y;
						while(y<90) {
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
							
							fg = m.getCarta(xs, ys=ys-2);
							
							if(fg == null) {
								cop = 0;
								copy.clear();
								break;
							}
							if(fg.getColor()==Colore.viola && m.search(fg)==false) {
								cop++;
								copy.add(fg);
							}
							fg = m.getCarta(--xs,--ys);
							
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
							Carta fg =	m.getCarta(++as, --bs);
							xs=as;
							ys=bs;
							if(fg == null) {
								cop = 0;
								break;
							}
							if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
								cop++;
								copy.add(fg);
								
								fg = m.getCarta(++xs,++ys);
								
								if(fg == null) {
									cop = 0;
									copy.clear();
									break;
								}
								if(fg.getColor()==Colore.viola && m.search(fg)==false) {
									cop++;
									copy.add(fg);
								}
								fg = m.getCarta(xs, ys=ys+2);
								
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
					if(x!=46 && y!=46 && m.getCarta(x, y).getColor()==Colore.azzurro && m.getCarta(xs, ys=ys+2).getColor()==Colore.azzurro && m.getCarta(--xs, ys=ys+3).getColor()==Colore.rosso  ) {
						xs=x; 
						ys=y;
						if(m.search(m.getCarta(x, y))==false && m.search(m.getCarta(xs, ys=ys+2)) ==false && m.search(m.getCarta(--xs, ys=ys+3))==false) {
							copy.add(m.getCarta(x, y));
							xs=x; 
							ys=y;
							copy.add(m.getCarta(xs, ys=ys+2));
							copy.add(m.getCarta(--xs, ys=ys+3));
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
						
						fg = m.getCarta(xs, ys=ys-2);
						
						if(fg == null) {
							cop = 0;
							copy.clear();
							break;
						}
						if(fg.getColor()==Colore.viola && m.search(fg)==false) {
							cop++;
							copy.add(fg);
						}
						fg = m.getCarta(--xs,--ys);
						
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
							Carta fg =	m.getCarta(++as, --bs);
							xs=as;
							ys=bs;
							if(fg == null) {
								cop = 0;
								break;
							}
							if(fg.getColor()==Colore.azzurro && m.search(fg)==false) {
								cop++;
								copy.add(fg);
								
								fg = m.getCarta(++xs,++ys);
								
								if(fg == null) {
									cop = 0;
									copy.clear();
									break;
								}
								if(fg.getColor()==Colore.viola && m.search(fg)==false) {
									cop++;
									copy.add(fg);
								}
								fg = m.getCarta(xs, ys=ys+2);
								
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
	    	   
			color[2][2] = coloreSp +"3";
			color[3][2] = coloreSp +"p";
			
			color[6][3] = viola;
			color[6][2] = viola;
			color[5][1] = "\033[48;2;14;170;201m ";
			
			return color;
			
		
	}


}