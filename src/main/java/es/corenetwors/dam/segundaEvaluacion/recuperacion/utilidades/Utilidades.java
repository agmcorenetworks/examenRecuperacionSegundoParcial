package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNoValidoException;
import java.util.Random;

public class Utilidades {

    public static int obtenerNumeroAleatorioEntreCeroY100() {
        Random rand = new Random();
        return rand.nextInt(101);
    }

    public static double calculaArea(double radio) throws RadioNoValidoException {
        if (radio <= 0 || radio > 100) {
            throw new RadioNoValidoException("El radio no es válido, debe estar entre 0 y 100.");
        }
        return Constantes.PI * radio * radio;
    }

    public static double calculaPerimetro(double radio) throws RadioNoValidoException {
        if (radio <= 0 || radio > 100) {
            throw new RadioNoValidoException("El radio no es válido, debe estar entre 0 y 100.");
        }
        return 2 * Constantes.PI * radio;
    }
}
