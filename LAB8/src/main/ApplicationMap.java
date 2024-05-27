package main;

import entities.*;

public class ApplicationMap {
    public static void main(String[] args) {
        ListToMapAdapter<Integer> listToMapAdapter = new ListToMapAdapter<>();
        ListToMapAdapter<Integer> listToMapAdapter2 = new ListToMapAdapter<>();

        //EQUALS
        System.out.println("É igual: " + listToMapAdapter.equals(listToMapAdapter2));

        //PUT
        listToMapAdapter.put(0, 25);
        listToMapAdapter.put(1, 100);
        listToMapAdapter.put(2, 80);
        listToMapAdapter.put(3, 44);
        listToMapAdapter.put(4, 39);

        System.out.println("É igual: " + listToMapAdapter.equals(listToMapAdapter2));
        
        // SIZE
        System.out.println("Tamanho do mapa: " + listToMapAdapter.size());

        //GET
        System.out.println("Primeiro Elemento do mapa: " + listToMapAdapter.get(0));

        //CONTAINS VALUE
        int itemParaVerificar = 25;
        boolean contemItem = listToMapAdapter.containsValue(itemParaVerificar);
        System.out.println("O mapa contém " + itemParaVerificar + ": " + contemItem);

        //IS EMPTY
        boolean estaVazia = listToMapAdapter.isEmpty();
        System.out.println("Mapa está vazio: " + estaVazia);

        //VALUES
        System.out.println("Values: ");
        for (Integer i : listToMapAdapter.values()) {
            System.out.println("- " + i);
        }

        //REMOVE
        System.out.println("Tamanho do mapa antes da remoção: " + listToMapAdapter.size());
        listToMapAdapter.remove(0);
        System.out.println("Tamanho do mapa depois da remoção: " + listToMapAdapter.size());

        //CLEAR
        listToMapAdapter.clear();
        System.out.println("Tamanho do mapaapós limpeza: " + listToMapAdapter.size());
    }
}
