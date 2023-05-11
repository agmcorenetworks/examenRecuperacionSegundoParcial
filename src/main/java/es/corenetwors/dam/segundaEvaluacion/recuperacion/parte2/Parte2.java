package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {

    public static void recorreArray() {
        int[] array = Constantes.NUMBERS;
        int mayor = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
            i++;
        }
        System.out.println("El número mayor del array es: " + mayor);
        if (mayor % 2 == 0) {
            System.out.println("El número es par");
        }
    }

    public static void recorreArrayInverso() {
        int[] array = Constantes.NUMBERS;
        int i = array.length - 1;
        int suma = 0;
        do {
            if (i % 2 != 0) {
                suma += array[i];
            }
            i--;
        } while (i >= 0);
        System.out.println("La suma de los elementos en posiciones impares es: " + suma);
    }

    public static void pares1a100() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    public static void deTresEnTres() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i += 3;
        }
    }
}
