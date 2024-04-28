package componentiGioco;

import java.util.ArrayList;

public class CartaRisorsa extends Carta {
	
	private int puntiRis;
	private Colore color;
	
    public CartaRisorsa(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,int punti,Colore col) {
   	 
    	super(angolo1,angolo2,angolo3,angolo4);
    	this.puntiRis=punti;
    	this.color=col;

    }

}
