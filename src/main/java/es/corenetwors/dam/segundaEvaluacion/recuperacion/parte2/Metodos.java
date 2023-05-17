package es.corenetwors.dam.segundaEvaluacion.recuperacion.parte2;

public class Metodos {
	
	//este array te lo has sacado de la manga, hay que usar el de las constantes
    private static final int[] array = {5, 10, 20, 15, 25, 30};

    //usa el array que no es
    public static void recorreArray() {
        int mayor = Integer.MIN_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
            i++;
        }
        System.out.println("El número mayor del array es: " + mayor);
        if (mayor % 2 == 0) {
            System.out.println("El número es par");
        }
    }

  //usa el array que no es
    public static void recorreArrayInverso() {
        int suma = 0;
        int i = array.length - 1;
        do {
            if (i % 2 != 0) {
                suma += array[i];
            }
            i--;
        } while (i >= 0);
        System.out.println("La suma de los elementos en posiciones impares del array es: " + suma);
    }

    public static void pares1a100() {
        int num = 2;
        do {
            System.out.println(num);
            num += 2;
        } while (num <= 100);
    }

    public static void deTresEnTres() {
        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num += 3;
        }
    }

    public static void main(String[] args) {
        recorreArray();
        recorreArrayInverso();
        pares1a100();
        deTresEnTres();
    }
}

