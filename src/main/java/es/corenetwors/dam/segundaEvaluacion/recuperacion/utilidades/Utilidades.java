package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;

import java.util.Random;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {
	
    public static int obtenerNumeroAleatorioEntreCeroY100() {
        Random r = new Random();
        return r.nextInt(101);
    }
    
    public static final double PI1 = 3.1416;

    public static double calculaArea(double radio) throws RadioNovalidoException {
        if (radio <= 0 || radio > 100) {
            throw new RadioNovalidoException("Radio no válido: " + radio);
        }
        return PI1 * radio * radio;
    }
    
    public static final double PI = 3.1416;

    public static double calculaPerimetro(double radio) throws RadioNovalidoException {
        if (radio == 0 || radio > 100) {
            throw new RadioNovalidoException("El radio debe ser mayor que 0 y menor o igual que 100");
        }

        return 2 * PI1 * radio;
    }

}
