package componentiGioco;

import java.util.ArrayList;

public class CartaRisorsa extends Carta {
	
	private int puntiRis;
	private Risorsa risorsaPermanente;
	
    public CartaRisorsa(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,int punti,Colore col) {
   	 
    	super(id,angolo1,angolo2,angolo3,angolo4,col);
    	this.puntiRis=punti;
    	

    }
    
    public CartaRisorsa(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,Colore col,Risorsa ris) {
   	 
    	super(id,angolo1,angolo2,angolo3,angolo4,col,1);
    	this.risorsaPermanente=ris;
    }
    
    public static CartaRisorsa retroCarta(CartaRisorsa x) {
    	
    	Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		
		Risorsa ris = null;
		if(x.getColor()== Colore.azzurro) {
			ris = Risorsa.lupo;
		}
		else if(x.getColor()== Colore.rosso) {
			ris = Risorsa.fungo;
		}
		else if(x.getColor()== Colore.viola) {
			ris = Risorsa.farfalla;
		}
		else if(x.getColor()== Colore.verde) {
			ris = Risorsa.foglia;
		}
    	
    	CartaRisorsa y = new CartaRisorsa(x.getId(),angolo1,angolo2,angolo3,angolo4,x.getColor(),ris);
    	
    	return y;
    	
    }

	public int getPuntiRis() {
		return puntiRis;
	}
	
	/**
	 * creazione carte risorsa 
	 * @return String [][]
	 */
	
