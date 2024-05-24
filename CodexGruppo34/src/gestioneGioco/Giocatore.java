package gestioneGioco;
import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;
import componentiGioco.Colore;
import componentiGioco.PuntiPerCarta;
import componentiGioco.Risorsa;
import gestioneObiettivi.ManagerPunti;

import java.util.ArrayList;
import java.util.Scanner;


public class Giocatore {
	
	private String nome;
	private ArrayList<Carta> carteInMano;
	private ArrayList<CartaObiettivo> carteObiettivo;
	private Manoscritto manoscritto;
	private int punti;
	private ArrayList<Risorsa> risorseVisibili;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPunti() {
		return punti;
	}
	
	public void pescaCartaIni() {
		
		carteInMano.add(Partita.pescaCartaIni());
	}
	
	public void pescaCartaRis() {
		
		carteInMano.add(Partita.pescaCartaRis());
	}
	public void pescaCartaOro() {
		
		carteInMano.add(Partita.pescaCartaOro());
	}
	public void pescaCartaObiettivo() {
		
		carteObiettivo.add(Partita.pescaCartaObiettivo());
	}
	public void pescaCartaTavolo(int i) {
		
		carteInMano.add(Partita.pescaCartaTavolo(i));
	}
	
	public ArrayList<CartaObiettivo> getCarteObiettivo() {
		return carteObiettivo;
	}
	
	public Manoscritto getManoscritto() {
		return manoscritto;
	}
	
	public void removeRisorsa(Risorsa risorsa) {
		risorseVisibili.remove(risorsa);
		
	}
	
	public int ricercaRisorsa(Risorsa risorsa) {
		int cont = 0;
		for(int i=0;i<risorseVisibili.size();i++) {
			if(risorseVisibili.get(i)==risorsa) {
				cont++;
			}
		}
		return cont;
	}
	
	public boolean checkRichiesta(CartaOro carta) {
		ArrayList<Risorsa> risorse = carta.getRichiesta();
		int cont = 0;
		if(ricercaRisorsa(Risorsa.foglia)>=ricercaRisorsa(Risorsa.foglia,risorse)) {
			cont++;
		
		}
		else 	if(ricercaRisorsa(Risorsa.farfalla)>=ricercaRisorsa(Risorsa.farfalla,risorse)) {
			cont++;
		
		}
		else 	if(ricercaRisorsa(Risorsa.lupo)>=ricercaRisorsa(Risorsa.lupo,risorse)) {
			cont++;
		
		}
		else 	if(ricercaRisorsa(Risorsa.fungo)>=ricercaRisorsa(Risorsa.fungo,risorse)) {
			cont++;
		
		}
		if(cont==4) {
			return true;
		}
		return false;
		
	}
	
	public int ricercaRisorsa(Risorsa risorsa,ArrayList<Risorsa> risorse) {
		int cont = 0;
		for(int i=0;i<risorse.size();i++) {
			if(risorse.get(i)==risorsa) {
				cont++;
			}
		}
		return cont;
	}
	
	public void piazzaCarta(Partita partita, Carta carta,int x,int y) {
		
		if(carta instanceof CartaIniziale) {
			this.getManoscritto().piazzaCarta(carta, 46, 46);
			CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
			this.risorseVisibili.addAll(cartaIniziale.risorseAngoli());
			if(cartaIniziale.getRisorseBase()!=null) {
				this.risorseVisibili.addAll(cartaIniziale.getRisorseBase());
			}
		}
		
		if(carta instanceof CartaOro) {
			CartaOro cartaOro = partita.cercaCartaOro(carta);
			if(checkRichiesta(cartaOro)==true) {
				angoloCoperto(x, y);
				this.punti = punti + ManagerPunti.puntiCarta(this, cartaOro);
				this.getManoscritto().piazzaCarta(carta, x, y);
				this.risorseVisibili.addAll(cartaOro.risorseAngoli());
				
			}
		}
		
		if(carta instanceof CartaRisorsa) {
			this.getManoscritto().piazzaCarta(carta, x, y);
			CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
			this.punti = punti + ManagerPunti.puntiCarta(this, cartaRisorsa);
			this.risorseVisibili.addAll(cartaRisorsa.risorseAngoli());
			angoloCoperto(x, y);
		}
		
	}
	
	private void angoloCoperto(int x,int y) {
	int a = x;
	int b = y;
	Carta carta = this.getManoscritto().getCarta(a--, b--);
	if(carta != null) {
		if(carta.getAngolo(4) != null ) {
			
			removeRisorsa(carta.getAngolo(4).getRisorsa());
			
		}
	}
	
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(a++, b--);
	if(carta != null) {
		if(carta.getAngolo(2) != null ) {
			
			removeRisorsa(carta.getAngolo(2).getRisorsa());
			
		}
	}
	
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(a--, b++);
	if(carta != null) {
		if(carta.getAngolo(3) != null ) {
			
			removeRisorsa(carta.getAngolo(3).getRisorsa());
			
		}
	}
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(a++, b++);
	if(carta != null) {
		if(carta.getAngolo(1) != null ) {
			
			removeRisorsa(carta.getAngolo(1).getRisorsa());
			
		}
	}
	}
	
