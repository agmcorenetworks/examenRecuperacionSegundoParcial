package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {

	public static int recorreArray() {

		int i = 0;
		int mayor = Integer.MIN_VALUE;

		while (i < Constantes.NUMBERS.length) {
			if (Constantes.NUMBERS[i] > mayor) {
				mayor = Constantes.NUMBERS[i];
			}
			
			i++;
		}

		System.out.println("El numero mas grande es: " + mayor);

		if (mayor % 2 == 0) {
			System.out.println("El numero es par");
		}
		
		return mayor;

	}
	
	public static void sumaPosicionImparInversa() {
	    int i = Constantes.NUMBERS.length - 1;
	    int suma = 0;
	    
	    do {
	        if (i % 2 != 0) {
	            suma += Constantes.NUMBERS[i];
	        }
	        
	        i--;
	    } while (i >= 0);
	    
	    System.out.println("La suma de los elementos en posición impar en sentido inverso es: " + suma);
	}
	
	public static void pares1a100() {
	    int i = 1;
	    
	    do {
	        if (i % 2 == 0) {
	            System.out.println(i + " es un numero par");
	        }
	        i++;
	    } while (i <= 100);
	}

	public static void deTresEnTres() {
	    for (int i = 1; i <= 100; i += 3) {
	        System.out.println(i);
	    }
	}

	
	public static void main(String[] args) {
		System.out.println(recorreArray());
		pares1a100();
		deTresEnTres();
	}

}
