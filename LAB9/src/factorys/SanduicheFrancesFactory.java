package factorys;

import entidades.*;
import interfaces.*;

public class SanduicheFrancesFactory implements SanduicheFactory {
	
	@Override
	public SanduicheFactory criarFactory() {
		return new SanduicheFrancesFactory();
	}
	
	@Override
    public Sanduiche criarSanduiche() {
    	Pao PaoFrances = new PaoFrances();
    	Queijo QueijoCheddar = new QueijoCheddar();
    	Presunto PresuntoFrango = new PresuntoFrango();
    	Ovo OvoCapoeira = new OvoCapoeira();
    	Sanduiche sanduiche = new Sanduiche();
    	sanduiche.preparar(PaoFrances, QueijoCheddar, PresuntoFrango, OvoCapoeira);
        return sanduiche;
    }
    
}