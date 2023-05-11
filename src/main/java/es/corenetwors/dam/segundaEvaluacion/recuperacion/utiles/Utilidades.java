package es.corenetwors.dam.segundaEvaluacion.recuperacion.utiles;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {

	
	public static int obtenerNumeroAleatorioEntreCeroY100() {
		return (int) (Math.floor(Math.random()*11));
	}
	
	public static double calculaArea(double radio) throws RadioNovalidoException {
		if (radio < 0 || radio > 100)
			throw new RadioNovalidoException("Excepcion!! el radio no es valido");
		return radio * Constantes.PI * Constantes.PI;
	}
	
	public static double calculaPerimetro(double radio) throws RadioNovalidoException {
		if (radio < 0 || radio > 100)
			throw new RadioNovalidoException("Excepcion!! el radio no es valido");
		return radio * Constantes.PI * 2;
	}
	
}
