package componentiGioco;

import java.util.ArrayList;

public class CartaObiettivo extends Carta {
	
	private PuntiPerCarta puntiCarta;
	private ArrayList <Risorsa> richiesta;
	
    public CartaObiettivo(ArrayList <Risorsa> richiesta,int punti,Risorsa risorsa) {
    	 
    	this.richiesta = richiesta;
    	this.puntiCarta = new PuntiPerCarta(punti,risorsa);
    }
	
}
