package factorys;

import entidades.*;
import interfaces.*;

public class SanduicheBolaFactory implements SanduicheFactory {
	
	public SanduicheFactory criarFactory() {
		return new SanduicheBolaFactory();
	}
	
    @Override
    public Sanduiche criarSanduiche() {
    	Pao PaoBola = new PaoBola();
    	Queijo QueijoPrato = new QueijoPrato();
    	Presunto PresuntoPeru = new PresuntoPeru();
    	Ovo OvoGranja = new OvoGranja();
    	Sanduiche sanduiche = new Sanduiche();
    	sanduiche.preparar(PaoBola, QueijoPrato, PresuntoPeru, OvoGranja);
        return sanduiche;
    }
}