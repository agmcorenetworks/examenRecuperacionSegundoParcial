package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte3;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Utilidades;


public class Parte3 {
	public class Main {
	    public void main(String[] args) {
	        Parte3 p3 = new Parte3();
	        double salida = 0;
	        double radio;

	        while (true) {
	            radio = p3.pedirRadio();
	            p3.muestraMenu();

	            int opcion = p3.obtenerEntrada();

	            try {
	                salida = p3.procesarEntrada(opcion, radio);
	            } catch (RadioNovalidoException e) {
	                System.out.println(e.getMessage());
	            }

	            if (salida == -1) {
	                break;
	            }

	            System.out.println(salida);
	        }
	    }
	}

    private Scanner sc;
    private double radio;

    public Parte3() {
        sc = new Scanner(System.in);
    }

    public double pedirRadio() {
        try {
            System.out.println("\n\n\n");
            System.out.println("Calculadora para Círculos");
            System.out.println("=========================");
            System.out.println("Introduzca el radio:");
            this.radio = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Radio no válido");
        }

        return radio;
    }

    public void muestraMenu() {
        System.out.println("\n\n\n");
        System.out.println("=============================================================================");
        System.out.println("                                     MENU                                    ");
        System.out.println("=============================================================================");

        System.out.println("Elija una opción:");
        System.out.println("1 - Calcular Perímetro");
        System.out.println("2 - Calcular Área");
        System.out.println("3 - Salir");
        System.out.println("=============================================================================");
    }

    public int obtenerEntrada() {
        int option = 0;
        try {
            option = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Entrada no válida");
        }

        System.out.println("Ha elegido " + option);
        return option;
    }

    public double procesarEntrada(int entrada, double radio) throws RadioNovalidoException {
        double salida = 0;

        switch (entrada) {
            case 1:
                salida = Utilidades.calculaPerimetro(radio);
                break;
            case 2:
                salida = Utilidades.calculaArea(radio);
                break;
            case 3:
                salida = -1; // El usuario eligió salir de la aplicación
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        return salida;
    }

    public static void main(String[] args) {
        Parte3 p3 = new Parte3();
        double salida = 0;
        double radio;

        while (true) {
            radio = p3.pedirRadio();
            p3.muestraMenu();

            int opcion = p3.obtenerEntrada();

            try {
                salida = p3.procesarEntrada(opcion, radio);
            } catch (RadioNovalidoException e) {
                System.out.println(e.getMessage());
            }

            if (salida == -1) {
                break;
            }

            System.out.println(salida);
        }
    }
}
