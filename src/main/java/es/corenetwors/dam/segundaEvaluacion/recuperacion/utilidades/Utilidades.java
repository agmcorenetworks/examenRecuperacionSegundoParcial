package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {

	// método para generar un número aleatorio.

	public static int obtenerNumeroAleatorioEntreCeroY100() {
		return (int) (Math.random() * 101);
	}

	//método pa calcular el área de un círculo
	
	public static double calculaArea(double radio) throws RadioNovalidoException {
	    if (radio <= 0 || radio > 100) {
	        throw new RadioNovalidoException("Radio no válido");
	    }
	    return Math.PI * radio * radio;
	}

	//método para caltular el perímetro
	
	public static double calculaPerimetro(double radio) throws RadioNovalidoException {
	    if (radio <= 0 || radio > 100) {
	        throw new RadioNovalidoException("Radio no válido");
	    }
	    return 2 * Math.PI * radio;
	}

	
}
