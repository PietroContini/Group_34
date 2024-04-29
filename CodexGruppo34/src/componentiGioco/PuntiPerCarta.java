package componentiGioco;

public class PuntiPerCarta {
	

	private int punti;
	private Risorsa moltiplicatore;
	private Risorsa [] simboli = new Risorsa [3];
	private Colore [] color = new Colore [3];
	
	public PuntiPerCarta(int punti2, Risorsa risorsa) {
		this.punti = punti2;
		this.moltiplicatore = risorsa;
	}

	public PuntiPerCarta(int punti2, Risorsa [] simbol) {
		this.punti = punti2;
		this.simboli=simbol;
	}
	public PuntiPerCarta(int punti2) {
		this.punti = punti2;
		
	}
	
}
