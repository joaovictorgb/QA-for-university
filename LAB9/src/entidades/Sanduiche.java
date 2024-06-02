package entidades;

import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class Sanduiche {
    protected Pao pao;
    protected Queijo queijo;
    protected Presunto presunto;
    protected Ovo ovo;
    protected Tomate tomate = new Tomate();

    public void preparar(Pao pao, Queijo queijo, Presunto presunto, Ovo ovo) {
    	this.pao = pao;
    	this.queijo = queijo;
    	this.presunto = presunto;
    	this.ovo = ovo;
    };
    
    @Override
    public String toString() {
        return pao + ", " + queijo + ", " + presunto + ", " + ovo + ", " + tomate;
    }
}