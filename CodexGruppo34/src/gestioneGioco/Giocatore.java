package gestioneGioco;
import componentiGioco.Carta;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaOro;
import componentiGioco.Risorsa;

import java.util.ArrayList;


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
	
	public void removeCarta(Risorsa risorsa) {
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

}