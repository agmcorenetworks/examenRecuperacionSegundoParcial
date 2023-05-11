package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {
	public static void recorreArray() {
	    int max = Integer.MIN_VALUE;
	    int i = 0;
	    while (i < Constantes.NUMBERS.length) {
			int num = Constantes.NUMBERS[i];
	        if (num > max) {
	            max = num;
	        }
	        i++;
	    }
	    System.out.println("El número mayor del array es: " + max);
	    if (max % 2 == 0) {
	        System.out.println("El número es par");
	    }
	}
	
	public static void recorreArrayInverso() {
	    int suma = 0;
	    int i = Constantes.NUMBERS.length - 1;
	    do {
	        int num = Constantes.NUMBERS[i];
	        if (i % 2 != 0) {
	            suma += num;
	        }
	        i--;
	    } while (i >= 0);
	    System.out.println("La suma de los elementos en posiciones impares del array es: " + suma);
	}
	
	public static void pares1a100() {
	    int num = 1;
	    do {
	        if (num % 2 == 0) {
	            System.out.println(num);
	        }
	        num++;
	    } while (num <= 100);
	}
	
	public static void deTresEnTres() {
	    int num = 1;
	    while (num <= 100) {
	        System.out.println(num);
	        num += 3;
	    }
	}
	
	
}
