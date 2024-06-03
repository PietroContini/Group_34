package gestioneGioco;

import java.util.ArrayList;

import componentiGioco.Carta;

public class Manoscritto {

	private Carta [][] carteManoscritto = new Carta [90][90];
	private ArrayList<Carta> carteUsate = new ArrayList<Carta>();
	
	public Manoscritto() {
		
	}
	
	public Carta getCarta(int x,int y) {
		
		Carta f = carteManoscritto[x][y];
		return f;
		
		
	}
	
	/**
	 * cerca carte usate nel manoscritto
	 * @param Carta x
	 * @return boolean
	 */
	public boolean search(Carta x) {
		
		for(int i=0;i<carteUsate.size();i++) {
			if(carteUsate.get(i).getId().equalsIgnoreCase(x.getId())) {
				return true;
			}
		}
		
		return false;
	}
	
	public void addS(ArrayList<Carta> x) {
		
		carteUsate.addAll(x);
		
	}

	public void setCarteUsate(ArrayList<Carta> carteUsate) {
		this.carteUsate = carteUsate;
	}

	public ArrayList<Carta> getCarteUsate() {
		return carteUsate;
	}
	
	public void piazzaCarta (Carta carta,int x,int y) {
		
		carteManoscritto[x][y] = carta;
	}

	public Carta[][] getCarteManoscritto() {
		return carteManoscritto;
	}
}
