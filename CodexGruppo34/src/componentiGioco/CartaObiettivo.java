package componentiGioco;

import java.util.ArrayList;

public class CartaObiettivo extends Carta {
	
	private PuntiPerCarta puntiCarta;
	private CartaObiettivoEn tipo;
	
    public CartaObiettivo(int punti,Risorsa [] risorsa,CartaObiettivoEn tipo) {
    	 
    	this.puntiCarta = new PuntiPerCarta(punti,risorsa);
    	this.tipo=tipo;
    }
    public CartaObiettivo(int punti,CartaObiettivoEn tipo) {
    	
    	this.puntiCarta = new PuntiPerCarta(punti);
    	this.tipo=tipo;
    }
	public PuntiPerCarta getPuntiCarta() {
		return puntiCarta;
	}
	public CartaObiettivoEn getTipo() {
		return tipo;
	}
	
}
