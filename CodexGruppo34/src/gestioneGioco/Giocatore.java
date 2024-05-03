package gestioneGioco;
import componentiGioco.Carta;
import componentiGioco.CartaObiettivo;
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

}