package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {
	
	// Método 1
    public static void recorreArray() {
        int[] numbers = Constantes.NUMBERS;
        int mayor = numbers[0]; // Suponemos que el primer número del array es el mayor

        int i = 1; // Empezamos desde el segundo elemento del array
        while (i < numbers.length) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
            }
            i++;
        }

        System.out.println("El número mayor del array es: " + mayor);
        if (mayor % 2 == 0) {
            System.out.println("El número es par");
        }
    }
    
    // Método 2
    public static void recorreArrayInverso() {
        int[] numbers = Constantes.NUMBERS;
        int sumaImpares = 0;
        int i = numbers.length - 1; // Índice inicializado al final del array

        do {
            if (i % 2 != 0) { // Si la posición es impar
                sumaImpares += numbers[i];
            }
            i--;
        } while (i >= 0);

        System.out.println("La suma de los elementos en posiciones impares del array es: " + sumaImpares);
    }
    
    // Método 3
    public static void pares1a100() {
        int numero = 1;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 100);
    }
    
    // Método 4
    public static void deTresEnTres() {
        int numero = 1;

        while (numero <= 100) {
            System.out.println(numero);
            numero += 3;
        }
    }
}
