package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;

import java.util.Scanner;

public class Parte1 {
	
    public void saludarUsuario() {
        System.out.println(Constantes.INTRO);

        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        System.out.println(Constantes.SALUDO + " " + nombre);
    }
    
    public void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
        if (numero > 50) {
            throw new MayorQueException("El número es mayor que 50");
        } else if (numero < 50) {
            throw new MenorQueException("El número es menor que 50");
        }
    }
    
    public void capturarExcepcion() {
        try {
            lanzarExcepcion(55); 
        } catch (MayorQueException e) {
            System.out.println(e.getMessage());
        } catch (MenorQueException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String manejadorErrores(int codigoError) {
        switch (codigoError) {
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
