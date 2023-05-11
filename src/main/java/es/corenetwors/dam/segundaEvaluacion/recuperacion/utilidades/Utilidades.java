package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {
	public int obtenerNumeroAleatorioEntreCeroY100() {
		return (int)Math.random()*101+0;
	}
	
	
	 public static double calculaArea(double radio) throws RadioNovalidoException {
	        if (radio <= 0 || radio > 100) {
	            throw new RadioNovalidoException("Radio no válido. Debe ser mayor que 0 y menor o igual a 100.");
	        }
	        return Constantes.PI * radio * radio;
	    }
	 
	 
	public static double calculaPerimetro(double radio) throws RadioNovalidoException {
        if (radio <= 0 || radio > 100) {
            throw new RadioNovalidoException("Radio no válido. Debe ser mayor que 0 y menor o igual a 100.");
        }
        return 2 * Constantes.PI * radio;
    }
}
