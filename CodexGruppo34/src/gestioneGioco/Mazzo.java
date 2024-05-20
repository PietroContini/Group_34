package gestioneGioco;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;

public class Mazzo {
	
    private  ArrayList<Carta> carte;
    private  ArrayList<CartaOro> carteOro;
    private  ArrayList<CartaRisorsa> carteRisorsa;
    private  ArrayList<CartaIniziale> carteIniziale;
    private int num;
    
    public Mazzo(int numero, ArrayList<Carta> carte ) {
    	this.carte=carte;
    	this.num=numero;

    }
    
    public void MazzoCarteRisorsa(int numero, ArrayList<CartaRisorsa> carte ) {
    	this.carteRisorsa=carte;
    	this.num=numero;
 
    	
    }
    public ArrayList<CartaOro> getCarteOro() {
		return carteOro;
	}

	public ArrayList<CartaRisorsa> getCarteRisorsa() {
		return carteRisorsa;
	}

	public ArrayList<CartaIniziale> getCarteIniziale() {
		return carteIniziale;
	}

	public void MazzoCarteOro(int numero, ArrayList<CartaOro> carte ) {
    	this.carteOro=carte;
    	this.num=numero;

    }
    
    public void MazzoCarteIniziali(int numero, ArrayList<CartaIniziale> carte ) {
    	this.carteIniziale=carte;
    	this.num=numero;

    }
    

	public void mischiaMazzo() {
 
		Collections.shuffle(carte);
	
	}
	
	public Carta getCarta() {
		num--;
		return this.carte.get(num);
		
	}

	public ArrayList<Carta> getCarte() {
		return carte;
	}
	
	

}
