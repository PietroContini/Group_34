package gestioneGioco;
import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;
import componentiGioco.Colore;

import componentiGioco.Risorsa;
import gestioneObiettivi.ManagerPunti;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Giocatore {
	
	private String nome;
	private ArrayList<Carta> carteInMano = new ArrayList<Carta>();
	private CartaIniziale cartaIniziale;
	private ArrayList<CartaObiettivo> carteObiettivo = new ArrayList<CartaObiettivo>();
	private Manoscritto manoscritto;
	private int punti;
	private ArrayList<Risorsa> risorseVisibili = new ArrayList<Risorsa>();
	private int minS; //variabili per stampa manoscritto
	private int maxS;// variabili per stampa manoscritto
	
	public Giocatore(Manoscritto m, String nome,Partita par) {
		this.manoscritto = m;
		this.punti = 0;
		this.nome = nome;
		pescaCartaOro(par);
		pescaCartaRis(par);
		pescaCartaRis(par);
		minS=0;
		maxS=0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPunti() {
		return punti;
	}
	
	public void pescaCartaIni(Partita a) {
		
		this.cartaIniziale = a.pescaCartaIni() ;
	}
	
	public void pescaCartaRis(Partita a) {
		
		carteInMano.add(a.pescaCartaRis());
	}
	public void pescaCartaOro(Partita a) {
		
		carteInMano.add(a.pescaCartaOro());
	}
	public void pescaCartaObiettivo(Partita a) {
		
		carteObiettivo.add(a.pescaCartaObiettivo());
	}
	public void pescaCartaTavolo(Partita a,int i) {
		
		carteInMano.add(a.pescaCartaTavolo(i));
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
	
	public CartaIniziale getCartaIni() {
		return this.cartaIniziale;
	}
	
	public void setCartaIni(CartaIniziale cartaIni) {
		this.cartaIniziale = cartaIni;
	}
	
	public void setPunti(int punti) {
		this.punti = this.punti + punti;
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
	
	public boolean piazzaCarta(Partita partita, Carta carta,int x,int y,int scelt) {
		
		boolean prova = true;
		if(this.manoscritto.getCarta(x, y)==null) {
			if(carta instanceof CartaIniziale) {
				this.getManoscritto().piazzaCarta(carta, 46, 46);
				if(scelt == 1) {
					CartaIniziale cartaIniziale = CartaIniziale.retroCarta(partita.cercaCartaIniziale(carta));
					
					this.risorseVisibili.addAll(cartaIniziale.risorseAngoli());
					
				}else {
				CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
				this.risorseVisibili.addAll(cartaIniziale.risorseAngoli());
				}
				if(cartaIniziale.getRisorseBase()!=null) {
					this.risorseVisibili.addAll(cartaIniziale.getRisorseBase());
				}
			}
			
			if(carta instanceof CartaOro) {
				CartaOro cartaOro = partita.cercaCartaOro(carta);
				if(checkRichiesta(cartaOro)==true) {
					int p= angoloCoperto(x, y);
					if(p==0)
						prova = true;
					if(prova ==true) {
						this.punti = punti + ManagerPunti.puntiCarta(this, cartaOro,p);
						this.getManoscritto().piazzaCarta(carta, x, y);
						this.risorseVisibili.addAll(cartaOro.risorseAngoli());
						if(cartaOro.getRisorsaPermanente()!=null) {
							this.risorseVisibili.add(cartaOro.getRisorsaPermanente());
						}
					}
					else {
						System.out.println("\n impossibile piazzare, nessun angolo occupabile \n");
						return false;
					}
					
				}
				else {
					System.out.println(" \n impossibile piazzare, la richiesta della carta oro non è soddisfatta \n");
					return false;
				}
			}
			
			if(carta instanceof CartaRisorsa) {
				if(angoloCoperto(x, y)==0)
					prova = true;
				if(prova ==true) {
					this.getManoscritto().piazzaCarta(carta, x, y);
					CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
					this.punti = punti + ManagerPunti.puntiCarta(this, cartaRisorsa);
					this.risorseVisibili.addAll(cartaRisorsa.risorseAngoli());
					if(cartaRisorsa.getRisorsaPermanente()!=null) {
						this.risorseVisibili.add(cartaRisorsa.getRisorsaPermanente());
					}
				}
				else {
					System.out.println("\n impossibile piazzare, nessun angolo occupabile o non tutti gli angoli sono occupabili \n");
					return false;
				}
				
			}
		}else {
			System.out.println(" \n impossibile piazzare, lo spazio è gia occupato da un'altra carta \n");
			return false;
		}
		return true;
		
	}
	
	private boolean posizioneVuota(int x,int y) {
		int a = x;
		int b = y;
		
		Carta carta = this.getManoscritto().getCarta(--a, --b);
		if(carta != null) {
			return true;
		}
		
		 a = x;
		 b = y;
		carta = this.getManoscritto().getCarta(++a, --b);
		if(carta != null) {
			return true;
		}
		
		 a = x;
		 b = y;
		carta = this.getManoscritto().getCarta(--a, ++b);
		if(carta != null) {
			return true;
		}
		 a = x;
		 b = y;
		carta = this.getManoscritto().getCarta(++a, ++b);
		if(carta != null) {
			return true;
		}
		
		
		return false;
		
		
	}
	
	private int angoloCoperto(int x,int y) {
	int angoloEsiste = 0;
	int cartaEsiste = 0;
	int a = x;
	int b = y;
	Carta carta = this.getManoscritto().getCarta(--a, --b);
	if(carta != null) {
		if(carta.getAngolo(3) != null  ) {
			if(carta.getAngolo(3).getRisorsa()!=Risorsa.vuoto) {
			removeRisorsa(carta.getAngolo(3).getRisorsa());
			}
			angoloEsiste ++;
		}
		cartaEsiste++;
	}
	
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(++a, --b);
	if(carta != null) {
		if(carta.getAngolo(1) != null ) {
			if(carta.getAngolo(1).getRisorsa()!=Risorsa.vuoto) {
			removeRisorsa(carta.getAngolo(1).getRisorsa());
			}
			angoloEsiste ++;
		}
		cartaEsiste++;
	}
	
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(--a, ++b);
	if(carta != null) {
		if(carta.getAngolo(2) != null ) {
			if(carta.getAngolo(2).getRisorsa()!=Risorsa.vuoto) {
			removeRisorsa(carta.getAngolo(2).getRisorsa());
			}
			angoloEsiste ++;
		}
		cartaEsiste++;
	}
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(++a, ++b);
	if(carta != null) {
		if(carta.getAngolo(0) != null ) {
			if(carta.getAngolo(0).getRisorsa()!=Risorsa.vuoto) {
			removeRisorsa(carta.getAngolo(0).getRisorsa());
			}
			angoloEsiste ++;
		}
		cartaEsiste++;
	}
	
	if(cartaEsiste>angoloEsiste) {
	return 0;
	}
	else {
		return 1;
	}
	}
	
    public void movimentoSuMatrice(Partita par,Carta carta) throws InterruptedException {
 
    	boolean prova = true;
    	int x = 46;
    	int y = 46;
    	int a = x;
    	int b = y;
    	String scelta = "";
    	System.out.println("sei sulla carta iniziale");
    	stampa(x,y);
    	do {
    	do {
    		TimeUnit.SECONDS.sleep(2);
    		scelta="";
            System.out.println("In che direzione vuoi muoverti? \n Direzioni: \n as alto sx, \n bs basso sx,\n ad alto dx,\n bd basso dx \n inizio per tornare alla carta iniziale \n Scrivi piazza per piazzare la carta");
             Scanner sc = new Scanner(System.in);
             scelta = sc.nextLine();
             
             if(scelta.equalsIgnoreCase("as")) {
            	a--;
            	b--;
            	if(posizioneVuota(a,b)==true) {
				x--;
				y--;
				
				stampa(x,y);
            	}
            	else {
            	 System.out.println("\n ìmpossibile muoversi in uno spazio con tutti i lati vuoti ! cambiare direzione \n");
            	 a=x;
            	 b=y;
            	}
				
			}
             else if(scelta.equalsIgnoreCase("bs")) {
            	a--;
             	b++;
             	if(posizioneVuota(a,b)==true) {
             		x--;
    				y++;
    				
    				stampa(x,y);
             	}
             	else {
             	 System.out.println("\n ìmpossibile muoversi in uno spazio con tutti i lati vuoti ! cambiare direzione \n");
             	 a=x;
           	     b=y;
             	}
				
				
				
			}
             else if(scelta.equalsIgnoreCase("ad")) {
            	a++;
              	b--;
              	if(posizioneVuota(a,b)==true) {
              		x++;
    				y--;
    				
    				stampa(x,y);
              	}
              	else {
              	 System.out.println("\n ìmpossibile muoversi in uno spazio con tutti i lati vuoti ! cambiare direzione \n");
              	 a=x;
           	     b=y;
              	}

				
			}
             else if(scelta.equalsIgnoreCase("bd")) {
            	a++;
               	b++;
               	if(posizioneVuota(a,b)==true) {
               		x++;
    				y++;
    				
    				stampa(x,y);
               	}
               	else {
               	 System.out.println("\n ìmpossibile muoversi in uno spazio con tutti i lati vuoti ! cambiare direzione \n");
                 a=x;
           	     b=y;
               	}
				
			}
            else if(scelta.equalsIgnoreCase("inizio")) {
 				x=46;
 				y=46;
 				a=x;
 				b=y;
 				stampa(x,y);
 				
 			}
             

            else if(!scelta.equalsIgnoreCase("piazza")){
            	
            	System.out.println(" \n il valore inserito non e' un opzione \n");
				
			}
             
            }while(!scelta.equalsIgnoreCase("piazza"));
    	}while(piazzaCarta(par,carta,x,y,0)==false);
    	
    	System.out.println("\n Carta piazzata ! \n");
    	
		
    	   	
    }
    
    
   public void stampa(int x,int y) { 
	   
   System.out.println("\n Legenda Risorse : \n F foglia, \n FA farfalla, \n FU fungo, \n L lupo, \n P piuma, \n PE pergamena, \n B boccetta, \n spazio vuoto per angolo vuoto \n");
	   int a = x;
	   int b = y;
	   
	   String spazi = "		 ";
	   int sp = 0;
	   
	   Partita partita = new Partita();
	   Carta carta = this.manoscritto.getCarta(--a, --b);
	   
	   String [][]color1 = new String[10][5];
	   String [][]color2 = new String[10][5];
	  
		if(carta instanceof CartaIniziale) {
			
			CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
			color1 = cartaIniziale.creaCarta();
			spazi = spazi +"     ";
			sp++;
			
			}
		
		
		if(carta instanceof CartaOro) {
			CartaOro cartaOro = partita.cercaCartaOro(carta);
			color1 = cartaOro.creaCarta();
			sp--;
			}
		
		
		if(carta instanceof CartaRisorsa) {
		
			CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
			color1 = cartaRisorsa.creaCarta();
			sp--;
		}
		else if(carta == null) {
			color1 = Carta.stampaVuoto();
			sp++;
		}
		
		
		
		    a = x;
		    b = y;
		    
		    
		    
		  carta = this.manoscritto.getCarta(++a, --b);
			  
		  	if(carta instanceof CartaIniziale) {
				
				CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
				color2 = cartaIniziale.creaCarta();
				spazi = spazi +"     ";
				sp++;
				}
			
			
			if(carta instanceof CartaOro) {
				CartaOro cartaOro = partita.cercaCartaOro(carta);
				color2 = cartaOro.creaCarta();
				sp--;
				}
			
			
			if(carta instanceof CartaRisorsa) {
			
				CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
				color2 = cartaRisorsa.creaCarta();
				sp--;
			}
			else if(carta == null) {
				color2 = Carta.stampaVuoto();
				sp++;
				
			}
			
			if(sp==2) {
				spazi = spazi +"          ";
			}
			
			
			//stampa prima parte
			
			for(int n=0;n<color1[0].length;n++) {
	    	      for(int m=0;m<color1.length;m++) {
	    	        System.out.print(color1[m][n]+" ");
	    	        
	    	      }
	    	      System.out.print("\033[0m ");
	    	      System.out.print(spazi);
	    	      
	    	      for(int m=0;m<color2.length;m++) {
		    	        System.out.print(color2[m][n]+" ");
		    	        
		    	  }
	    	      
	    	      System.out.println("");
	    	    }
	       System.out.print("\033[0m ");
	       System.out.println("");
	       
	       spazi = "		   ";
	       
	       String [][]colorC = new String[10][5];
		   
			carta = this.manoscritto.getCarta(x,y);
			  
			if(carta instanceof CartaIniziale) {
				
				CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
				colorC = cartaIniziale.creaCarta();
				spazi = spazi +"        ";
				
				}
			
			
			if(carta instanceof CartaOro) {
				CartaOro cartaOro = partita.cercaCartaOro(carta);
				colorC = cartaOro.creaCarta();
				}
			
			
			if(carta instanceof CartaRisorsa) {
			
				CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
				colorC = cartaRisorsa.creaCarta();
			}
			else if(carta == null) {
				colorC = Carta.stampaVuoto();
				
			}
			
			for(int n=0;n<colorC[0].length;n++) {
				  System.out.print("\033[0m ");
	    	      System.out.print(spazi);
	    	      for(int m=0;m<colorC.length;m++) {
	    	        System.out.print(colorC[m][n]+" ");
	    	        
	    	      }
	    	      
	    	      System.out.println("");
			}
			
			System.out.println("");
			
			a = x;
			b = y;
			
			sp=0;
			   
			
			   carta = this.manoscritto.getCarta(--a, ++b);
			  
			   if(carta instanceof CartaIniziale) {
					
					CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
					color1 = cartaIniziale.creaCarta();
					spazi = spazi +"     ";
					sp++;
					}
				
				
				if(carta instanceof CartaOro) {
					CartaOro cartaOro = partita.cercaCartaOro(carta);
					color1 = cartaOro.creaCarta();
					sp--;
					}
				
				
				if(carta instanceof CartaRisorsa) {
				
					CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
					color1 = cartaRisorsa.creaCarta();
					sp--;
				}
				else if(carta == null) {
					color1 = Carta.stampaVuoto();
					sp++;
					
				}
				
				
				
				    a = x;
				    b = y;
				   
				    
				    carta = this.manoscritto.getCarta(++a, ++b);
					  
				    if(carta instanceof CartaIniziale) {
						
						CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
						color2 = cartaIniziale.creaCarta();
						spazi = spazi +"     ";
						sp++;
						}
					
					
					if(carta instanceof CartaOro) {
						CartaOro cartaOro = partita.cercaCartaOro(carta);
						color2 = cartaOro.creaCarta();
						sp--;
						}
					
					
					if(carta instanceof CartaRisorsa) {
					
						CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
						color2 = cartaRisorsa.creaCarta();
						sp--;
					}
					else if(carta == null) {
						color2 = Carta.stampaVuoto();
						sp++;
						
					}
					
					if(sp==2) {
						spazi = spazi +"        ";
					}
					
					for(int n=0;n<color1[0].length;n++) {
			    	      for(int m=0;m<color1.length;m++) {
			    	        System.out.print(color1[m][n]+" ");
			    	        
			    	      }
			    	      System.out.print("\033[0m ");
			    	      System.out.print(spazi);
			    	      
			    	      for(int m=0;m<color2.length;m++) {
				    	        System.out.print(color2[m][n]+" ");
				    	        
				    	  }
			    	      
			    	      System.out.println("");
			    	    }
					
			       System.out.print("\033[0m ");
			       
					System.out.println("\n");
			
	   
   }
   
   public void stampaCarteInMano(Partita par) {
	   
	   		String [][]color1 = new String[10][5];
	   		String [][]color2 = new String[10][5];
	   		String [][]color3 = new String[10][5];
	   		boolean testOk = false;
	   		boolean testOk1 = false;
	   		boolean testOk2 = false;
	   		int t = 0;
	   		if(carteInMano.get(0) instanceof CartaOro) {
	   			CartaOro a = par.cercaCartaOro(carteInMano.get(0));
	   			color1 = a.creaCarta();
	   			testOk = this.checkRichiesta(a);
	   			t++;
	   		}
	   		else if(carteInMano.get(0) instanceof CartaRisorsa){
	   			CartaRisorsa a = par.cercaCartaRisorsa(carteInMano.get(0));
	   		   	color1 = a.creaCarta();
	   		}
	   		else {
	   			color1 = Carta.stampaVuoto();
	   		}
	   		
	   		if(carteInMano.get(1) instanceof CartaOro) {
	   			CartaOro a = par.cercaCartaOro(carteInMano.get(1));
	   			color2 = a.creaCarta();
	   			testOk1 = this.checkRichiesta(a);
	   			t++;
	   		}
	   		else if(carteInMano.get(1) instanceof CartaRisorsa){
	   			CartaRisorsa a = par.cercaCartaRisorsa(carteInMano.get(1));
	   		   	color2 = a.creaCarta();
	   		}
	   		else {
	   			color2 = Carta.stampaVuoto();
	   		}
	   		
	   		if(carteInMano.get(2) instanceof CartaOro) {
	   			CartaOro a = par.cercaCartaOro(carteInMano.get(2));
	   			color3 = a.creaCarta();
	   			testOk2 = this.checkRichiesta(a);
	   			t++;
	   		}
	   		else if(carteInMano.get(2) instanceof CartaRisorsa) {
	   			CartaRisorsa a = par.cercaCartaRisorsa(carteInMano.get(2));
	   		   	color3 = a.creaCarta();
	   		}
	   		else {
	   			color3 = Carta.stampaVuoto();
	   		}
	    
		   
		   String spazi = "	 ";
		   for(int n=0;n<color1[0].length;n++) {
	    	      for(int m=0;m<color1.length;m++) {
	    	        System.out.print(color1[m][n]+" ");
	    	        
	    	      }
	    	      System.out.print("\033[0m ");
	    	      System.out.print(spazi);
	    	      
	    	      for(int m=0;m<color2.length;m++) {
		    	        System.out.print(color2[m][n]+" ");
		    	        
		    	  }
	    	      System.out.print("\033[0m ");
	    	      System.out.print(spazi);
	    	      
	    	      for(int m=0;m<color3.length;m++) {
		    	        System.out.print(color3[m][n]+" ");
		    	        
		    	  }
	    	      
	    	      System.out.println("");
	    	    }
			
	        System.out.print("\033[0m ");
	       
			System.out.println("");
			if(t==1) {
				System.out.print("Puoi piazzare la carta oro che hai in mano ?\n");
				if(testOk == true) {
					System.out.print("Si");
				}
				else {
					System.out.print("No");
				}
			}
			else if(t>1) {
				System.out.print("Puoi piazzare le carte oro che hai in mano ? Ordine da sinistra\n");
				if(testOk == true) {
					System.out.println("La prima : Si");
				}
				else {
					System.out.println("La prima : No");
				}
				if(testOk1 == true) {
					System.out.println("La seconda : Si");
				}
				else {
					System.out.println("La seconda : No");
				}
				if(t==3 && testOk2 == true) {
					System.out.println("La terza : Si");
				}
				else {
					System.out.println("La terza : No");
				}
			}
			System.out.println("\n");
	   
   }
   
   public void stampaCartaObiettivo() {
	   
	   String[][] color1 = carteObiettivo.get(0).creaCarta();
	   if(carteObiettivo.size()!=1) {
		   String spazi = "		 ";
		   String[][] color2 = carteObiettivo.get(1).creaCarta();
		   
		   for(int n=0;n<color1[0].length;n++) {
	    	      for(int m=0;m<color1.length;m++) {
	    	        System.out.print(color1[m][n]+" ");
	    	        
	    	      }
	    	      System.out.print("\033[0m ");
	    	      System.out.print(spazi);
	    	      
	    	      for(int m=0;m<color2.length;m++) {
		    	        System.out.print(color2[m][n]+" ");
		    	        
		    	  }
	    	      
	    	      System.out.println("");
	    	    }
			
	        System.out.print("\033[0m ");
	       
			System.out.println("\n");
		   
	   }
	   else {
		   
		   for(int n=0;n<color1[0].length;n++) {
	    	      for(int m=0;m<color1.length;m++) {
	    	        System.out.print(color1[m][n]+" ");
	    	        
	    	      }
	    	      
	    	      System.out.println("");
			}
		    System.out.print("\033[0m ");
			System.out.println("");
		   
	   }
	
   }
   
   private void miniManoscritto() {
	   
	   Manoscritto mn = this.manoscritto;
	   
	   String [][] minimap =  new String [90][90];
	   
	   for(int ns=0;ns<mn.getCarteManoscritto()[0].length;ns++) {
	 	      for(int ms=0;ms<mn.getCarteManoscritto().length;ms++) {
	 	        
	 	    	 minimap[ms][ns]= "\033[48;2;213;212;179m";
	 	    	
	 	        
	 	      }
	   }
	   
	   String [][] minimapS = minimap;
	   
	   for(int n=0;n<mn.getCarteManoscritto()[0].length;n++) {
 	      for(int m=0;m<mn.getCarteManoscritto().length;m++) {
 	    	 if(mn.getCarta(m, n)==null) {
 	    		minimap[m][n]= "\033[48;2;255;255;255m  ";
 	 	      }
 	    	 
 	    	 else if(mn.getCarta(m, n).getColor() == Colore.viola) {
 		    	   minimap[m][n]= "\033[48;2;129;13;165m  ";
 		    	  
 		       }
 		       
 	    	 else if(mn.getCarta(m, n).getColor() == Colore.verde) {
 		    	  minimap[m][n] = "\033[48;2;28;165;13m  ";
 		    	   
 		       }
 		       
 	    	 else if(mn.getCarta(m, n).getColor() == Colore.rosso) {
 		    	  minimap[m][n] = "\033[48;2;189;15;15m  ";
 		    	   
 		       }
 		       
 	    	 else if(mn.getCarta(m, n).getColor() == Colore.azzurro) {
 		    	  minimap[m][n] = "\033[48;2;14;170;201m  ";
 		    	   
 		       }
 	    	else if(mn.getCarta(m, n) instanceof CartaIniziale) {
		    	  minimap[m][n] = "\033[48;2;213;212;179m  ";
		    	   
		       }
 	
 	      }
 
	   }
		   
		   
		          
	        /*
	        for(int x=30;x<=60;x++) {

	        	minimap[60][x]= "\033[48;2;169;169;169m ";
		
		    }
		   
	        for(int x=30;x<=60;x++) {

	        	minimap[30][x]= "\033[48;2;169;169;169m ";
		
		    }*/
	        
	        minimap[45][46]= "  ";
	   
	        int min = 40;
	        int max = 55;
	         
	        
	        for(int n=0;n<mn.getCarteManoscritto()[0].length;n++) {
	        	
	        	if(mn.getCarta(n, min)!=null) {
	        		minS = minS-5;
	        		break;
	        	}
	   
		  	}
	        for(int n=0;n<mn.getCarteManoscritto().length;n++) {
	        	
	        	if(mn.getCarta(n, max)!=null) {
	        		maxS = maxS+5;
	        		break;
	        	}
	   
		  	}
	        
	        min = min + minS;
	        max = max + maxS;
	        
	        
	        for(int y=min;y<=max;y++) {
		           
		      	   minimap[y][min]= "\033[48;2;169;169;169m ";
		         
			    }

		   
			    
		        for(int y=min;y<=max;y++) {
		            
		        	minimapS[y][max]= "\033[48;2;169;169;169m ";
		            
			    } 
		        
		        
	        
	   for(int n=min;n<=max;n++) {
	 	      for(int m=min;m<=max;m++) {
	 	    	 System.out.print(minimap[m][n]+" ");
	 	    	 
 	      }
 	      System.out.println("");
		}
	    System.out.print("\033[0m ");
		System.out.println("");
	   
	   
   }
   
  
   
   

   public void round (Partita partita) throws InterruptedException {
	   
	   String scelta = "";
	   
	   boolean sceltaSbagliata = false;
	   
	   System.out.println("\n Round di : " + this.getNome() + "\n");
	   
	   do {
		   sceltaSbagliata = false;
		   System.out.println("vuoi piazzare una carta:premi 1 \n");
		   System.out.println("vuoi vedere le carte sul tavolo:premi 2 \n");
		   System.out.println("vuoi vedere le carte obiettivo comuni:premi 3 \n");
		   System.out.println("vuoi vedere le carte obiettivo personali:premi 4 \n");
		   System.out.println("vuoi vedere il manoscritto:premi 5 \n");
		   
		   
		   
		   Scanner sc = new Scanner(System.in);
		   scelta = sc.nextLine();   
	  
	   if(scelta.equalsIgnoreCase("1")) {
		   boolean sceltaCartaSbagliata = true;
	     do {
	    	 sceltaCartaSbagliata = true;
		   System.out.println("quale carta vuoi piazzare?: premi 1,2,3");
		   stampaCarteInMano(partita);
		   Scanner scanner = new Scanner(System.in);
		 String  sceltacarta = scanner.nextLine();
		   
		    if(sceltacarta.equalsIgnoreCase("1")) {
		  
		    	
		    	if(carteInMano.get(0) instanceof CartaOro) {
		    		 CartaOro carta = partita.cercaCartaOro(carteInMano.get(0));
		    		 boolean sceltanonCorretta = false;
		    		 do {
		    			 sceltanonCorretta = false;
		    			 System.out.println("\n Vuoi piazzare la facciata o il retro? premi, f o r \n");
		    			   carta.stampaCartaeRetro();
		    			   Scanner scan = new Scanner(System.in);
		    			 String  sceltacart = scanner.nextLine();
		    			 
		    			 if(sceltacart.equalsIgnoreCase("r")){
		    				 carta = CartaOro.retroCarta(carta);
		    			 }
		    			 else if(!sceltacart.equalsIgnoreCase("r") && !sceltacart.equalsIgnoreCase("f")) {
		    				 System.out.println("\n Scelta sbagliata,riscrivere \n");
		    				 sceltanonCorretta=true;
		    			 }
		    			 
		    			 
		    		 }while(sceltanonCorretta==true);
		    		 
		    		 if(checkRichiesta(carta)==true) {
		    			 movimentoSuMatrice(partita, carteInMano.get(0));
		 		    	carteInMano.remove(0);
		    		 }
		    		 else {
		    			 System.out.println(" \n impossibile piazzare, la richiesta della carta oro non è soddisfatta \n");
		    			 sceltaCartaSbagliata=false;
		    		 }
		    	}else {
		    		boolean sceltanonCorretta = false;
		    		CartaRisorsa carta = partita.cercaCartaRisorsa(carteInMano.get(0));
		    		 do {
		    			 sceltanonCorretta = false;
		    			 System.out.println("\n Vuoi piazzare la facciata o il retro? premi, f o r \n");
		    			   carta.stampaCartaeRetro();
		    			   Scanner scan = new Scanner(System.in);
		    			 String  sceltacart = scanner.nextLine();
		    			 
		    			 if(sceltacart.equalsIgnoreCase("r")){
		    				 carta = CartaRisorsa.retroCarta(carta);
		    			 }
		    			 else if(!sceltacart.equalsIgnoreCase("r") && !sceltacart.equalsIgnoreCase("f")) {
		    				 System.out.println("\n Scelta sbagliata,riscrivere \n");
		    				 sceltanonCorretta=true;
		    			 }
		    			 
		    			 
		    		 }while(sceltanonCorretta==true);
		    	movimentoSuMatrice(partita, carteInMano.get(0));
		    	carteInMano.remove(0);
		    	}
			   
		  	}

				
			
		   else if(sceltacarta.equalsIgnoreCase("2")) {
			   
		    	
		    	if(carteInMano.get(1) instanceof CartaOro) {
		    		 CartaOro carta = partita.cercaCartaOro(carteInMano.get(1));
		    		 boolean sceltanonCorretta = false;
		    		 do {
		    			 sceltanonCorretta = false;
		    			 System.out.println("\n Vuoi piazzare la facciata o il retro? premi, f o r \n");
		    			   carta.stampaCartaeRetro();
		    			   Scanner scan = new Scanner(System.in);
		    			 String  sceltacart = scanner.nextLine();
		    			 
		    			 if(sceltacart.equalsIgnoreCase("r")){
		    				 carta = CartaOro.retroCarta(carta);
		    			 }
		    			 else if(!sceltacart.equalsIgnoreCase("r") && !sceltacart.equalsIgnoreCase("f")) {
		    				 System.out.println("\n Scelta sbagliata,riscrivere \n");
		    				 sceltanonCorretta=true;
		    			 }
		    			 
		    			 
		    		 }while(sceltanonCorretta==true);
		    		 if(checkRichiesta(carta)==true) {
		    			 movimentoSuMatrice(partita, carteInMano.get(1));
		 		    	carteInMano.remove(1);
		    		 }
		    		 else {
		    			 
		    			 System.out.println(" \n impossibile piazzare, la richiesta della carta oro non è soddisfatta \n");
		    			 sceltaCartaSbagliata=false;
		    		 }
		    	}else {
		    		boolean sceltanonCorretta = false;
		    		CartaRisorsa carta = partita.cercaCartaRisorsa(carteInMano.get(1));
		    		 do {
		    			 sceltanonCorretta = false;
		    			 System.out.println("\n Vuoi piazzare la facciata o il retro? premi, f o r \n");
		    			   carta.stampaCartaeRetro();
		    			   Scanner scan = new Scanner(System.in);
		    			 String  sceltacart = scanner.nextLine();
		    			 
		    			 if(sceltacart.equalsIgnoreCase("r")){
		    				 carta = CartaRisorsa.retroCarta(carta);
		    			 }
		    			 else if(!sceltacart.equalsIgnoreCase("r") && !sceltacart.equalsIgnoreCase("f")) {
		    				 System.out.println("\n Scelta sbagliata,riscrivere \n");
		    				 sceltanonCorretta=true;
		    			 }
		    			 
		    			 
		    		 }while(sceltanonCorretta==true);
		    	movimentoSuMatrice(partita, carteInMano.get(1));
		    	carteInMano.remove(1);
		    	}
			
			   
			}
		
			
		
		   else if(sceltacarta.equalsIgnoreCase("3")) {
			   
		    	
		    	if(carteInMano.get(2) instanceof CartaOro) {
		    		 CartaOro carta = partita.cercaCartaOro(carteInMano.get(2));
		    		 boolean sceltanonCorretta = false;
		    		 do {
		    			 sceltanonCorretta = false;
		    			 System.out.println("\n Vuoi piazzare la facciata o il retro? premi, f o r \n");
		    			   carta.stampaCartaeRetro();
		    			   Scanner scan = new Scanner(System.in);
		    			 String  sceltacart = scanner.nextLine();
		    			 
		    			 if(sceltacart.equalsIgnoreCase("r")){
		    				 carta = CartaOro.retroCarta(carta);
		    			 }
		    			 else if(!sceltacart.equalsIgnoreCase("r") && !sceltacart.equalsIgnoreCase("f")) {
		    				 System.out.println("\n Scelta sbagliata,riscrivere \n");
		    				 sceltanonCorretta=true;
		    			 }
		    			 
		    			 
		    		 }while(sceltanonCorretta==true);
		    		 if(checkRichiesta(carta)==true) {
		    			 movimentoSuMatrice(partita, carteInMano.get(2));
		 		    	carteInMano.remove(2);
		    		 }
		    		 else {
		    			 System.out.println(" \n impossibile piazzare, la richiesta della carta oro non è soddisfatta \n");
		    			 sceltaCartaSbagliata=false;
		    		 }
		    	}else {
		    		boolean sceltanonCorretta = false;
		    		CartaRisorsa carta = partita.cercaCartaRisorsa(carteInMano.get(2));
		    		 do {
		    			 sceltanonCorretta = false;
		    			 System.out.println("\n Vuoi piazzare la facciata o il retro? premi, f o r \n");
		    			   carta.stampaCartaeRetro();
		    			   Scanner scan = new Scanner(System.in);
		    			 String  sceltacart = scanner.nextLine();
		    			 
		    			 if(sceltacart.equalsIgnoreCase("r")){
		    				 carta = CartaRisorsa.retroCarta(carta);
		    			 }
		    			 else if(!sceltacart.equalsIgnoreCase("r") && !sceltacart.equalsIgnoreCase("f")) {
		    				 System.out.println("\n Scelta sbagliata,riscrivere \n");
		    				 sceltanonCorretta=true;
		    			 }
		    			 
		    			 
		    		 }while(sceltanonCorretta==true);
		    	movimentoSuMatrice(partita, carteInMano.get(2));
		    	carteInMano.remove(2);
		    	}
			   
			}else {
				   System.out.println("scelta non disponibile, riprova! \n");
				   sceltaCartaSbagliata = false;
			}
	     }while(sceltaCartaSbagliata == false);
		 



	   boolean sceltaCartaSbagliata1 = true;
	     do {
	       sceltaCartaSbagliata1 = true;
	  	   System.out.println("Devi pescare una carta \n");
		   System.out.println("vuoi pescare una carta risorsa dal mazzo:premi A \n");
		   System.out.println("vuoi pescare una carta oro dal mazzo:premi B \n");
		   System.out.println("vuoi prendere una carta sul tavolo:premi C \n");
		   
		  
		   Scanner scanner = new Scanner(System.in);
		 String  sceltaPesca = scanner.nextLine();
		   
		    if(sceltaPesca.equalsIgnoreCase("A")) {
		  
		    	if(partita.getMazzoRisorsa().getCartaRimasta() > 0) {
		    	this.pescaCartaRis(partita);
		    	}
		    	else {
		    	 sceltaCartaSbagliata1 = false;
		    	 System.out.println("\n Pesca in un altro modo, il mazzo delle carte risorsa è finito");
		    	}
		  	}

				
			
		   else if(sceltaPesca.equalsIgnoreCase("B")) {
			   
		    	if(partita.getMazzoOro().getCartaRimasta() > 0) {
		    	this.pescaCartaOro(partita);
		    	}
		    	else {
		    	 sceltaCartaSbagliata1 = false;
		    	 System.out.println("\n Pesca in un altro modo, il mazzo delle carte oro è finito");
		    	 
		    	}
			   
			}
		
			
		
		   else if(sceltaPesca.equalsIgnoreCase("C")) {
			   
			 boolean sceltaCartaTavolo = true;
			    do {
			    	sceltaCartaTavolo = true;
			    	System.out.println("quale vuoi prendere? : \n dall'alto verso il basso premi 1,2,3,4 \n");
					   partita.stampaCarteTavolo();
					   Scanner scanner2 = new Scanner(System.in);
					 String  sceltacarta = scanner2.nextLine();
					   
					    if(sceltacarta.equalsIgnoreCase("1")) {
					  
					    	carteInMano.add(partita.pescaCartaTavolo(0));
						   
					  	}

							
						
					   else if(sceltacarta.equalsIgnoreCase("2")) {
						   
						   carteInMano.add(partita.pescaCartaTavolo(1));
						   
						}
					
						
					
					   else if(sceltacarta.equalsIgnoreCase("3")) {
						   
						   carteInMano.add(partita.pescaCartaTavolo(2));
						   
					   }
						   
					   else if(sceltacarta.equalsIgnoreCase("4")) {
							   
						   carteInMano.add(partita.pescaCartaTavolo(3));
							   
						
						   
					  }else {
							   System.out.println("scelta non disponibile, riprova! \n");
							   sceltaCartaTavolo = false;
						}
				     }while(sceltaCartaTavolo == false);
			
			   
			}else {
				   System.out.println("scelta non disponibile, riprova! \n");
				   sceltaCartaSbagliata1 = false;
			}
	     }while(sceltaCartaSbagliata1 == false);
	   
	       	}

				
			
	   
	   else if(scelta.equalsIgnoreCase("2")) {
	  
		   partita.stampaCarteTavolo();
		   sceltaSbagliata = true;
		   
	  	}

			
		
	   else if(scelta.equalsIgnoreCase("3")) {
		   
		   partita.stampaCarteObComuni();
		   sceltaSbagliata = true;
		   
		}
	
		
	
	   else if(scelta.equalsIgnoreCase("4")) {
		   
		   this.stampaCartaObiettivo();
		   sceltaSbagliata = true;
		  
		}
	
		
	
	   else if(scelta.equalsIgnoreCase("5")) {
		   
	       miniManoscritto();
		   sceltaSbagliata = true;
		}
	   
	   else{
		   System.out.println("scelta non disponibile, riprova! \n");
		   sceltaSbagliata = true;
	   }
		
	
	   
    }while(sceltaSbagliata == true);
	   

	   
   }
   
   public void sceltaCartaObiettivo(Partita partita) {
	   
	   this.pescaCartaObiettivo(partita);
	   this.pescaCartaObiettivo(partita);
	    
	   boolean sceltaCartaSbagliata = true;
	   System.out.println("\n Queste sono le tue carte obiettivo \n");
	     do {
	       sceltaCartaSbagliata = true;
		   System.out.println("\n quale carta obiettivo vuoi tenere?: premi 1,2 \n");
		   stampaCartaObiettivo();
		   Scanner scanner = new Scanner(System.in);
		 String  sceltacarta = scanner.nextLine();
		   
		    if(sceltacarta.equalsIgnoreCase("1")) {
		 
			   carteObiettivo.remove(0);
		    	
		  	}

				
			
		   else if(sceltacarta.equalsIgnoreCase("2")) {
			   
			   carteObiettivo.remove(1);
			   
			}else {
				   System.out.println("scelta non disponibile, riprova! \n");
				   sceltaCartaSbagliata = false;
			}
	     }while(sceltaCartaSbagliata == false);
	  
   }

}