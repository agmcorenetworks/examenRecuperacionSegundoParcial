package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte1 {
	
	public void saludarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Constantes.INTRO);
		String nombre = sc.nextLine();
		System.out.println(Constantes.SALUDO+" " +nombre);
	}
	
	public void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
		if(numero >= 50) {
			throw new MayorQueException("El numero es mayor que 50");
		}else {
			throw new MenorQueException("El numero es menor que 50");
		}
	}
	
	public void capturarExcepcion() {
		try {
			lanzarExcepcion(15);
			} catch (MayorQueException e) {
				System.out.println(e.getMessage());
	        } catch (MenorQueException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	
	
	public String manejadorErrores(int numeroError) {
		String mensajeError;
		switch (numeroError) {
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
        case 503:
            mensajeError = Constantes.CODE_503;
            break;
        default:
            mensajeError = Constantes.ERROR_DEFAULT;
            break;
		}
		return mensajeError;
	}

	public static void main(String[] args) {
		Parte1 p1 = new Parte1();
		int numeroError = 404;
		String mensajeError = p1.manejadorErrores(numeroError);
		System.out.println(mensajeError);
	}
}
