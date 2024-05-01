package gestioneGioco;
import java.util.ArrayList;

import componentiGioco.Carta;
import componentiGioco.CartaIniziale;
import componentiGioco.CartaObiettivo;
import componentiGioco.CartaOro;
import componentiGioco.CartaRisorsa;

public class Partita {
	
	private ArrayList<Giocatore> giocatori;
	private static Mazzo mazzoOro;
	private static Mazzo mazzoRisorsa;
	private static Mazzo mazzoObiettivo;
	private static Mazzo mazzoIniziale;
	private static ArrayList<Carta> carteVisibili;
	
	
	
	
	public static CartaIniziale pescaCartaIni() {
		
		CartaIniziale x = (CartaIniziale) mazzoIniziale.getCarta();
		return x;
			
	}
	
	public static CartaRisorsa pescaCartaRis() {
		
		CartaRisorsa x = (CartaRisorsa) mazzoRisorsa.getCarta();
		return x;
			
	}
	public static CartaOro pescaCartaOro() {
		
		CartaOro x = (CartaOro) mazzoOro.getCarta();
		return x;
			
	}
	public static CartaObiettivo pescaCartaObiettivo() {
		
		CartaObiettivo x = (CartaObiettivo) mazzoObiettivo.getCarta();
		return x;
			
	}
	public static Carta pescaCartaTavolo(int i) {
		
		Carta x =  carteVisibili.get(i);
		return x;
			
	}

	
}
