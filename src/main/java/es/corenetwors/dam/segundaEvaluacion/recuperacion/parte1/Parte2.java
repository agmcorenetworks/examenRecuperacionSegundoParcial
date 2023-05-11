package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utiles.Constantes;

public class Parte2 {

	public static void recorreArray() {

		int cont = 0;
		int max = Constantes.NUMBERS[0];
		while (cont < Constantes.NUMBERS.length) {
			if (Constantes.NUMBERS[cont] > max)
				max = Constantes.NUMBERS[cont];
			cont++;
		}
		if (max % 2 == 0) {
			System.out.println("el numero " + max + " es par");
		}
	}

	public static void recorreArrayInverso() {

		int cont = Constantes.NUMBERS.length - 1;
		int suma = 0;

		do {
			{
				if (!(Constantes.NUMBERS[cont] % 2 == 0))
					suma = suma + Constantes.NUMBERS[cont];
				cont--;
			}
		} while (cont >= 0);

		System.out.println("suma: " + suma);

	}

	public static void pares1a100() {

		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");				
			}
		}
	}
	
	public static void deTresEnTres() {
		System.out.println();

		for(int i=1;i<100;i=i+3) {
			
				System.out.print(i+ " ");				
			
		}
	}

	public static void main(String[] args) {
		recorreArray();
		recorreArrayInverso();
		pares1a100();
		deTresEnTres();
	}

}
