package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {

	// 1. método que recorre el array de las constantes y nos dice cual es el mayor
	// y si es par.
	public static void recorreArray() {
		int[] numbers = Constantes.NUMBERS;
		int max = Integer.MIN_VALUE;

		int i = 0;
		while (i < numbers.length) {
			int valor = numbers[i];
			if (valor > max) {
				max = valor;
			}
			i++;
		}

		System.out.println("El número mayor del array es: " + max);

		if (max % 2 == 0) {
			System.out.println("y además el número es par. Información útil a tope.");
		}
	}

// 2. Método para recorrer el array del final al inicio y suma los elementos imapres.

	public static void recorreArrayInverso() {
		int[] numbers = Constantes.NUMBERS;

		int i = numbers.length - 1;
		int sumaImpares = 0;

		do {
			int valor = numbers[i];
			if (i % 2 != 0) {
				sumaImpares += valor;
			}
			i--;
		} while (i >= 0);

		System.out.println("La suma de los elementos imapres del array es: " + sumaImpares);
	}

//3. Método pares1a100 con dowhile

	public static void pares1a100() {
		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}

	
//4. Método 3en3
	
	public static void deTresEnTres() {
	    for (int i = 1; i <= 100; i += 3) {
	        System.out.println(i);
	    }
	}

	
	
	public static void main(String[] args) {
		
		recorreArray();
		recorreArrayInverso();
		pares1a100();
		deTresEnTres();
	}
	
	
}
