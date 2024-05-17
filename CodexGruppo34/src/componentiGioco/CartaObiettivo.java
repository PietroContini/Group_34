package componentiGioco;


public class CartaObiettivo extends Carta {
	
	private CartaObiettivoEn tipo;
	
    public CartaObiettivo(CartaObiettivoEn tipo) {
  
    	this.tipo=tipo;
    }
    
	public CartaObiettivoEn getTipo() {
		return tipo;
	}
	
}
