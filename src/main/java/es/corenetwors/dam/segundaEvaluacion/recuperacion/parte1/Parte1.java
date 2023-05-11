package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte1 {
	
	public static void saludarUsuario() {
		System.out.println(Constantes.INTRO);
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Por favor, introduce tu nombre: ");
	    String nombre = scanner.nextLine();
	    System.out.printf(Constantes.SALUDO, nombre);
	    }
	
	public static void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
        if (numero >= 50) {
            throw new MayorQueException("El número " + numero + " es mayor o igual que 50");
        } else if (numero < 50) {
            throw new MenorQueException("El número " + numero + " es menor que 50");
        }
    }
	
	public static void capturarExcepcion() {
        try {
            lanzarExcepcion(20);
        } catch (MayorQueException | MenorQueException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public static String manejadorErrores(int codigoError) {
	    String mensajeError;
	    switch (codigoError) {
	        case 200:
	            mensajeError = Constantes.CODE_200;
	            break;
	        case 301:
	            mensajeError = Constantes.CODE_301;
	            break;
	        case 302:
	            mensajeError = Constantes.CODE_302;
	            break;
	        case 400:
	            mensajeError = Constantes.CODE_400;
	            break;
	        case 401:
	            mensajeError = Constantes.CODE_401;
	            break;
	        case 404:
	            mensajeError = Constantes.CODE_404;
	            break;
	        case 500:
	            mensajeError = Constantes.CODE_500;
	            break;
	        default:
	            mensajeError = Constantes.ERROR_DEFAULT;
	            break;
	    }
	    return mensajeError;
	}
	
}

