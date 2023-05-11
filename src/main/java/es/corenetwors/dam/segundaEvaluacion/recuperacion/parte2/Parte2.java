package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {

	public static int recorreArray() {
		int i = 0;
		int numeroMax = 0;
		while (i < Constantes.NUMBERS.length) {

			if (numeroMax < Constantes.NUMBERS[i])
				Constantes.NUMBERS[i] = numeroMax;

			i++;
		}

		if (numeroMax % 2 == 0)
			System.out.println("Es par el numero");

		return numeroMax;
	}

	public static int recorreArrayInverso() {

		int sum = 0;

		int indice = Constantes.NUMBERS.length - 1;

		do {

			if (Constantes.NUMBERS[indice] % 2 != 0) {

				sum += Constantes.NUMBERS[indice];

			}

			indice--;
		} while (indice >= 0);

		return sum;
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
	
	
	

	public static void main(String[] args) {

		System.out.println(recorreArrayInverso());

	}

}
