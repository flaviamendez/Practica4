package aplicacion;

import dominio.*;
import java.util.Scanner;

public class Principal {
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