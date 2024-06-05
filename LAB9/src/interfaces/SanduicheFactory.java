package interfaces;

import entidades.Sanduiche;

public interface SanduicheFactory {
	SanduicheFactory criarFactory();
    Pao criarPao();
    Queijo criarQueijo();
    Presunto criarPresunto();
    Ovo criarOvo();
    Sanduiche preparar();

}