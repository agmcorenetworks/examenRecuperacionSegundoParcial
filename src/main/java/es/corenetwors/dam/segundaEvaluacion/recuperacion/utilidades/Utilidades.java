package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import java.util.Random;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.*;

public class Utilidades {
	
	public static int obtenerNumeroAleatorioEntreCeroY100 () {
		Random rand = new Random();
	    int numeroAleatorio = rand.nextInt(101); 
	    return numeroAleatorio;
	}
	
	public static double calculaArea (double radio) throws RadioNovalidoException {
		if (radio == 0 || radio > 100)
			throw new RadioNovalidoException ("El radio no es válido");
		else
			return radio*radio*Constantes.PI;
	}
	
	public static double calculaPerimetro (double radio) throws RadioNovalidoException {
		if (radio == 0 || radio > 100)
			throw new RadioNovalidoException ("El radio no es válido");
		else
			return 2*Constantes.PI*radio;
	}
	
}
