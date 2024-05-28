package componentiGioco;

import java.util.ArrayList;
import java.util.HashMap;

import gestioneGioco.Giocatore;
import gestioneGioco.Partita;

public class Segnapunti {
	
	HashMap<String,Integer> puntiGiocatori = new HashMap<String,Integer>();
	
	public Segnapunti(Partita a) {
		
		ArrayList<Giocatore> b = a.getGiocatori();
		
		for (Giocatore giocatore : b) {
			
			puntiGiocatori.put(giocatore.getNome(), giocatore.getPunti());
			
		}
		
		
	}
	
	public void aggiornaPunti(Partita a) {
		
	
		ArrayList<Giocatore> b = a.getGiocatori();
		
		for (Giocatore giocatore : b) {
			
			puntiGiocatori.replace(giocatore.getNome(), giocatore.getPunti());
			
		}	
		
		
	}
	
	public void stampaPunti() {
		
		for (HashMap.Entry<String, Integer> entry : puntiGiocatori.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key+" punti: "+val);
			
		}
		
		
	}

}
	
