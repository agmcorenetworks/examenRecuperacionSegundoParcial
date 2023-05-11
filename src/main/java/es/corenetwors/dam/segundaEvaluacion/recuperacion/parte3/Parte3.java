package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte3;

import java.util.Scanner;

public class Parte3 {

    public double radio;
    Scanner sc = new Scanner(System.in);

    public double pedirRadio() {
        try {
            System.out.println("\n\n\n");
            System.out.println("Calculadora para Circulos");
            System.out.println("=========================");
            System.out.println("introduzca el radio:");
            this.radio = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("radio no valido");
            pedirRadio();
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
            System.out.println("entrada no valida");
            obtenerentrada();
        }

        System.out.println("Ha elegido " + option);
        return option;
    }

    public double procesarEntrada(int entrada, double radio) throws RadioNovalidoException {
        double salida = 0;

        switch (entrada) {
            case 1:
                salida = Utilidades.calcularPerimetro(radio);
                break;
            case 2:
                salida = Utilidades.calcularArea(radio);
                break;
            case 3:
                salida = -1;
                System.out.println("Saliendo de la aplicacion...");
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }

        return salida;

    }

    public static void main(String[] args) {
        Parte3 p3 = new Parte3();
        double salida = 0;
        double radio;

        int opcion;
        do {
            radio = p3.pedirRadio();
            p3.muestraMenu();
            opcion = p3.obtenerentrada();
            try {
                salida = p3.procesarEntrada(opcion, radio);
                if (salida == -1) break;
                System.out.println(salida);
                System.out.println("Presione Enter para continuar...");
                new Scanner(System.in).nextLine();
            } catch (RadioNovalidoException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 3);
    }

}

class Utilidades {

    public static final double PI = 3.1416;

    public static double calcularPerimetro(double radio) throws RadioNovalidoException {
        if (radio <= 0) {
            throw new RadioNovalidoException("Radio no válido: debe ser mayor que cero");
        }
        return 2 * PI * radio;
    }

    public static double calcularArea(double radio) throws RadioNovalidoException {
        if (radio <= 0) {
            throw new RadioNovalidoException("Radio no válido: debe ser mayor que cero");
        }
        return PI * Math.pow(radio, 2);
    }
}

class RadioNovalidoException extends Exception {
    public RadioNovalidoException(String message) {
        super(message);
    }
}
