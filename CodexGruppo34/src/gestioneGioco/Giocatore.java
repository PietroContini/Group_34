package gestioneGioco;
import componentiGioco.Carta;
import java.util.ArrayList;


public class Giocatore {
	
private String nome;
private ArrayList<Carta> carteInMano;
private Manoscritto manoscritto;
private int punti;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getPunti() {
	return punti;
}

}