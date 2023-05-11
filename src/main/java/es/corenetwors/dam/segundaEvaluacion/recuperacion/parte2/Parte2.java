package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import java.util.Random;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {
	
	public static int recorreArray() {
		int i=0;
		int max = 0;
		while(i < Constantes.NUMBERS.length) {
			
			
			if (Constantes.NUMBERS[i] > max) {
	            max = Constantes.NUMBERS[i];
	        }
	        i++;
			
		}
		System.out.println("El número mayor del array es: " + max);
	    if (max % 2 == 0) {
	        System.out.println("El número es par");
	    }
	    
	    return max;
	}
	
	public static int recorreArrayInverso() {
		
		int sumaDeNumerosImpares = 0;
		int numero = Constantes.NUMBERS.length-1;
		
		do {
			if (Constantes.NUMBERS[numero] % 2 != 0) { 
	            sumaDeNumerosImpares += Constantes.NUMBERS[numero];
	            System.out.println(Constantes.NUMBERS[numero]);
			}
			numero--;
		} while(numero >=0);
		
		return sumaDeNumerosImpares;
		
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
	  
	
//	public static void main(String[] args) {
//		System.out.println(recorreArrayInverso());
//	}

}
