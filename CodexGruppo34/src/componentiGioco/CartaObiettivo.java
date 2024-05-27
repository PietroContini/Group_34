package componentiGioco;

import carteObiettivo.CartaObiettivo1;
import carteObiettivo.CartaObiettivo10;
import carteObiettivo.CartaObiettivo11;
import carteObiettivo.CartaObiettivo12;
import carteObiettivo.CartaObiettivo13;
import carteObiettivo.CartaObiettivo14;
import carteObiettivo.CartaObiettivo15;
import carteObiettivo.CartaObiettivo16;
import carteObiettivo.CartaObiettivo2;
import carteObiettivo.CartaObiettivo3;
import carteObiettivo.CartaObiettivo4;
import carteObiettivo.CartaObiettivo5;
import carteObiettivo.CartaObiettivo6;
import carteObiettivo.CartaObiettivo7;
import carteObiettivo.CartaObiettivo8;
import carteObiettivo.CartaObiettivo9;

public class CartaObiettivo extends Carta {
	
	private CartaObiettivoEn tipo;
	
    public CartaObiettivo(CartaObiettivoEn tipo) {
  
    	this.tipo=tipo;
    }
    
	public CartaObiettivoEn getTipo() {
		return tipo;
	}
	
	public void stampaCarta(){
		
		// tripla rossa
		if(this.tipo == CartaObiettivoEn.COTriplaRossa ) {
			CartaObiettivo1.stampaCarta();
			
		}
		
		// tripla verde
		if(this.tipo == CartaObiettivoEn.COTriplaVerde ) {
			CartaObiettivo2.stampaCarta();
			
		}
		
		// tripla viola
		if(this.tipo == CartaObiettivoEn.COTriplaViola ) {
			CartaObiettivo3.stampaCarta();
			
		}
		
		// tripla azzurra
		if(this.tipo == CartaObiettivoEn.COTriplaAzzurra ) {
			CartaObiettivo4.stampaCarta();;
			
		}
		
		
		
		// forma a r
		if(this.tipo == CartaObiettivoEn.COFormaR ) {
			CartaObiettivo7.stampaCarta();;
			
		}
		
		// forma a 1
		if(this.tipo == CartaObiettivoEn.COForma1 ) {
			CartaObiettivo8.stampaCarta();
			
		}
		
		// forma a L
		if(this.tipo == CartaObiettivoEn.COFormaL ) {
			CartaObiettivo5.stampaCarta();
			
		}
		
		// forma a J
		if(this.tipo == CartaObiettivoEn.COFormaJ ) {
			CartaObiettivo6.stampaCarta();
			
		}
		
		
			
		if(this.tipo == CartaObiettivoEn.COTreFungo ) {
			CartaObiettivo9.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.COTreLupo ) {
			CartaObiettivo11.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.COTreFarfalla ) {
			CartaObiettivo12.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.COTreFoglia ) {
			CartaObiettivo10.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.CODuePiuma ) {
			CartaObiettivo16.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.CODuePergamena ) {
			CartaObiettivo14.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.CODueBoccetta ) {
			CartaObiettivo15.stampaCarta();
		}
		
		if(this.tipo == CartaObiettivoEn.COTreDiversi ) {
			CartaObiettivo13.stampaCarta();
		}
		
	}
	
	public String [][] creaCarta() {
		
				// tripla rossa
				if(this.tipo == CartaObiettivoEn.COTriplaRossa ) {
					CartaObiettivo1.creaCarta();
					
				}
				
				// tripla verde
				if(this.tipo == CartaObiettivoEn.COTriplaVerde ) {
					CartaObiettivo2.creaCarta();
					
				}
				
				// tripla viola
				if(this.tipo == CartaObiettivoEn.COTriplaViola ) {
					CartaObiettivo3.creaCarta();
					
				}
				
				// tripla azzurra
				if(this.tipo == CartaObiettivoEn.COTriplaAzzurra ) {
					CartaObiettivo4.creaCarta();
					
				}
				
				
				
				// forma a r
				if(this.tipo == CartaObiettivoEn.COFormaR ) {
					CartaObiettivo7.creaCarta();
					
				}
				
				// forma a 1
				if(this.tipo == CartaObiettivoEn.COForma1 ) {
					CartaObiettivo8.creaCarta();
					
				}
				
				// forma a L
				if(this.tipo == CartaObiettivoEn.COFormaL ) {
					CartaObiettivo5.creaCarta();
					
				}
				
				// forma a J
				if(this.tipo == CartaObiettivoEn.COFormaJ ) {
					CartaObiettivo6.creaCarta();
					
				}
				
				
					
				if(this.tipo == CartaObiettivoEn.COTreFungo ) {
					CartaObiettivo9.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.COTreLupo ) {
					CartaObiettivo11.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.COTreFarfalla ) {
					CartaObiettivo12.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.COTreFoglia ) {
					CartaObiettivo10.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.CODuePiuma ) {
					CartaObiettivo16.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.CODuePergamena ) {
					CartaObiettivo14.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.CODueBoccetta ) {
					CartaObiettivo15.creaCarta();
				}
				
				if(this.tipo == CartaObiettivoEn.COTreDiversi ) {
					CartaObiettivo13.creaCarta();
				}
		
		
		
		
		
		return null;
		
		
	}
}
