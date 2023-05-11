package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import java.util.Random;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {

	public int obtenerNumeroAleatorioEntreCeroY100() {
		Random aleatorio = new Random();
		return aleatorio.nextInt(101);

	}

	public static double calculaArea(double radio) throws RadioNovalidoException {

		if (radio == 0 || radio > 100) {

			throw new RadioNovalidoException("No puede tener radio 0");

		} else {

			return (Constantes.PI * radio * radio);
		}
	}

	public static double caculaPerimetro(double radio) throws RadioNovalidoException {

		if (radio == 0 || radio > 100) {

			throw new RadioNovalidoException("No puede tener radio 0");

		} else {

			return (Constantes.PI * 2 * radio);
		}
	}
	
	
	
	
}
