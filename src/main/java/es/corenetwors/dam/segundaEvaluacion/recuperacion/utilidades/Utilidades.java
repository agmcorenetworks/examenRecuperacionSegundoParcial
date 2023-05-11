package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;
import java.util.Random;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;

public class Utilidades {

	// Método para obtener un número aleatorio entre cero y cien
	public static int obtenerNumeroAleatorioEntreCeroY100() {
        Random random = new Random();
        return random.nextInt(101);
    }
	
	// Método para calcular el área de un círculo dado su radio
	public static double calcularArea(double radio) throws RadioNovalidoException {
        if (radio <= 0 || radio > 100) {
            throw new RadioNovalidoException("El radio no es válido");
        }

        return Math.PI * radio * radio;
    }
	
	// Método para calcular el perímetro de un círculo dado su radio
	public static double calcularPerimetro(double radio) throws RadioNovalidoException {
        if (radio <= 0 || radio > 100) {
            throw new RadioNovalidoException("El radio no es válido");
        }

        return 2 * Math.PI * radio;
    }
}


