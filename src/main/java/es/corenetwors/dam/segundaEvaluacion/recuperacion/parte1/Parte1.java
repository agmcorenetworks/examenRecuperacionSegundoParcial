package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte1;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MayorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.MenorQueException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Constantes;

public class Parte1 {
	
    public static void saludarUsuario() {
        System.out.println(Constantes.INTRO);
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println(Constantes.SALUDO + " " + nombre);
    }
    
    public static void lanzarExcepcion(int numero) throws MayorQueException, MenorQueException {
        if (numero > 50) {
            throw new MayorQueException("El número es mayor que 50");
        } else if (numero < 50) {
            throw new MenorQueException("El número es menor que 50");
        }
    }
    
    public static void capturarExcepcion() {
        try {
            lanzarExcepcion(30);
        } catch (MayorQueException e) {
            System.out.println(e.getMessage());
        } catch (MenorQueException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String manejadorErrores(int numError) {
        String result = "";
        switch (numError) {
            case 200:
                result = Constantes.CODE_200;
                break;
            case 301:
                result = Constantes.CODE_301;
                break;
            case 302:
                result = Constantes.CODE_302;
                break;
            case 400:
                result = Constantes.CODE_400;
                break;
            case 401:
                result = Constantes.CODE_401;
                break;
            case 404:
                result = Constantes.CODE_404;
                break;
            case 500:
                result = Constantes.CODE_500;
                break;
            default:
                result = Constantes.ERROR_DEFAULT;
                break;
        }
        return result;
    }

}
