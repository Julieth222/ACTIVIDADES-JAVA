import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        // Verificar si la cadena es un palíndromo
        if (esPalindromo(texto)) {
            System.out.println("La cadena ingresada es un palíndromo.");
        } else {
            System.out.println("La cadena ingresada no es un palíndromo.");
        }

        // Cerrar el escáner
        scanner.close();
    }

    // Método que verifica si una cadena de texto es un palíndromo
    private static boolean esPalindromo(String texto) {
        // Convertir la cadena a minúsculas y eliminar caracteres no alfanuméricos
        String textoFiltrado = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Obtener el reverso de la cadena filtrada
        String textoReverso = new StringBuilder(textoFiltrado).reverse().toString();

        // Comparar la cadena filtrada con su reverso
        return textoFiltrado.equals(textoReverso);
    }
}

