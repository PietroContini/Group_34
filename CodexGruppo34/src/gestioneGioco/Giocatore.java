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
             sc.close();
            }while(!scelta.equalsIgnoreCase("piazza"));
    	
		xy[0]=x;
		xy[1]=y;
		return xy;
    	   	
    }
    
    
   public void stampa(int x,int y) {
   System.out.println("\n Legenda Risorse : F foglia, \n FA farfalla, \n FU fungo, \n L lupo, \n P piuma, \n PE pergamena, \n B boccetta, \n spazio vuoto per angolo vuoto \n");
	   int a = x;
	   int b = y;
	   Partita partita = new Partita();
	   Carta carta = this.manoscritto.getCarta(a--, b--);
	   
	   
	  
		if(carta instanceof CartaIniziale) {
			
			CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta);
			cartaIniziale.stampaCarta();
			}
		
		
		if(carta instanceof CartaOro) {
			CartaOro cartaOro = partita.cercaCartaOro(carta);
			cartaOro.stampaCarta();
			}
		
		
		if(carta instanceof CartaRisorsa) {
		
			CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta);
			cartaRisorsa.stampaCarta();
		}else if(carta == null) {
			Carta.stampaVuoto();
			
		}
		

		System.out.print("\t\t\t");
		
		    a = x;
		    b = y;
		    
		 Carta carta1 = this.manoscritto.getCarta(a++, b--);
			  
			if(carta1 instanceof CartaIniziale) {
				
				CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta1);
				cartaIniziale.stampaCarta();
				}
			
			
			if(carta1 instanceof CartaOro) {
				CartaOro cartaOro = partita.cercaCartaOro(carta1);
				cartaOro.stampaCarta();
				}
			
			
			if(carta1 instanceof CartaRisorsa) {
			
				CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta1);
				cartaRisorsa.stampaCarta();
			}else if(carta1 == null) {
				Carta.stampaVuoto();
				
			}
			
			System.out.println("");
			System.out.print("\t\t\t");
			
		   Carta carta2 = this.manoscritto.getCarta(x,y);
			  
			if(carta2 instanceof CartaIniziale) {
				
				CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta2);
				cartaIniziale.stampaCarta();
				}
			
			
			if(carta2 instanceof CartaOro) {
				CartaOro cartaOro = partita.cercaCartaOro(carta2);
				cartaOro.stampaCarta();
				}
			
			
			if(carta2 instanceof CartaRisorsa) {
			
				CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta2);
				cartaRisorsa.stampaCarta();
			}else if(carta2 == null) {
				Carta.stampaVuoto();
				
			}
			
			System.out.println("");
			
			a = x;
			b = y;
			
			  Carta carta3 = this.manoscritto.getCarta(a--, b++);
			  
				if(carta3 instanceof CartaIniziale) {
					
					CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta3);
					cartaIniziale.stampaCarta();
					}
				
				
				if(carta3 instanceof CartaOro) {
					CartaOro cartaOro = partita.cercaCartaOro(carta3);
					cartaOro.stampaCarta();
					}
				
				
				if(carta3 instanceof CartaRisorsa) {
				
					CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta3);
					cartaRisorsa.stampaCarta();
				}else if(carta3 == null) {
					Carta.stampaVuoto();
					
				}
				

				System.out.print("\t\t\t");
				
				    a = x;
				    b = y;
				    
				   Carta carta4 = this.manoscritto.getCarta(a++, b++);
					  
					if(carta4 instanceof CartaIniziale) {
						
						CartaIniziale cartaIniziale = partita.cercaCartaIniziale(carta4);
						cartaIniziale.stampaCarta();
						}
					
					
					if(carta4 instanceof CartaOro) {
						CartaOro cartaOro = partita.cercaCartaOro(carta4);
						cartaOro.stampaCarta();
						}
					
					
					if(carta4 instanceof CartaRisorsa) {
					
						CartaRisorsa cartaRisorsa = partita.cercaCartaRisorsa(carta4);
						cartaRisorsa.stampaCarta();
					}else if(carta4 == null) {
						Carta.stampaVuoto();
						
					}
					
					System.out.println("");
			
	   
   }
   
   
   
   
   
   
   
  
   
   

   public void round () {
	   
   }

}