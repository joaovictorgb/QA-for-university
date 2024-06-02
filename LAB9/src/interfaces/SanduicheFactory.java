package interfaces;

import entidades.Sanduiche;

public interface SanduicheFactory {
	SanduicheFactory criarFactory();
    Sanduiche criarSanduiche();
}