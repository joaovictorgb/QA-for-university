package factorys;

import entidades.*;
import interfaces.*;

public class SanduicheIntegralFactory implements SanduicheFactory {
	
	
	@Override
	public SanduicheFactory criarFactory() {
		return new SanduicheIntegralFactory();
	}

	@Override
	public Sanduiche criarSanduiche() {
		Pao PaoIntegral = new PaoIntegral();
    	Queijo QueijoMussarela = new QueijoMussarela();
    	Presunto PresuntoPeru = new PresuntoPeru();
    	Ovo OvoCapoeira = new OvoCapoeira();
    	Sanduiche sanduiche = new Sanduiche();
    	sanduiche.preparar(PaoIntegral, QueijoMussarela, PresuntoPeru, OvoCapoeira);
        return sanduiche;
	}
	
	
   
}