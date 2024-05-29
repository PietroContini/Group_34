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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Giocatore {
	
	private String nome;
	private ArrayList<Carta> carteInMano = new ArrayList<Carta>();;
	private ArrayList<CartaObiettivo> carteObiettivo = new ArrayList<CartaObiettivo>();;
	private Manoscritto manoscritto;
	private int punti;
	private ArrayList<Risorsa> risorseVisibili = new ArrayList<Risorsa>();
	
	public Giocatore(Manoscritto m, String nome) {
		this.manoscritto = m;
		this.punti = 0;
		this.nome = nome;
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
		
		carteInMano.add(a.pescaCartaIni());
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
	
	public boolean piazzaCarta(Partita partita, Carta carta,int x,int y) {
		
		boolean prova = true;
		if(this.manoscritto.getCarta(x, y)==null) {
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
					int p= angoloCoperto(x, y);
					if(p>0)
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
						System.out.println("impossibile piazzare, nessun angolo occupabile");
						return false;
					}
					
				}
				else {
					System.out.println("impossibile piazzare, la richiesta della carta oro non è soddisfatta");
					return false;
				}
			}
			
			if(carta instanceof CartaRisorsa) {
				if(angoloCoperto(x, y)>0)
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
					System.out.println("impossibile piazzare, nessun angolo occupabile");
					return false;
				}
				
			}
		}else {
			System.out.println("impossibile piazzare, lo spazio è gia occupato da un'altra carta");
			return false;
		}
		return true;
		
	}
	
	private boolean posizioneVuota(int x,int y) {
		int a = x;
		int b = y;
		
		Carta carta = this.getManoscritto().getCarta(a--, b--);
		if(carta != null) {
			return true;
		}
		
		 a = x;
		 b = y;
		carta = this.getManoscritto().getCarta(a++, b--);
		if(carta != null) {
			return true;
		}
		
		 a = x;
		 b = y;
		carta = this.getManoscritto().getCarta(a--, b++);
		if(carta != null) {
			return true;
		}
		 a = x;
		 b = y;
		carta = this.getManoscritto().getCarta(a++, b++);
		if(carta != null) {
			return true;
		}
		
		
		return false;
		
		
	}
	
	private int angoloCoperto(int x,int y) {
	int angoloEsiste = 0;
	int a = x;
	int b = y;
	Carta carta = this.getManoscritto().getCarta(a--, b--);
	if(carta != null) {
		if(carta.getAngolo(3) != null || carta.getAngolo(3).getRisorsa()!=Risorsa.vuoto ) {
			
			removeRisorsa(carta.getAngolo(3).getRisorsa());
			angoloEsiste ++;
		}
	}
	
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(a++, b--);
	if(carta != null) {
		if(carta.getAngolo(1) != null || carta.getAngolo(1).getRisorsa()!=Risorsa.vuoto) {
			
			removeRisorsa(carta.getAngolo(1).getRisorsa());
			angoloEsiste ++;
		}
	}
	
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(a--, b++);
	if(carta != null) {
		if(carta.getAngolo(2) != null || carta.getAngolo(2).getRisorsa()!=Risorsa.vuoto) {
			
			removeRisorsa(carta.getAngolo(2).getRisorsa());
			angoloEsiste ++;
		}
	}
	 a = x;
	 b = y;
	carta = this.getManoscritto().getCarta(a++, b++);
	if(carta != null) {
		if(carta.getAngolo(0) != null || carta.getAngolo(1).getRisorsa()!=Risorsa.vuoto) {
			
			removeRisorsa(carta.getAngolo(0).getRisorsa());
			angoloEsiste ++;
		}
	}
	return angoloEsiste;
	}
	
    public void movimentoSuMatrice(Partita par,Carta carta) throws InterruptedException {
 
    	int x = 46;
    	int y = 46;
    	int a = x;
    	int b = y;
    	String scelta = "";
    	System.out.println("sei sulla carta iniziale");
    	stampa(x,y);
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

            else {
            	
				System.out.println("\n il valore inserito non e' un opzione \n");
				
			}
             
            }while(!scelta.equalsIgnoreCase("piazza") && piazzaCarta(par,carta,x,y)==false);
    	
		
    	   	
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
   
   public void stampaCarteInMano() {
	   
	   
   }
   
   public void stampaCartaObiettivo() {
	   
	   String[][] color1 = carteObiettivo.get(0).creaCarta();
	   if(carteObiettivo.get(0)!=null) {
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
   
   
   
  
   
   

   public void round () {
	   
   }

}