package main;
import java.util.Iterator;

import entities.*;


public class AplicationList {
    public static void main(String[] args) {
        MapToListAdapter<Integer> mapToList = new MapToListAdapter<>();
    
        // ADD
        mapToList.add(1);
        mapToList.add(2);
        mapToList.add(3);
    
        // SIZE
        System.out.println("Tamanho: " + mapToList.size()); // Saída esperada: 3
    
        // ISEMPTY
        System.out.println("Está vazio? " + mapToList.isEmpty()); // Saída esperada: false
    
        // GET
        System.out.println("Elemento recuperado: " + mapToList.get(1)); // Saída esperada: Elemento 2

        //REMOVE
        System.out.println("Tamanho antes de remover " +  mapToList.size()); 
        mapToList.remove(0);
        System.out.println("Tamanho após remover " +  mapToList.size()); 
    
        // CONTAINS
        System.out.println("Contém o elemento 3? " + mapToList.contains(3)); // Saída esperada: true

    
        // CLEAR
        mapToList.clear();
        System.out.println("Tamanho após limpar: " + mapToList.size()); // Saída esperada: 0
    
        //EQUALS
        System.out.println("É igual: " + mapToList.equals(new MapToListAdapter<>())); //Saída esperada: True

        // ITERATOR
        mapToList.add(5);
        mapToList.add(6);
        mapToList.add(7);
        System.out.println("Iterando sobre os elementos:");
        Iterator<Integer> iterator = mapToList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // TOARRAY
        Object[] array = mapToList.toArray();
        System.out.println("Conteúdo do array:");
        for (Object element : array) {
            System.out.println(element);
        }


    }
    
}
