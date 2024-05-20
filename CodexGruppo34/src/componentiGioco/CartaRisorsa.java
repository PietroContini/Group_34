package componentiGioco;

import java.util.ArrayList;

public class CartaRisorsa extends Carta {
	
	private int puntiRis;
	
	
    public CartaRisorsa(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,int punti,Colore col) {
   	 
    	super(id,angolo1,angolo2,angolo3,angolo4,col);
    	this.puntiRis=punti;
    	

    }
    
    public CartaRisorsa(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,Colore col) {
   	 
    	super(id,angolo1,angolo2,angolo3,angolo4,col);
    	
    }
    
    public static CartaRisorsa retroCarta(CartaRisorsa x) {
    	
    	Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
    	
    	CartaRisorsa y = new CartaRisorsa(x.getId(),angolo1,angolo2,angolo3,angolo4,x.getColor());
    	
    	return y;
    	
    }

	public int getPuntiRis() {
		return puntiRis;
	}
    

}
