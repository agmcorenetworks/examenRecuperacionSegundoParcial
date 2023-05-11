package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Utilidades;

import java.util.Scanner;

public class Parte1 {

	 static void saludarUsuario() {
		 System.out.println(Constantes.INTRO);
		 Scanner sc = new Scanner(System.in);
		 System.out.println(Constantes.SALUDO);
	}
	 
	static void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
		 if (numero >= 50) {
			 throw new MayorQueException("El numero es mayor o igual a 50");
		 }
		 throw new MenorQueException("El numero es menor que 50");
	 }
	
	static void capturarExcepcion() {
		try {
			lanzarExcepcion(Utilidades.obtenerNumeroAleatorioEntreCeroY100());
		} catch (MayorQueException | MenorQueException e) {
            System.out.println(e.getMessage());
			}
	}
	
	static String manejadorErrores(int numError) {
		switch(numError) {
		case 200:
			return Constantes.CODE_200;
		case 301:
			return Constantes.CODE_301;
		case 302:
			return Constantes.CODE_302;
		case 400:
			return Constantes.CODE_401;
		case 404:
			return Constantes.CODE_404;
		case 500:
			return Constantes.CODE_503;		
		default:
			return Constantes.ERROR_DEFAULT;
		}
	}
	
	
}
