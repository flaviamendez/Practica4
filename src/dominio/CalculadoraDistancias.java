package dominio;

public class CalculadoraDistancias {
    /**
     * Calcula la distancia entre dos cadenas de texto con el algoritmo de distancia de edición.
     * La distancia de edición es el número mínimo de operaciones (insertar, borrar o cambiar un carácter)
     *
     * @param p1 la primera cadena de texto
     * @param p2 la segunda cadena de texto
     * @return la distancia de edición entre las dos cadenas de texto
     */
    public static int calcularDistancia(String p1, String p2) {
        if (p1.equals(p2)) {
            System.out.println("Las palabras son iguales.");
            return 0;
        }

        int[][] matrix = new int[p1.length() + 1][p2.length() + 1];

        for (int i = 1; i <= p1.length(); i++) {
            for (int j = 1; j <= p2.length(); j++) {
                int borrar = matrix[i - 1][j] + 1;
                int insertar = matrix[i][j - 1] + 1;
                int cambiar = matrix[i - 1][j - 1];
                if (p1.charAt(i - 1) != p2.charAt(j - 1)) {
                    cambiar += 2; 
                }
                matrix[i][j] = Math.min(Math.min(borrar, insertar), cambiar);
            }
        }
        return matrix[p1.length()][p2.length()];
    }
}