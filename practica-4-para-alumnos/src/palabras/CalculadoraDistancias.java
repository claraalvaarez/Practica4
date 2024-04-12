package palabras;

/**
 * La clase CalculadoraDistancias proporciona un método estático para calcular la distancia
 * de edición entre dos palabras utilizando el algoritmo de programación dinámica.
 */
public class CalculadoraDistancias {

    /**
     * Calcula la distancia de edición entre dos palabras.
     *
     * @param palabra1 La primera palabra.
     * @param palabra2 La segunda palabra.
     * @return La distancia de edición entre las dos palabras.
     */
    public static int calcularDistancia(String palabra1, String palabra2) {
        // Matriz para almacenar las distancias parciales.
        int[][] distancia = new int[palabra1.length() + 1][palabra2.length() + 1];

        // Llenar la primera fila y la primera columna.
        for (int i = 0; i <= palabra1.length(); i++) {
            distancia[i][0] = i;
        }
        for (int j = 0; j <= palabra2.length(); j++) {
            distancia[0][j] = j;
        }

        // Calcular la distancia de edición para las subcadenas restantes.
        for (int i = 1; i <= palabra1.length(); i++) {
            for (int j = 1; j <= palabra2.length(); j++) {
                // Si los caracteres son iguales, la distancia es igual a la diagonal.
                if (palabra1.charAt(i - 1) == palabra2.charAt(j - 1)) {
                    distancia[i][j] = distancia[i - 1][j - 1];
                } else {
                    // Si los caracteres son diferentes, considerar las operaciones de inserción,
                    // eliminación o reemplazo y tomar el mínimo.
                    distancia[i][j] = Math.min(distancia[i][j - 1] + 1, // Inserción
                            Math.min(distancia[i - 1][j] + 1, // Eliminación
                                    distancia[i - 1][j - 1] + 1)); // Reemplazo
                }
            }
        }

        // La última celda contiene la distancia de edición final.
        return distancia[palabra1.length()][palabra2.length()];
    }
}
