package entidades;

import visitors.VisitorIF;

public interface ElementoConcretoIF {

	public void aceitaVisita(VisitorIF v);
}
