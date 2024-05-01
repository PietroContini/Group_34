package gestioneGioco;
import java.util.Random;

import componentiGioco.Carta;

public class Mazzo {
	
    private Carta [] carte;
    private int num;
    
    public Mazzo(int numero,Carta[] carte ) {
    	this.carte=new Carta[numero];
    	this.carte=carte;
    	this.num=numero;
 
    	
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
	
	public Carta getCarta() {
		num--;
		return this.carte[num];
		
	}

}
