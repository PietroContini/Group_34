package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import gestioneGioco.Giocatore;
import gestioneGioco.Manoscritto;
import gestioneGioco.Partita;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Partita partita = new Partita();
		ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
		boolean sceltaSbagliata = false;
		do {
		sceltaSbagliata = false;
		System.out.println("\n Quanti giocatori siete? min 2, max 4 \n");
		Scanner sc = new Scanner(System.in);
		String scelta = sc.nextLine();
		
			if(scelta.equalsIgnoreCase("2") || scelta.equalsIgnoreCase("3") || scelta.equalsIgnoreCase("4") ) {
				
			
				int numGiocatori = Integer.parseInt(scelta);
				ArrayList<String> nomi = new ArrayList<String>();
				
				for(int i=0 ; i<numGiocatori ; i++) {
					
					boolean sceltaNome = false;
					do {
					sceltaNome = false;
					System.out.println("\n Come ti chiami? Giocatore N:"+ (i+1) + "\n");
					Scanner sc1 = new Scanner(System.in);
					String scelta1 = sc1.nextLine();
					for (String string : nomi) {
						if(scelta1.equalsIgnoreCase(string)) {
							sceltaNome = true;
						}
					}
					
					if(sceltaNome == false) {
						Manoscritto m = new Manoscritto();
						Giocatore giocatore = new Giocatore(m,scelta1,partita);
						giocatori.add(giocatore);
						nomi.add(scelta1);
					}
					else if (sceltaNome == true){
						System.out.println("\n Il nome del giocatore è già stato usato, cambialo \n");
						
					}
					
					}while(sceltaNome == true);
				}
			}
			else {
				sceltaSbagliata = true;
			}
		}while(sceltaSbagliata == true);
		
		partita.setGiocatori(giocatori);
		partita.InizioPartita();
	
	}

	  
	
	
}
