package main;

import entidades.Sanduiche;
import factorys.*;
import interfaces.*;

public class Main {
	public static void main(String[] args) {
        SanduicheFactory[] factories = { 
            new SanduicheIntegralFactory(), 
            new SanduicheFrancesFactory(), 
            new SanduicheBolaFactory() 
        };
        
        for (SanduicheFactory factory : factories) {
            Sanduiche sanduiche = factory.preparar();
            System.out.println(sanduiche);
        }
    }
}