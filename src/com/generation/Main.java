package com.generation;

import com.sun.corba.se.spi.orbutil.proxy.LinkedInvocationHandler;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        /*
            Los arreglos en java son más restrictivos, solo permiten un tipo de dato y se le tiene que indicar la extension

            También se puede declarar como: String universidades []= new String[5];

            Y se puede rellenar: String[] universidades = new String[]{"1","2","n"};

	    String[] universidades;
        universidades = new String[5];  // el número es el tamaño del arreglo no el del index maximo
        universidades[0] = "La poderosísima UNAM";
        universidades[1] = "ITVH";
        universidades[2] = "IPN";
        universidades[3] = "UAM";
        universidades[4] = "UPN";


        for (String universidad : universidades) {  //la estructura de un forEach en Java
            System.out.println(universidad);
        }
         */
        Set<String> frutas = new HashSet(4);
        /*
        Asi se declara una collection en donde no se pueden repetir elementos.
        Es el más rapido
        El orden de los elementos puede variar.
        El parámetro 4 de HashSet es el minim de capacidad.
        */
        frutas.add("Sandia");
        frutas.add("Fresa");
        frutas.add("Plátano");
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Uva");
        frutas.add("Sandia"); //no lo incluye porque está repetido

        for (String fruta : frutas
             ) {
            System.out.println(fruta);
        }

        System.out.println("--------------------------------------");

        Set<String> frutas2 = new TreeSet<>();
        /*
        Asi se declara una collection en donde no se pueden repetir elementos.
        Es el más lento
        El orden de los elementos es fijo.
        No tiene minima capacidad
        */
        frutas2.add("Sandia");
        frutas2.add("Fresa");
        frutas2.add("Plátano");
        frutas2.add("Pera");
        frutas2.add("Manzana");
        frutas2.add("Uva");

        for (String fruta : frutas2
        ) {
            System.out.println(fruta);
        }

        System.out.println("--------------------------------------");

        Set<String> frutas3 = new LinkedHashSet<>();
        /*
        Los ordena como se van entrando
        es un poco más lento que hashSet
        */

        frutas3.add("Sandia");
        frutas3.add("Fresa");
        frutas3.add("Plátano");
        frutas3.add("Pera");
        frutas3.add("Manzana");
        frutas3.add("Uva");

        for (String fruta : frutas3
        ) {
            System.out.println(fruta);
        }

        System.out.println("-- Luis Angel D. --");

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));

    }
}
