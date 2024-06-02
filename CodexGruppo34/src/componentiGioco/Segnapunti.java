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
	
	public int vincitore() {
	 
		int vincitori = 0;
		
		ArrayList<String> giocatoriVincenti = new ArrayList<String>();
		int maxPunti = 0;
		
		for (HashMap.Entry<String, Integer> entry : puntiGiocatori.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			if(maxPunti==0) {
				maxPunti = val;
			}
			
			if(val >= maxPunti){
				giocatoriVincenti.add(key);
				maxPunti=val;
			}
			if(puntiGiocatori.get(giocatoriVincenti.get(0))<maxPunti) {
				giocatoriVincenti.remove(0);
			}
			
		}
		
		vincitori = giocatoriVincenti.size();
			if(vincitori == 1) {
				
				System.out.println("\n Il vincitore è: " + giocatoriVincenti.get(0) + "\n");
				
			}
				return vincitori;
	}

	public HashMap<String, Integer> getPuntiGiocatori() {
		return puntiGiocatori;
	}

}
	
