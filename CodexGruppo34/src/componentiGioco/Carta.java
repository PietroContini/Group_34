package componentiGioco;

import java.util.ArrayList;

public class Carta {
	
	private Angolo [] angoli = new Angolo [4];
	private Colore color;
    

   
	public Carta(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4) {
    	this.angoli[0] = angolo1;
    	this.angoli[1] = angolo2;
    	this.angoli[2] = angolo3;
    	this.angoli[3] = angolo4;
    	
    }
    public Carta(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,Colore col) {
    	this.angoli[0] = angolo1;
    	this.angoli[1] = angolo2;
    	this.angoli[2] = angolo3;
    	this.angoli[3] = angolo4;
    	this.color=col;
    }
    
    public Carta() {
    	
    }
    public Colore getColor() {
		return color;
	}
}
