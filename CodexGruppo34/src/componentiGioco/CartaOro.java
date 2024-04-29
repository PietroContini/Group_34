package componentiGioco;

import java.util.ArrayList;

public class CartaOro extends Carta {
	
	private PuntiPerCarta puntiCarta;
	private ArrayList <Risorsa> richiesta;
	private Colore color;
	
    public CartaOro(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,ArrayList <Risorsa> richiesta,int punti,Risorsa risorsa,Colore col) {
 
    	super(angolo1,angolo2,angolo3,angolo4);
    	this.richiesta=richiesta;
    	this.puntiCarta = new PuntiPerCarta(punti,risorsa);
    	this.color=col;
    }

}
