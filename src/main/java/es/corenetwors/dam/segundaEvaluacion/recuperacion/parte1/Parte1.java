package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte1 {

	public void saludarUsuario() {
		Scanner entrada = new Scanner(System.in);

		System.out.println(Constantes.INTRO);
		String nombre = entrada.nextLine();

		System.out.println(Constantes.SALUDO + " " + nombre);
	}

	public void lanzarException(int numero) throws MayorQueException, MenorQueException {

		if (numero >= 50) {
			throw new MayorQueException("Es mayor que 50");
		} else {
			throw new MenorQueException("Es menor que 50");
		}
	}

	public void capturarExcepcion() {

		try {
			lanzarException(20);
		} catch (MayorQueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MenorQueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String manejadorErrores(int error) {

		switch (error) {
		case 200:
			return Constantes.CODE_200;
	
		case 301:
			return Constantes.CODE_301;
			
		case 302:
			return Constantes.CODE_302;
			
		case 400:
			return Constantes.CODE_400;
			
		case 401:
			return Constantes.CODE_401;
			
		case 404:
			return Constantes.CODE_404;
			
		case 500:
			return Constantes.CODE_500;
			
		case 503:
			return Constantes.CODE_503;
			
		default:
			return Constantes.ERROR_DEFAULT;
		}

	}

	// Prueba del metodo
	public static void main(String[] args) {
		Parte1 p = new Parte1();

		p.saludarUsuario();
	}
}
