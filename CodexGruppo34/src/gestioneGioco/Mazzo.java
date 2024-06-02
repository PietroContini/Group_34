package gestioneGioco;
import java.util.ArrayList;
import java.util.Collections;

import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;

public class Mazzo {
	
    private  ArrayList<Carta> carte;
    private  ArrayList<CartaOro> carteOro;
    private  ArrayList<CartaRisorsa> carteRisorsa;
    private  ArrayList<CartaIniziale> carteIniziale;
    private  ArrayList<CartaObiettivo> carteObiettivo;
    private int num;
    
    public Mazzo(int numero, ArrayList<Carta> carte ) {
    	this.carte=carte;
    	this.num=numero;

    }
    
    public Mazzo() {
    	

    }
    
    public void MazzoCarteRisorsa(int numero, ArrayList<CartaRisorsa> carte ) {
    	this.carteRisorsa=carte;
    	this.num=numero;
 
    	
    }
    
    public void MazzoCarteObiettivo(int numero, ArrayList<CartaObiettivo> carte ) {
    	this.carteObiettivo=carte;
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
		if(this.carte!=null) {
		    Collections.shuffle(carte);
		}
		else if(this.carteIniziale!=null) {
			Collections.shuffle(carteIniziale);
		}
		else if(this.carteRisorsa!=null) {
			Collections.shuffle(carteRisorsa);
		}
		else if(this.carteObiettivo!=null) {
			Collections.shuffle(carteObiettivo);
		}
		else if(this.carteOro!=null) {
			Collections.shuffle(carteOro);
		}
	
	}
	
	public CartaRisorsa getCartaR() {
		
		if(num > 0) {
			
		num--;
		return this.carteRisorsa.get(num);
		
		}
		return null;
	}
	public CartaOro getCartaO() {
		
		if(num > 0) {
		num--;
		return this.carteOro.get(num);
		}

		return null;
		
	}
	
	public CartaObiettivo getCartaOb() {
		num--;
		return this.carteObiettivo.get(num);
		
	}
	
	public CartaIniziale getCartaI() {
		num--;
		return this.carteIniziale.get(num);
	}

	public ArrayList<Carta> getCarte() {
		return carte;
	}

	public int getCartaRimasta() {
		return num;
	}
	
	
	

}
