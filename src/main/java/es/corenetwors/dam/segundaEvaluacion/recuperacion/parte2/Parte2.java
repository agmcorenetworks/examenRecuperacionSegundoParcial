package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {
    public static void recorreArray() {
        int i = 0;
        int max = Constantes.NUMBERS[0];
        while(i < Constantes.NUMBERS.length) {
            if (Constantes.NUMBERS[i] > max) {
                max = Constantes.NUMBERS[i];
            }
            i++;
        }
        System.out.println("El número mayor del array es: " + max);
        if (max % 2 == 0) {
            System.out.println("El número es par");
        }
    }

    public static void recorreArrayInverso() {
        int i = Constantes.NUMBERS.length - 1;
        int suma = 0;
        do {
            if (i % 2 != 0) {
                suma += Constantes.NUMBERS[i];
            }
            i--;
        } while(i >= 0);
        System.out.println("La suma de los elementos en posición impar es: " + suma);
    }

    public static void pares1a100() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while(i <= 100);
    }

    public static void deTresEnTres() {
        for (int i = 1; i <= 100; i += 3) {
            System.out.println(i);
        }
    }
}