    private int[] movimentoSuMatrice() {
    	int[] xy = new int[2];
    	int x = 46;
    	int y = 46;
    	Manoscritto m = this.manoscritto;
    	String scelta = "null";
    	System.out.println("sei sulla carta iniziale");
    	do {
            System.out.println("in che direzione vuoi muoverti? \n Direzioni: \n as alto sx, \n bs basso sx,\n ad alto dx,\n bd basso dx \n ");
             Scanner sc = new Scanner(System.in);
             scelta = sc.nextLine();
   
             switch (scelta) {
			case "as" : {
				x--;
				y--;
				stampa(x,y);
			}
			case "bs" : {
				x--;
				y++;
				stampa(x,y);
			}
			case "ad" : {
				x++;
				y--;
				stampa(x,y);
			}
			case "bd" : {
				x++;
				y++;
				stampa(x,y);
			}

			default:
				System.out.println("\n il valore inserito non è un opzione \n");
			}
            }while(!scelta.equalsIgnoreCase("piazza"));
    	
		xy[0]=x;
		xy[1]=y;
		return xy;
    	   	
    }
    
    
   private void stampa(int x,int y) {
   System.out.println("\n Legenda Risorse : F foglia, \n FA farfalla, \n FU fungo, \n L lupo, \n P piuma, \n PE pergamena, \n B boccetta \n");
	   
   }
   
   private void stampaCarta(CartaIniziale carta) {
	   
   }
   
   private void stampaCarta(CartaRisorsa carta) {
	   
   }
   
