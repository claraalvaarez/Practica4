package aplicacion;
import palabras.*;
/**
 * La clase Principal proporciona un ejemplo de uso de la clase CalculadoraDistancias
 * para calcular la distancia de edición entre dos palabras.
 * Utiliza el algoritmo descrito por Dan Jurafsky en las diapositivas.
 * (https://web.stanford.edu/class/cs124/lec/med.pdf)
 * No se almacena la traza para transformar una palabra en otra.
 */
public class Principal {
    public static void main(String[] args) {
    /**
     * Cadena de caracteres s1 para ser utilizada en el cálculo de distancia.
     */
    String s1 = "abc";

    /**
     * Cadena de caracteres s2 para ser utilizada en el cálculo de distancia.
     */
    String s2 = "acc";

    /**
     * Método principal para demostrar el cálculo de distancia de edición entre s1 y s2.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */

        System.out.println("La distancia entre las palabras "+ s1 + " y " + s2 + " es " +
                CalculadoraDistancias.calcularDistancia(s1, s2));
    }
}





