package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {
	
	public static int obtenerNumeroAleatorioEntreCeroY100() {
		return (int)Math.random()*101+0;
	}

	public static double calculaArea(double radio) throws RadioNovalidoException {
		double salida = 0;
		if (radio > 100 || radio <= 0) {
			throw new RadioNovalidoException("Radio no valido");
		} else {
			salida = Constantes.PI*radio*radio;
		}
		return salida;
	}
	
	public static double calculaPerimetro(double radio) throws RadioNovalidoException {
		double salida = 0;
		if (radio > 100 || radio <= 0) {
			throw new RadioNovalidoException("Radio no valido");
		} else {
			salida = 2*Constantes.PI*radio;
		}
		return salida;
	}
	
}
