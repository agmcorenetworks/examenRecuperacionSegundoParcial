package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Utilidades;

public class Parte1 {

	public void saludarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Constantes.INTRO);
		String nombre = sc.next();
		sc.close();
		System.out.println(Constantes.SALUDO + " " + nombre);
	}

	public void lanzarExcepcion(int numero) throws MenorQueException, MayorQueException {
		if (numero > 50)
			throw new MayorQueException("El numero es mayor que 50");
		else
			throw new MenorQueException("El numero es menor o igual que 50");
	}

	public void capturarExcepcion() {
		try {
			lanzarExcepcion(Utilidades.obtenerNumeroAleatorioEntreCeroY100());
		} catch (MayorQueException e) {
			System.out.println(e.getMessage());
		} catch (MenorQueException e) {
			System.out.println(e.getMessage());
		}
	}

	public String manejadorErrores(int numero) {
		switch (numero) {
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
		default:
			return Constantes.ERROR_DEFAULT;
		}
	}

}
