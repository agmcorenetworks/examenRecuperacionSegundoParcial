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
		String input = sc.nextLine();
		System.out.println(Constantes.SALUDO + " " + input);
	}
	
	public void lanzarExcepcion(int num) throws MayorQueException, MenorQueException {
		if (num >= 50) {
			throw new MayorQueException("El numero es mayor que 50");
		} else if (num < 50) {
			throw new MenorQueException("El numero es menor que 50");
		}
	}
	
	public void capturarExcepcion() {
		try {
			lanzarExcepcion(Utilidades.obtenerNumeroAleatorioEntreCeroY100());
		} catch (MayorQueException e) {
			System.out.println(e);
		} catch (MenorQueException e) {
			System.out.println(e);
		}
	}
	
	public String manejadorErrores(int num) {
		switch (num) {
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
	
	public static void main(String[] args) {
		Parte1 p1 = new Parte1();
		System.out.println(p1.manejadorErrores(301));
		p1.saludarUsuario();
	}
	
}
