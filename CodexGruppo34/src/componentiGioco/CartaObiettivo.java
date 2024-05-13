package componentiGioco;

import java.util.ArrayList;

public class CartaObiettivo extends Carta {
	
	private PuntiPerCarta puntiCarta;
	private String tipo = "n";
	
    public CartaObiettivo(int punti,Risorsa [] risorsa,String tipo) {
    	 
    	this.puntiCarta = new PuntiPerCarta(punti,risorsa);
    	this.tipo=tipo;
    }
    public CartaObiettivo(int punti,String tipo) {
    	
    	this.puntiCarta = new PuntiPerCarta(punti);
    	this.tipo=tipo;
    }
	public PuntiPerCarta getPuntiCarta() {
		return puntiCarta;
	}
	public String getTipo() {
		return tipo;
	}
	
}
