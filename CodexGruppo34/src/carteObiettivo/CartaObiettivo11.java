package carteObiettivo;


import componentiGioco.Risorsa;
import gestioneGioco.Giocatore;


public class CartaObiettivo11 {
	
	/**
	 * verifica obiettivo tre lupi carta obiettivo
	 * @param Giocatore a
	 * @return
	 */
	public static int checkObietTreLupi(Giocatore a) {
		
		 int punti = 0;
		 
		 int cont = a.ricercaRisorsa(Risorsa.lupo);
			punti = (cont/3)*2;
		 
		 
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
		
		/**
		 * assegnazione colori, impostazioni colori righe
		 * @return String [][]
		 */
		
		public static String [][] creaCarta() {
			// assegnazione colori carta 
			  
			   String colore = "\033[48;2;213;212;179m ";
			   String coloreS = "\033[48;2;171;158;53m ";
			   String azzurro = "\033[48;2;14;170;201m ";
			   String coloreSp = "\033[48;2;235;231;137m";
		  	
		       
			   String[][] color = new String[10][5];
			   
			// impostazione colori righe 
		        for(int x=0;x<5;x++) {

		           for(int y=0;y<10;y++) {
		            
		                	   color[y][x]= azzurro;
		                   
		           }

		        }
		        
		        for(int y=0;y<10;y++) {
		            
		        	color[y][0]= coloreS;
	  
		        }

		        for(int y=0;y<10;y++) {
		            
		           color[y][4]= coloreS;
		            
			    }
			          
		        for(int x=0;x<5;x++) {

			        color[9][x]= coloreS;
			
			    }
			   
		        for(int x=0;x<5;x++) {

			        color[0][x]= coloreS;
			
			    }
		        
		        color[2][2]= azzurro+" ";
		        color[2][3]= azzurro+" ";
		        color[2][1]= azzurro+" ";
		        
		        color[1][2]= "\033[48;2;235;216;142m";
		        color[1][3]= "\033[48;2;235;216;142m";
		        color[1][1]= "\033[48;2;235;216;142m";
		        
		        color[8][2]= "\033[48;2;235;216;142m";
		        color[8][3]= "\033[48;2;235;216;142m";
		        color[8][1]= "\033[48;2;235;216;142m";
		    	   
				color[3][2] = coloreSp +"2";
				color[4][2] = coloreSp +"p";
				
				color[6][3] = coloreSp +"L ";
				color[6][2] = coloreSp +"L ";
				color[6][1] = coloreSp +"L ";
				
				return color;
				
					
			
		}
}