package componentiGioco;

import java.util.ArrayList;

public class CartaObiettivo extends Carta {
	
	private PuntiPerCarta puntiCarta;
	private String tipo = "n";
	
    public CartaObiettivo(int punti,Risorsa [] risorsa) {
    	 
    	this.puntiCarta = new PuntiPerCarta(punti,risorsa);
    }
    public CartaObiettivo(int punti,String tipo) {
    	
    	this.puntiCarta = new PuntiPerCarta(punti);
    	this.tipo=tipo;
    }
	
}
