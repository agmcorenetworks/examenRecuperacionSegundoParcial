package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;
import java.util.Scanner;

public class Parte1 {
	
	//TODAS estas constantes no son necesarias hay que usar las de la clase Constantes. Para eso las hemos creado
    private static final String INTRO = "Bienvenido. Por favor, ingresa tu nombre:";
    private static final String SALUDO = "Hola, ";
    private static final String ERROR_DEFAULT = "Error desconocido";
    private static final String CODE_200 = "Código 200";
    private static final String CODE_301 = "Código 301";
    private static final String CODE_302 = "Código 302";
    private static final String CODE_400 = "Código 400";
    private static final String CODE_401 = "Código 401";
    private static final String CODE_404 = "Código 404";
    private static final String CODE_500 = "Código 500";

    public void saludarUsuario() {
        System.out.println(INTRO);
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println(SALUDO + nombre);
    }

    public void lanzarExcepcion(int numero) {
        try {
            if (numero > 50) {
                throw new MayorQueException("El número es mayor que 50");
            } else {
                throw new MenorQueException("El número es menor que 50");
            }
        } catch (MayorQueException e) {
            System.out.println(e.getMessage());
        } catch (MenorQueException e) {
            System.out.println(e.getMessage());
        }
    }

    public void capturarExcepcion() {
        lanzarExcepcion(60);
    }

    public String manejadorErrores(int numeroError) {
        String resultado;
        switch (numeroError) {
            case 200:
                resultado = CODE_200;
                break;
            case 301:
                resultado = CODE_301;
                break;
            case 302:
                resultado = CODE_302;
                break;
            case 400:
                resultado = CODE_400;
                break;
            case 401:
                resultado = CODE_401;
                break;
            case 404:
                resultado = CODE_404;
                break;
            case 500:
                resultado = CODE_500;
                break;
            default:
                resultado = ERROR_DEFAULT;
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Parte1 parte1 = new Parte1();
        parte1.saludarUsuario();
        parte1.capturarExcepcion();
        System.out.println(parte1.manejadorErrores(200));
        System.out.println(parte1.manejadorErrores(404));
        System.out.println(parte1.manejadorErrores(999));
    }

    
    class MayorQueException extends Exception {
        public MayorQueException(String mensaje) {
            super(mensaje);
        }
    }

    class MenorQueException extends Exception {
        public MenorQueException(String mensaje) {
            super(mensaje);
        }
    }
}
