package componentiGioco;

import java.util.ArrayList;

public class CartaOro extends Carta {
	
	private PuntiPerCarta puntiCarta;
	private ArrayList <Risorsa> richiesta;
	
    public CartaOro(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,ArrayList <Risorsa> richiesta,int punti,Risorsa risorsa,Colore col) {
 
    	super(id,angolo1,angolo2,angolo3,angolo4,col);
    	this.richiesta=richiesta;
    	this.puntiCarta = new PuntiPerCarta(punti,risorsa);
    	
    }
    
    public CartaOro(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,Colore col) {
    	 
    	super(id,angolo1,angolo2,angolo3,angolo4,col);
    	
    }
    
    public static CartaOro retroCarta(CartaOro x) {
    	
    	Angolo angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		Angolo angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		Angolo angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		Angolo angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
    	
    	CartaOro y = new CartaOro(x.getId(),angolo1,angolo2,angolo3,angolo4,x.getColor());
    	
    	return y;
    	
    }

	public ArrayList<Risorsa> getRichiesta() {
		return richiesta;
	}

	public PuntiPerCarta getPuntiCarta() {
		return puntiCarta;
	}
    

}
