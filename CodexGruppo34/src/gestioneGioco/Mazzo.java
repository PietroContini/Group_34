package gestioneGioco;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import componentiGioco.Carta;

public class Mazzo {
	
    private  ArrayList<Carta> carte;
    private int num;
    
    public Mazzo(int numero, ArrayList<Carta> carte ) {
    	this.carte=carte;
    	this.num=numero;
 
    	
    }

	public void mischiaMazzo() {
 
		Collections.shuffle(carte);
	
	}
	
	public Carta getCarta() {
		num--;
		return this.carte.get(num);
		
	}

}
