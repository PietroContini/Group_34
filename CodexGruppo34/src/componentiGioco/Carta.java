package componentiGioco;

import java.util.ArrayList;

public class Carta {
	
	private Angolo [] angoli = new Angolo [4];
	private Colore color;
	private String id;
    

   
	public Carta(Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4) {
    	this.angoli[0] = angolo1;
    	this.angoli[1] = angolo2;
    	this.angoli[2] = angolo3;
    	this.angoli[3] = angolo4;
    	
    }
    public Carta(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4,Colore col) {
    	this.angoli[0] = angolo1;
    	this.angoli[1] = angolo2;
    	this.angoli[2] = angolo3;
    	this.angoli[3] = angolo4;
    	this.color=col;
    	this.id=id;
    }
    public Carta(String id,Angolo angolo1,Angolo angolo2,Angolo angolo3,Angolo angolo4) {
    	this.angoli[0] = angolo1;
    	this.angoli[1] = angolo2;
    	this.angoli[2] = angolo3;
    	this.angoli[3] = angolo4;
    	this.id=id;
    }
    
    public Carta() {
    	
    }
    public Colore getColor() {
		return color;
	}
	public String getId() {
		return id;
	}
	
    public Angolo getAngolo(int x) {
		return angoli[x];
	}
	public ArrayList<Risorsa> risorseAngoli (){
    	ArrayList<Risorsa> x = new ArrayList<Risorsa>();
    	for (int i=0;i<4;i++) {
    	if(this.angoli[i] != null ) {
    		x.add(angoli[i].getRisorsa());
    		
    	}
    	}
    	return x;
    }
	
	 public static String [][] stampaVuoto() {
		 
			//ATT! i vari spazi e assegnazioni manuali servono per rendere la stampa omogenea visivamente
			   
			   // assegnazione colori carta 
			   String colore = "\033[48;2;255;255;255m";
			   String coloreS ="\033[48;2;105;105;105m ";
		  
		       
			   String[][] color = new String[10][5];
			   
			// impostazione colori righe 
			   
			   for(int x=0;x<5;x++) {

		           for(int y=0;y<10;y++) {
		            
		                	   color[y][x]= colore+" ";
		                   
		           }

		       }		 
			   
		        for(int y=0;y<10;y++) {
		            
		        	color[y][0]= coloreS;

		        }

		        for(int y=0;y<10;y++) {
		            
		           color[y][4]= coloreS;
		            
			    }
			          
		        for(int x=0;x<5;x++) {

			        color[9][x]= coloreS;
			
			    }
			   
		        for(int x=0;x<5;x++) {

			        color[0][x]= coloreS;
			
			    }
				return color;
		       
		       
		       
		       
		       
		   }
}
