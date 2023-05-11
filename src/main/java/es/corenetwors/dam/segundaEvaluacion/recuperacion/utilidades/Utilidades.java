package es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades;


public class Utilidades {
    public static final double PI = 3.14159;

    public static int obtenerNumeroAleatorioEntreCeroY100() {
        return (int) (Math.random() * 101);
    }

    public static double calculaArea(double radio) {
        if (radio <= 0 || radio > 100) {
            throw new IllegalArgumentException("Radio no válido: " + radio);
        }
        return PI * radio * radio;
    }

    public static double calculaPerimetro(double radio) {
        if (radio <= 0 || radio > 100) {
            throw new IllegalArgumentException("Radio no válido: " + radio);
        }
        return 2 * PI * radio;
    }
}


