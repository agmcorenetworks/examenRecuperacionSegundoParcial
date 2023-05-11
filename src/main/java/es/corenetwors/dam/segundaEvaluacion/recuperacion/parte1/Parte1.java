package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utiles.Constantes;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utiles.Utilidades;

public class Parte1 {

	public void saludarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Constantes.INTRO);
		String nombre = sc.nextLine();
		System.out.println(Constantes.SALUDO + " " + nombre);
		sc.close();
	}


	public void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
		if (numero < 50)
			throw new MayorQueException("numero menor que 50");
		else
			throw new MenorQueException("numero mayor que 50");
	}

	

	public void capturarExcepcion() {

		int numeroAleatorio = Utilidades.obtenerNumeroAleatorioEntreCeroY100();
		try {
			lanzarExcepcion(numeroAleatorio);
		} catch (MayorQueException e) {
			System.out.println(e.getMessage());
		} catch (MenorQueException e) {
			System.out.println(e.getMessage());
		}
	}

	// switch
	public String manejadorErrores(int error) {
		String errorSalida = "";
		// condicional switch
		switch (error) {
		case 200:
			errorSalida = Constantes.CODE_200;
			break;
		case 301:
			errorSalida = Constantes.CODE_301;
			break;
		case 302:
			errorSalida = Constantes.CODE_302;
			break;
		case 400:
			errorSalida = Constantes.CODE_400;
			break;
		case 401:
			errorSalida = Constantes.CODE_401;
			break;
		case 404:
			errorSalida = Constantes.CODE_404;
			break;
		case 500:
			errorSalida = Constantes.CODE_500;
			break;
		case 503:
			errorSalida = Constantes.CODE_503;
			break;
		default:
			errorSalida = Constantes.ERROR_DEFAULT;
		}
		return errorSalida;

	}

}
