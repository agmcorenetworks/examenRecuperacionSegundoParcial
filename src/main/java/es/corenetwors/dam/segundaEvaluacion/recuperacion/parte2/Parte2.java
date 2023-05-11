package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {

	public static void recorreArray() {
		int numero = 0;
		int contador = 0;
		while (contador < Constantes.NUMBERS.length) {
			if (Constantes.NUMBERS[contador] > numero) {
				numero = Constantes.NUMBERS[contador];
			}
			contador++;
		}
		if ((numero%2)==0) {
			System.out.println("El mayor numero es: " + numero + " .Ademas, es par.");
		} else {
			System.out.println("El mayor numero es: " + numero);
		}
	}
	
	public static void recorreArrayInverso() {
		int suma = 0;
		int contador = Constantes.NUMBERS.length - 1;
		do {
			if ((Constantes.NUMBERS[contador]%2) != 0 ) {
				suma += Constantes.NUMBERS[contador];
			}
			contador --;
		} while (contador >= 0);
		System.out.println("La suma de los numeros en las posiciones impares del array es: " + suma);
	}
	
	public static void pares1a100() {
		int contador = 1;
		do {
			if ((contador%2) == 0 ) {
				System.out.println(contador);
			}
			contador++;
		} while (contador <= 100);
	}
	
	public static void deTresEnTres() {
		int control = 3;
		int contador = 1;
		do {
			if (control == 0) {
				control = 3;
			}
			if (control == 3) {
				System.out.println(contador);
			}
			control--;
			contador++;
		} while (contador <= 100); 			
	}
	
	public static void main(String[] args) {
		recorreArray();
		recorreArrayInverso();
		System.out.println("");
		System.out.println("Pares del 1 al 100");
		System.out.println("");
		pares1a100();
		System.out.println("");
		System.out.println("Numeros de tres en tres del 1 al 100");
		System.out.println("");
		deTresEnTres();
	}
	
}
