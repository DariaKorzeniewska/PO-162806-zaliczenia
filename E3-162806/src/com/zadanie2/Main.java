package com.zadanie2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);

        ArrayList<Integer> nowa = dopasuj(lista1,lista2);

        for(Integer i : nowa){
            System.out.println(i);
        }

    }

    public static <T extends Comparable<? super T>> ArrayList<T> dopasuj(ArrayList<? extends T> lista1, ArrayList<? extends T> lista2){
        if(lista1.isEmpty()){
            throw new IllegalArgumentException("Pusta lista pierwsza");
        }
        if(lista2.isEmpty()){
            throw new IllegalArgumentException("Pusta lista druga");
        }
        ArrayList<T> wynik = new ArrayList<T>();

        for(T i : lista1){
            wynik.add(i);
        }
        
        for(T j : lista2){
            wynik.add(j);
        }

        return wynik;
    }
}