	public String [][] creaCarta() {
		
		//ATT! i vari spazi e assegnazioni manuali servono per rendere la stampa omogenea visivamente
		
		   
		   // assegnazione colori carta 
		   String colore = null;
		   String coloreS ="\033[48;2;213;212;179m";
	  	 if(this.getColor() == Colore.viola) {
	    	   colore= "\033[48;2;129;13;165m";
	    	  
	       }
	       
	       if(this.getColor() == Colore.verde) {
	    	   colore= "\033[48;2;28;165;13m";
	    	   
	       }
	       
	       if(this.getColor() == Colore.rosso) {
	    	   colore= "\033[48;2;189;15;15m";
	    	   
	       }
	       
	       if(this.getColor() == Colore.azzurro) {
	    	   colore= "\033[48;2;14;170;201m";
	    	   
	       }
	       
		   String[][] color = new String[10][5];
		   
// impostazione colori righe 
		   
		   for(int x=0;x<5;x++) {

	           for(int y=0;y<10;y++) {
	            
	                	   color[y][x]= colore+" ";
	                   
	           }

	       }
		   color[8][2] = colore+"   ";
		  
		   color[8][3] = colore+"   ";
		  
		   color[8][1] = colore+"   ";
		   
		   
		   //impostazione dei colori dei primi due angoli
		
	     if(this.getAngolo(0).getRisorsa()==null) {
	    	
	    	 color[0][0] = colore+"  ";

	     }else if(this.getAngolo(0).getRisorsa()==Risorsa.lupo){
	    	 color[0][0] = coloreS + "L ";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.farfalla){
	    	 color[0][0] = coloreS + "FA";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.foglia){
	    	 color[0][0] = coloreS + "F ";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.boccetta){
	    	 color[0][0] = coloreS + "B ";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.fungo){
	    	 color[0][0] = coloreS + "FU";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.pergamena){
	    	 color[0][0] = coloreS + "PE";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.piuma){
	    	 color[0][0] = coloreS + "P ";
	     }
	     else if(this.getAngolo(0).getRisorsa()==Risorsa.vuoto){
	    	 color[0][0] = coloreS + "  ";
	     }
	     
	     if(this.getAngolo(2).getRisorsa()==null) {
	     	
	    	 color[9][0] = colore+"  ";

	     }else if(this.getAngolo(2).getRisorsa()==Risorsa.lupo){
	    	 color[9][0] = coloreS + "L ";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.farfalla){
	    	 color[9][0] = coloreS + "FA";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.foglia){
	    	 color[9][0] = coloreS + "F ";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.boccetta){
	    	 color[9][0] = coloreS + "B ";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.fungo){
	    	 color[9][0] = coloreS + "FU";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.pergamena){
	    	 color[9][0] = coloreS + "PE";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.piuma){
	    	 color[9][0] = coloreS + "P ";
	     }
	     else if(this.getAngolo(2).getRisorsa()==Risorsa.vuoto){
	    	 color[9][0] = coloreS + "  ";
	     }
	     
	     //impostazione colori prima riga
	     
	     	if(this.puntiRis!=0) {
	    	 color[1][0] = colore+" ";
	    	 color[2][0] = colore+" ";
	    	 color[3][0] = colore+" ";
	    	 color[4][0] = coloreS + this.puntiRis + " ";
	    	 color[5][0] = colore+" ";
	    	 color[6][0] = colore+" ";
	    	 color[7][0] = colore+" ";
	    	 color[8][0] = colore;
	    	 
	     	}
	     	else {
	     		 color[1][0] = colore+" ";;
		    	 color[2][0] = colore+" ";;
		    	 color[3][0] = colore+" ";;
		    	 color[4][0] = colore+" ";
		    	 color[5][0] = colore+" ";;
		    	 color[6][0] = colore+" ";;
		    	 color[7][0] = colore+" ";;
		    	 color[8][0] = colore+" ";;
	     	}
	     
	     
	     	 if(this.risorsaPermanente!=null) {
		    	   if(this.risorsaPermanente==Risorsa.lupo){
		  	      	 color[4][2] = coloreS + "L ";
		  	       }
		  	       else if(this.risorsaPermanente==Risorsa.farfalla){
		  	    	 color[4][2] = coloreS + "FA";
		  	       }
		  	       else if(this.risorsaPermanente==Risorsa.foglia){
		  	    	 color[4][2] = coloreS + "F ";
		  	       }
		  	       else if(this.risorsaPermanente==Risorsa.fungo){
		  	    	 color[4][2] = coloreS + "FU";
			       }
		    	   color[9][1] = colore+" ";
		    	   color[9][2] = colore+"";
		    	   color[9][3] = colore+" ";
		       }
	     
	     
	       
	       //impostazione colori angoli ultima riga
	   	
	       if(this.getAngolo(1).getRisorsa()==null) {
	      	
	      	 color[0][4] = colore+"  ";

	       }else if(this.getAngolo(1).getRisorsa()==Risorsa.lupo){
	      	 color[0][4] = coloreS + "L ";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.farfalla){
	      	 color[0][4] = coloreS + "FA";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.foglia){
	      	 color[0][4] = coloreS + "F ";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.boccetta){
	      	 color[0][4] = coloreS + "B ";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.fungo){
	      	 color[0][4] = coloreS + "FU";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.pergamena){
	      	 color[0][4] = coloreS + "PE";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.piuma){
	      	 color[0][4] = coloreS + "P ";
	       }
	       else if(this.getAngolo(1).getRisorsa()==Risorsa.vuoto){
		    	 color[0][4] = coloreS + "  ";
		     }
	       
	       if(this.getAngolo(3).getRisorsa()==null) {
	       	
	      	 color[9][4] = colore+"  ";

	       }else if(this.getAngolo(3).getRisorsa()==Risorsa.lupo){
	      	 color[9][4] = coloreS + "L ";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.farfalla){
	      	 color[9][4] = coloreS + "FA";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.foglia){
	      	 color[9][4] = coloreS + "F ";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.boccetta){
	      	 color[9][4] = coloreS + "B ";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.fungo){
	      	 color[9][4] = coloreS + "FU";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.pergamena){
	      	 color[9][4] = coloreS + "PE";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.piuma){
	      	 color[9][4] = coloreS + "P ";
	       }
	       else if(this.getAngolo(3).getRisorsa()==Risorsa.vuoto){
		    	 color[9][4] = coloreS + "  ";
		   }
	       
	       //impostazione colori e richiesta carta, ultima riga
	    	   
	       color[8][4]=colore+" ";
	       
		return color;
		     	
	       
	      
	       
		   
	}
	
	public void stampaCarta() {
		
		String [][] color = creaCarta();
		
		for(int x=0;x<color[0].length;x++) {
  	      for(int y=0;y<color.length;y++) {
  	        System.out.print(color[y][x]+" ");
  	      }
  	      System.out.println("");
  	    }
       System.out.print("\033[0m ");
		
		
	}
	
	public void stampaCartaeRetro() {
		
		String [][] color = creaCarta();
		CartaRisorsa carta = retroCarta(this);
		String [][] color1 = carta.creaCarta();
		
		String spazi = "     ";
		   
		   for(int n=0;n<color[0].length;n++) {
			   System.out.print("\033[0m ");
		        System.out.print("   ");
	    	      for(int m=0;m<color.length;m++) {
	    	    	 
	    	        System.out.print(color[m][n]+" ");
	    	        
	    	      }
	    	      System.out.print("\033[0m ");
	    	      System.out.print(spazi);
	    	      
	    	      for(int m=0;m<color1.length;m++) {
		    	        System.out.print(color1[m][n]+" ");
		    	        
		    	  }
	    	      
	    	      System.out.println("");
	    	    }
			
	        System.out.print("\033[0m ");
	       
			System.out.println("\n");
		
		
	}

	public Risorsa getRisorsaPermanente() {
		return risorsaPermanente;
	}

}
