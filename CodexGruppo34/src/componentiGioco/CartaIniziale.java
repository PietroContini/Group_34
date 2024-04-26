package componentiGioco;

import java.util.ArrayList;



public class CartaIniziale extends Carta {
	
	private ArrayList<Risorsa> risorseBase;

    public CartaIniziale(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,ArrayList <Risorsa> richiesta) {
    	 
    	super(angolo1,angolo2,angolo3,angolo4);
    	this.risorseBase = richiesta;

    }
}
