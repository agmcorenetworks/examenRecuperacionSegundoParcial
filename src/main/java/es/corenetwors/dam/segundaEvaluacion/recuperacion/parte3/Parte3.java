package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte3;

import java.util.Scanner;

import es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones.RadioNovalidoException;
import es.corenetwors.dam.segundaEvaluacion.recuperacion.utilidades.Utilidades;

public class Parte3 {

	Scanner sc = new Scanner(System.in);
	public double radio;	
	
	public double pedirRadio() {
		try {
			System.out.println("\n\n\n");
			System.out.println("Calculadora para Circulos");
			System.out.println("=========================");
			System.out.println("introduzca el radio:");
			this.radio = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println("radio no valido");
		}

		return radio;
	}

	public void muestraMenu() {
		System.out.println("\n\n\n");
		System.out.println("=============================================================================");
		System.out.println("                                     MENU                                    ");
		System.out.println("=============================================================================");

		System.out.println("Elija una opcion:");

		System.out.println("1 - Calcular Perimetro");
		System.out.println("2 - Calcular Area");

		System.out.println("3 - Salir");
		System.out.println("=============================================================================");
	}

	public int obtenerentrada() {
		int option = 0;
		try {
			option = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("entrda no valida");
		}

		System.out.println("Ha elegido " + option);
		return option;
	}



	public double procesarEntrada(int entrada, double radio) throws RadioNovalidoException {
		double salida = 0;
		
		switch(entrada) {
		case 1:
			salida = Utilidades.calculaPerimetro(radio);
			break;
		case 2:
			salida = Utilidades.calculaArea(radio);
			break;
		case 3:
			salida = -1;
			break;
		default:
			System.out.println("opcion no valida");
	}
		
		return salida;

	}

	public static void main(String[] args) {
		Parte3 p3 = new Parte3();
		double salida = 0;
		double radio;
		
		//cambiar el codigo añadiendo un bucle para que el programa termine cuando el usuario elija la opcion 3
		// para salir del bucle procesarEntrada debe devolver -1 (el usuario elige salir de la aplicacion) 
		
			
			int opcion;
			do {
				radio=p3.pedirRadio();
				p3.muestraMenu();
				
				opcion = p3.obtenerentrada();
				
				try {
					salida = p3.procesarEntrada(opcion, radio);
				} catch (RadioNovalidoException e) {
					System.out.println(e.getMessage());
				}
				if (salida != -1)
					System.out.println(salida);
			} while (opcion != 3);
			
		

	}
}