   public void stampaCarta(CartaOro carta) {
	   
	   // assegnazione colori carta 
	   String colore = null;
	   String coloreS ="\033[48;2;213;212;179m";
  	 if(carta.getColor() == Colore.viola) {
    	   colore= "\033[48;2;129;13;165m  ";
    	  
       }
       
       if(carta.getColor() == Colore.verde) {
    	   colore= "\033[48;2;28;165;13m  ";
    	   
       }
       
       if(carta.getColor() == Colore.rosso) {
    	   colore= "\033[48;2;189;15;15m  ";
    	   
       }
       
       if(carta.getColor() == Colore.azzurro) {
    	   colore= "\033[48;2;14;170;201m  ";
    	   
       }
       
	   String[][] color = new String[10][5];
	   
	   //impostazione dei colori dei primi due angoli
	
     if(carta.getAngolo(0).getRisorsa()==null) {
    	
    	 color[0][0] = colore;

     }else if(carta.getAngolo(0).getRisorsa()==Risorsa.lupo){
    	 color[0][0] = coloreS + "L ";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.farfalla){
    	 color[0][0] = coloreS + "FA";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.foglia){
    	 color[0][0] = coloreS + "F ";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.boccetta){
    	 color[0][0] = coloreS + "B ";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.fungo){
    	 color[0][0] = coloreS + "FU";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.pergamena){
    	 color[0][0] = coloreS + "PE";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.piuma){
    	 color[0][0] = coloreS + "P ";
     }
     else if(carta.getAngolo(0).getRisorsa()==Risorsa.vuoto){
    	 color[0][0] = coloreS + "  ";
     }
     
     if(carta.getAngolo(2).getRisorsa()==null) {
     	
    	 color[9][0] = colore;

     }else if(carta.getAngolo(2).getRisorsa()==Risorsa.lupo){
    	 color[9][0] = coloreS + "L ";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.farfalla){
    	 color[9][0] = coloreS + "FA";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.foglia){
    	 color[9][0] = coloreS + "F ";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.boccetta){
    	 color[9][0] = coloreS + "B ";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.fungo){
    	 color[9][0] = coloreS + "FU";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.pergamena){
    	 color[9][0] = coloreS + "PE";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.piuma){
    	 color[9][0] = coloreS + "P ";
     }
     else if(carta.getAngolo(2).getRisorsa()==Risorsa.vuoto){
    	 color[9][0] = coloreS + "  ";
     }
     
     //impostazione colori prima riga
     
     PuntiPerCarta punti = carta.getPuntiCarta();
     if(punti.getMoltiplicatore()==null) {
    	 color[1][0] = colore;
    	 color[2][0] = colore;
    	 color[3][0] = colore;
    	 color[4][0] = coloreS + punti.getPunti() + " ";
    	 color[5][0] = colore;
    	 color[6][0] = colore;
    	 color[7][0] = colore;
    	 color[8][0] = colore;
    	 
     }
     
     else {
    	 color[1][0] = colore;
    	 color[2][0] = colore;
    	 color[3][0] = colore;
    	 color[4][0] = coloreS + punti.getPunti() + " ";
    	 if(punti.getMoltiplicatore()==Risorsa.lupo){
	    	 color[0][9] = coloreS + "L ";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.farfalla){
	    	 color[5][0] = coloreS + "FA";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.foglia){
	    	 color[5][0]= coloreS + "F ";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.boccetta){
	    	 color[5][0] = coloreS + "B ";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.fungo){
	    	 color[5][0] = coloreS + "FU";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.pergamena){
	    	 color[5][0] = coloreS + "PE";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.piuma){
	    	 color[5][0] = coloreS + "P ";
	     }
	     else if(punti.getMoltiplicatore()==Risorsa.vuoto){
	    	 color[5][0] = coloreS + "S ";
	     }
    	 color[6][0] = colore;
    	 color[7][0] = colore;
    	 color[8][0] = colore;
    	 
    	 
     }
     
     // impostazione colori righe in mezzo vuote e colorate
       for(int x=1;x<=3;x++) {

           for(int y=0;y<10;y++) {
            
                	   color[y][x]= colore;
                   
           }

       }
       
       //impostazione colori angoli ultima riga
   	
       if(carta.getAngolo(1).getRisorsa()==null) {
      	
      	 color[0][4] = colore;

       }else if(carta.getAngolo(1).getRisorsa()==Risorsa.lupo){
      	 color[0][4] = coloreS + "L ";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.farfalla){
      	 color[0][4] = coloreS + "FA";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.foglia){
      	 color[0][4] = coloreS + "F ";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.boccetta){
      	 color[0][4] = coloreS + "B ";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.fungo){
      	 color[0][4] = coloreS + "FU";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.pergamena){
      	 color[0][4] = coloreS + "PE";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.piuma){
      	 color[0][4] = coloreS + "P ";
       }
       else if(carta.getAngolo(1).getRisorsa()==Risorsa.vuoto){
	    	 color[0][4] = coloreS + "  ";
	     }
       
       if(carta.getAngolo(3).getRisorsa()==null) {
       	
      	 color[9][4] = colore;

       }else if(carta.getAngolo(3).getRisorsa()==Risorsa.lupo){
      	 color[9][4] = coloreS + "L ";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.farfalla){
      	 color[9][4] = coloreS + "FA";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.foglia){
      	 color[9][4] = coloreS + "F ";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.boccetta){
      	 color[9][4] = coloreS + "B ";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.fungo){
      	 color[9][4] = coloreS + "FU";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.pergamena){
      	 color[9][4] = coloreS + "PE";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.piuma){
      	 color[9][4] = coloreS + "P ";
       }
       else if(carta.getAngolo(3).getRisorsa()==Risorsa.vuoto){
	    	 color[9][4] = coloreS + "  ";
	   }
       
       //impostazione colori e richiesta carta, ultima riga
    	   
	     color[1][4] = colore;
	     	int o=2;
	     	
			  for( int i=0; i<carta.getRichiesta().size();i++) {
				 
					   if(carta.getRichiesta().get(i)==Risorsa.lupo){
					      	 color[o][4] = coloreS + "L ";
				       }
				       else if(carta.getRichiesta().get(i)==Risorsa.farfalla){
				      	 color[o][4] = coloreS + "FA";
				       }
				       else if(carta.getRichiesta().get(i)==Risorsa.foglia){
				      	 color[o][4] = coloreS + "F ";
				       }
				       else if(carta.getRichiesta().get(i)==Risorsa.boccetta){
				      	 color[o][4] = coloreS + "B ";
				       }
				       else if(carta.getRichiesta().get(i)==Risorsa.fungo){
				      	 color[o][4] = coloreS + "FU";
				       }
				       else if(carta.getRichiesta().get(i)==Risorsa.pergamena){
				      	 color[o][4] = coloreS + "PE";
				       }
				       else if(carta.getRichiesta().get(i)==Risorsa.piuma){
				      	 color[o][4] = coloreS + "P ";
				       }
					   o++;
			  }
			  while(o<9) {
				  color[o][4] = colore;
				  o++;
			  }
       
       for(int x=0;x<color[0].length;x++) {
    	      for(int y=0;y<color.length;y++) {
    	        System.out.print(color[y][x]+" ");
    	      }
    	      System.out.println("");
    	    }
       System.out.print("\033[0m ");
       
       
       
   }
   
   private void stampaCarta(CartaObiettivo carta) {
	   
   }

   public void round () {
	   
   }

}