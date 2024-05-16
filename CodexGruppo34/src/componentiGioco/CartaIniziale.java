package componentiGioco;

import java.util.ArrayList;



public class CartaIniziale extends Carta {
	
	private ArrayList<Risorsa> risorseBase;
	private TipoIni tipo;

    public CartaIniziale(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,ArrayList <Risorsa> richiesta) {
    	 
    	super(angolo1,angolo2,angolo3,angolo4);
    	this.risorseBase = richiesta;

    }

	public CartaIniziale(Angolo angolo1, Angolo angolo2, Angolo angolo3, Angolo angolo4,TipoIni tipo) {
		super(angolo1,angolo2,angolo3,angolo4);
		this.tipo=tipo;
	}

	public TipoIni getTipo() {
		return tipo;
	}
    
    public static CartaIniziale retroCarta(CartaIniziale x) {
    	ArrayList<Risorsa> listaIni = new ArrayList<> ();
    	Angolo angolo1 = new Angolo();
		Angolo angolo2 = new Angolo();
		Angolo angolo3 = new Angolo();
		Angolo angolo4 = new Angolo();
		
    	if(x.tipo == TipoIni.CartaIni1) {
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.farfalla);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.foglia);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		
		listaIni.add(Risorsa.farfalla);
		
		CartaIniziale cartaIni1 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		return cartaIni1;
		
    	}
    	else if(x.tipo == TipoIni.CartaIni2) {
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.lupo);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.fungo);
		listaIni.add(Risorsa.fungo);
		
		CartaIniziale cartaIni2 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		return cartaIni2;
		
    	}
    	else if(x.tipo == TipoIni.CartaIni3) {
		
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		listaIni.add(Risorsa.foglia);
		listaIni.add(Risorsa.fungo);
		
		CartaIniziale cartaIni3 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		return cartaIni3;
		
    	}
    	else if(x.tipo == TipoIni.CartaIni4) {
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,Risorsa.vuoto);
		angolo3 = new Angolo(Posizione.AltoDestra,Risorsa.vuoto);
		angolo4 = new Angolo(Posizione.BassoDestra,Risorsa.vuoto);
		listaIni.add(Risorsa.lupo);
		listaIni.add(Risorsa.farfalla);
		
		CartaIniziale cartaIni4 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		return cartaIni4;
    	}
    	else if(x.tipo == TipoIni.CartaIni5) {
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		listaIni.add(Risorsa.lupo);
		listaIni.add(Risorsa.farfalla);
		listaIni.add(Risorsa.foglia);
		
		CartaIniziale cartaIni5 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		return cartaIni5;
    	}
    	else if(x.tipo == TipoIni.CartaIni6) {
		angolo1 = new Angolo(Posizione.AltoSinistra,Risorsa.vuoto);
		angolo2 = new Angolo(Posizione.BassoSinistra,null);
		angolo3 = new Angolo(Posizione.AltoDestra,null);
		angolo4 = new Angolo(Posizione.BassoDestra,null);
		listaIni.add(Risorsa.foglia);
		listaIni.add(Risorsa.lupo);
		listaIni.add(Risorsa.fungo);
		
		CartaIniziale cartaIni6 = new CartaIniziale(angolo1,angolo2,angolo3,angolo4,listaIni);
		return cartaIni6;
		
    	}
		return null;
    }
}
