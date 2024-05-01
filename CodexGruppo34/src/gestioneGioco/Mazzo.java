package gestioneGioco;
import java.util.Random;

import componentiGioco.Carta;

public class Mazzo {
	
    private Carta [] carte;
    
    public Mazzo(int numero,Carta[] carte ) {
    	this.carte=new Carta[numero];
    	this.carte=carte;
    	
 
    	
    }

	public void mischiaMazzo() {
		Random rn = new Random();
		
		for(int i=0; i<this.carte.length;i++) {
			int nuovoIndice = rn.nextInt(this.carte.length);
          Carta carta = this.carte[nuovoIndice];
          this.carte[nuovoIndice] = this.carte[i];
          this.carte[i] = carta;
		}
	
	}

}
