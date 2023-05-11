package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;
import java.util.Random;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {

	public static int obtenerNumeroAleatorioEntreCeroY100() {
		Random num_aleatorio = new Random();
		int numero = num_aleatorio.nextInt(101);
		return numero;
	}
	
	 public static double calculaArea(double radio) throws RadioNovalidoException {
		double areaCirculo = Constantes.PI * radio * radio;
		if (radio > 100 || radio== 0) {
			throw new RadioNovalidoException("El radio no esta entre el 0 y el 100");
		}
		return areaCirculo;
	}
	
	 public static double calculaPerimetro(double radio) throws RadioNovalidoException {
		double perimetroCirculo = 2 * Constantes.PI * radio;
		if (radio > 100 || radio== 0) {
			throw new RadioNovalidoException("El radio no esta entre el 0 y el 100");
		}
		return perimetroCirculo;
	}
}
