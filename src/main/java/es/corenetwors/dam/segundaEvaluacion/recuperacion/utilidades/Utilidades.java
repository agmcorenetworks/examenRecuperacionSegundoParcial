package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import java.util.Random;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {
	
	public static int obtenerNumeroAleatorioEntreCeroY100() {
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(101);
		return numeroAleatorio;
	}
	
	public static double calculaArea(double radio) throws RadioNovalidoException {
		if(radio == 0 || radio > 100) {
			throw new RadioNovalidoException("El radio es 0 o mayor que 100");
		}else {
			 return Constantes.PI*radio*radio;
		}
	}
	
	public static double calculaPerimetro(double radio) throws RadioNovalidoException{
		if(radio == 0 || radio > 100) {
			throw new RadioNovalidoException("El radio es 0 o mayor que 100");
		}else {
			 return 2*Constantes.PI*radio;
		}
	}

}
