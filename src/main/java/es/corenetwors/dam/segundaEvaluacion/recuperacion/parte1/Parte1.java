package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte1 {
	
	public void  saludarUsuario() {
		System.out.println(Constantes.INTRO);
		
		Scanner entradaUsuario = new Scanner(System.in);
		String nombre = entradaUsuario.nextLine();
		
		System.out.println(Constantes.SALUDO + " " + nombre );
	}
	
	public void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
		if(numero >= 50) {
			throw new MayorQueException("MayorQueException");
		}
		else {
			throw new MenorQueException("MenorQueException");
		}
	}
	
	public void capturarExcepcion() {
		try {
			lanzarExcepcion(20);
		} catch (MayorQueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MenorQueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String manejadorErrores(int error) {
		switch(error) {
		
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
//	public static void main(String[] args) {
//		
//	
//		Parte1 part = new Parte1();
//		part.saludarUsuario();
//	}

}
