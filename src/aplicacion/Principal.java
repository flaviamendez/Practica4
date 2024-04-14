package aplicacion;

import dominio.*;
import java.util.Scanner;

public class Principal {
    /**
     * Método principal que inicia la ejecución del programa.
     * Solicita al usuario dos palabras y calcula la distancia entre ellas.
     * Imprime el resultado por consola.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la  palabra1:");
        String p1 = scanner.nextLine();

        System.out.println("Introduce la palabra2:");
        String p2 = scanner.nextLine();

        int distancia = CalculadoraDistancias.calcularDistancia(p1, p2);

        System.out.println("La distancia entre " + p1 + " y " + p2 + " es " + distancia);
    }
}