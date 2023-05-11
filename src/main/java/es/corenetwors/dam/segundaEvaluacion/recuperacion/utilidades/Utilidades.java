package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {
	//Metodo que devuelve un numero entre 0 y 100
	static public int obtenerNumeroAleatorioEntreCeroY100() {
		return (int)(Math.random()*101+0);		
	}
	
	//Metodo que calcula el area
	static public double calculaArea(double radio) throws RadioNovalidoException{
		if(radio>100 || radio<0) {
			throw new RadioNovalidoException("El radio es mayor 100 o menor de 0");
		}
		else {
			return Constantes.PI*(radio*radio);		
		}
	}
	//Metodo que calcula el perimetro
	static public double calculaPerimetro(double radio) throws RadioNovalidoException {
		if(radio>100 || radio<0) {
			throw new RadioNovalidoException("El radio es mayor 100 o menor de 0");
		}
		else {
			return 2*Constantes.PI*radio;		
		}
	}
/**public static void main(String[] args) throws RadioNovalidoException {
	System.out.println(calculaArea(10));
}**/
}
