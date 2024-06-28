/*El programa pedirá al usuario que ingrese un número entero positivo.
Luego, el programa imprimirá todos los números desde 1 hasta el número ingresado,
indicando si cada número es par o impar.*/

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validar que el número sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            // Iterar desde 1 hasta el número ingresado
            for (int i = 1; i <= numero; i++) {
                // Verificar si el número es par o impar
                if (i % 2 == 0) {
                    System.out.println(i + " es par");
                } else {
                    System.out.println(i + " es impar");
                }
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}

