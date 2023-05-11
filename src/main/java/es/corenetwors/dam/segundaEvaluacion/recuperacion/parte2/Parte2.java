package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte2 {
	public static void recorreArray(){
		int contador=0;
		int mayor=0;
		
		while( Constantes.NUMBERS.length>contador){
			if(Constantes.NUMBERS[contador]>mayor) {
				mayor =Constantes.NUMBERS[contador];
			}
			contador++;
		}
		
		System.out.println(mayor);
		if(mayor%2==0) {
			System.out.println(mayor + " es par.");
		}
	}
	public static void recorreArrayInverso() {
		int contador=Constantes.NUMBERS.length-1;
		int suma=0;
		do {
			if(Constantes.NUMBERS[contador]%2!=0) {
				suma+=Constantes.NUMBERS[contador];
			}
			contador--;
			
		}
		while(contador>=0); 
		System.out.println(suma);
	}
	
	public static void pares1a100() {
		int contador=1;
		do {
			if(contador%2==0) {
				System.out.println(contador);
			}
			contador++;
		}
		while(contador<=100);
	}
	public static void deTresenTres() {
		for (int i=1;i<=100;i+=3) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		deTresenTres();
	}
}
