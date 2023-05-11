package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import java.util.Random;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {

	public static int obtenerNumeroAleatorioEntreCeroY100() {

		Random rand = new Random();
		return rand.nextInt(101);

	}
	
	public static double calculaArea(double radio) throws RadioNovalidoException {
		double circulo = (Constantes.PI*radio*radio);
		
		if(radio==0 || radio>100) {
			throw new RadioNovalidoException("RadioNoValidoException");
		}
		else {
			return circulo;
		}
	}
	
	public static double calculaPerimetro(double radio) throws RadioNovalidoException {
		double circulo=(2*Constantes.PI*radio);
		
		if(radio==0 || radio>100) {
			throw new RadioNovalidoException("RadioNoValidoException");
		}
		else {
			return circulo;
		}
		
	}
	
//	public static void main(String[] args) {
//		System.out.println(obtenerNumeroAleatorioEntreCeroY100());
//		
//	}

}
