package componentiGioco;

import java.util.ArrayList;



public class CartaIniziale extends Carta {
	
	private ArrayList<Risorsa> risorseBase = null;
	private TipoIni tipo;
	
	

    public CartaIniziale(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,ArrayList <Risorsa> richiesta) {
    	 
    	super(id,angolo1,angolo2,angolo3,angolo4,1);
    	this.risorseBase = richiesta;

    }

	public CartaIniziale(String id,Angolo angolo1, Angolo angolo2, Angolo angolo3, Angolo angolo4,TipoIni tipo) {
		super(id,angolo1,angolo2,angolo3,angolo4);
		this.tipo=tipo;
	}

	public TipoIni getTipo() {
		return tipo;
	}
    
    public static CartaIniziale retroCarta(CartaIniziale x) {
    	
    	Angolo angolo1 = new Angolo();
		Angolo angolo2 = new Angolo();
		Angolo angolo3 = new Angolo();
		Angolo angolo4 = new Angolo();
		
    	if(x.tipo == TipoIni.CartaIni1) {
    	ArrayList<Risorsa> listaIni1 = new ArrayList<> ();
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		
		listaIni1.add(Risorsa.farfalla);
		
		CartaIniziale cartaIni1 = new CartaIniziale(x.getId(),angolo1,angolo2,angolo3,angolo4,listaIni1);
		return cartaIni1;
		
    	}
    	else if(x.tipo == TipoIni.CartaIni2) {
    	ArrayList<Risorsa> listaIni2 = new ArrayList<> ();
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		listaIni2.add(Risorsa.fungo);
		
		CartaIniziale cartaIni2 = new CartaIniziale(x.getId(),angolo1,angolo2,angolo3,angolo4,listaIni2);
		return cartaIni2;
		
    	}
    	else if(x.tipo == TipoIni.CartaIni3) {
    	ArrayList<Risorsa> listaIni3 = new ArrayList<> ();
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		listaIni3.add(Risorsa.foglia);
		listaIni3.add(Risorsa.fungo);
		
		CartaIniziale cartaIni3 = new CartaIniziale(x.getId(),angolo1,angolo2,angolo3,angolo4,listaIni3);
		return cartaIni3;
		
    	}
    	else if(x.tipo == TipoIni.CartaIni4) {
    	ArrayList<Risorsa> listaIni4 = new ArrayList<> ();
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		listaIni4.add(Risorsa.lupo);
		listaIni4.add(Risorsa.farfalla);
		
		CartaIniziale cartaIni4 = new CartaIniziale(x.getId(),angolo1,angolo2,angolo3,angolo4,listaIni4);
		return cartaIni4;
    	}
    	else if(x.tipo == TipoIni.CartaIni5) {
    	ArrayList<Risorsa> listaIni5 = new ArrayList<> ();
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		listaIni5.add(Risorsa.lupo);
		listaIni5.add(Risorsa.farfalla);
		listaIni5.add(Risorsa.foglia);
		
		CartaIniziale cartaIni5 = new CartaIniziale(x.getId(),angolo1,angolo2,angolo3,angolo4,listaIni5);
		return cartaIni5;
    	}
    	else if(x.tipo == TipoIni.CartaIni6) {
    	ArrayList<Risorsa> listaIni6 = new ArrayList<> ();
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		listaIni6.add(Risorsa.foglia);
		listaIni6.add(Risorsa.lupo);
		listaIni6.add(Risorsa.fungo);
		
		CartaIniziale cartaIni6 = new CartaIniziale(x.getId(),angolo1,angolo2,angolo3,angolo4,listaIni6);
		return cartaIni6;
		
    	}
		return null;
    }

	public ArrayList<Risorsa> getRisorseBase() {
		return risorseBase;
	}
	
	
	
	public String [][] creaCarta() {
		  // assegnazione colori carta 
		  
		   String colore = "\033[48;2;213;212;179m";
		   String coloreS = "\033[48;2;235;231;137m";
	  	
	       
		   String[][] color = new String[10][5];
		   
		// impostazione colori righe 
	        for(int x=0;x<5;x++) {

	           for(int y=0;y<10;y++) {
	            
	                	   color[y][x]= colore;
	                   
	           }

	       }
		   
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
	       
	       //impostazione colori e risorse base
	    	   
				  
			if(this.risorseBase!=null) {
				/*	 {0,0,0,0,0,0,0,0,0,0
					  0,0,0,0,0,0,0,0,0,0
					  0,0,0,0,0,0,0,0,0,0
					  0,0,0,0,0,0,0,0,0,0
					  0,0,0,0,0,0,0,0,0,0}
					  
					  */
				//abbellimento carta 
				 color[4][1] = "\033[48;2;255;215;0m";
				 color[4][2] = "\033[48;2;255;215;0m";
				 color[4][3] = "\033[48;2;255;215;0m";
				 color[3][2] = "\033[48;2;255;215;0m";
				 
				 color[6][1] = "\033[48;2;255;215;0m";
				 color[6][2] = "\033[48;2;255;215;0m";
				 color[6][3] = "\033[48;2;255;215;0m";
				 color[7][2] = "\033[48;2;255;215;0m";
				 
				 color[9][1] = " ";
				 color[9][2] = " ";
				 color[9][3] = " ";
				 
				 color[5][1] = "   ";
				 color[5][2] = "   ";
				 color[5][3] = "   ";
				 int o=1;
				for(int i=0;i<this.risorseBase.size();i++) {
					
					  if(this.risorseBase.get(i)==null) {
				       	
				      	 color[5][o] = "\033[48;2;255;215;0m  ";

				       }else if(this.risorseBase.get(i)==Risorsa.lupo){
				      	 color[5][o] = coloreS + " L ";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.farfalla){
				      	 color[5][o] = coloreS + " FA";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.foglia){
				      	 color[5][o] = coloreS + " F ";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.boccetta){
				      	 color[5][o] = coloreS + " B ";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.fungo){
				      	 color[5][o] = coloreS + " FU";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.pergamena){
				      	 color[5][o] = coloreS + " PE";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.piuma){
				      	 color[5][o] = coloreS + " P ";
				       }
				       else if(this.risorseBase.get(i)==Risorsa.vuoto){
					    	 color[5][o] = coloreS + "   ";
					   }
					
					o++;
					
				}
				
			}
			else {
				 color[4][1] = "\033[48;2;255;215;0m  ";
				 color[4][2] = "\033[48;2;255;215;0m  ";
				 color[4][3] = "\033[48;2;255;215;0m  ";
				 color[3][2] = "\033[48;2;255;215;0m";
				 
				 color[5][1] = "\033[48;2;255;215;0m  ";
				 color[5][2] = "\033[48;2;255;215;0m  ";
				 color[5][3] = "\033[48;2;255;215;0m  ";
				 color[6][2] = "\033[48;2;255;215;0m";
				
				
			}
	       
	       
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
		CartaIniziale carta = retroCarta(this);
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
}
