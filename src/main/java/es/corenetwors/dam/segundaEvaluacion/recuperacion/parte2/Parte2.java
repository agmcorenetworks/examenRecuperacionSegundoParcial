package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {

	public static void recorreArray() {
		int i = 0;
		int numMayor = 0;
		while (i < Constantes.NUMBERS.length) {
			if (Constantes.NUMBERS[i] > numMayor) {
				numMayor = Constantes.NUMBERS[i];
			}
			i++;
		}
		
		if  (numMayor % 2 == 0) {
			System.out.println("El numero mayor es par: " + numMayor);
		}
		System.out.println("El numero mayor es: " + numMayor);
	}
	
	public static void recorreArrayInverso() {
		int i =Constantes.NUMBERS.length-1;
		int suma= 0;
		
		do {
			if(Constantes.NUMBERS[i]%2!=0) {
			suma+=Constantes.NUMBERS[i];
			}
			i--;

			}
			while(i>=0);
			System.out.println(suma);
		}
	
	public static void pares1a100() {
	
	    int num = 1;
	    do {
	       if (num % 2 == 0) {
	         System.out.println(num + " es un numero par");
	        }
	        num++;
	    } while (num <= 100);
	}
	
	public static void deTresEnTres() {
	    for (int i = 1; i <= 100; i += 3) {
	        System.out.println(i);
	    }
	}
}




