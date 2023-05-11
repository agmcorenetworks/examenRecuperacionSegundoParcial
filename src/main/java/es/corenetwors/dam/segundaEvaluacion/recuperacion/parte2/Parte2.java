package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {
	public static void recorreArray() {
	int [] array = Constantes.NUMBERS;
	int i = 0;
	int numeroMayor = array[0];

	while (i < array.length) {
	    int numero = array[i];
	    if (numero > numeroMayor) {
	        numeroMayor = numero;
	    }
	    i++;
	}
	
	System.out.println("El número mayor es: " + numeroMayor);
	if (numeroMayor % 2 == 0) {
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
        int num = 2;

        do {
            System.out.println(num);
            num += 2;
        } while (num <= 100);
    }

	
	public static void deTresEnTres() {
		int numero = 1;

        while (numero <= 100) {
            System.out.println(numero);
            numero += 3;
        }
	}
	

	
	public static void main(String[]args) {
		recorreArray();
		recorreArrayInverso();
		pares1a100();
		System.out.println("De tres en tres:");
		deTresEnTres();
	}

}
