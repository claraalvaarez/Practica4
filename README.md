# Practica4

# Calculadora de Distancias

Este proyecto implementa una calculadora de distancias de edición en Java. La distancia de edición, también conocida como distancia de Levenshtein, es una medida de la similitud entre dos cadenas de caracteres, que se define como el número mínimo de operaciones necesarias para transformar una cadena en la otra. Este proyecto utiliza el algoritmo descrito por Dan Jurafsky en sus diapositivas (https://web.stanford.edu/class/cs124/lec/med.pdf).

## Uso

El uso principal de este proyecto es calcular la distancia de edición entre dos palabras. 

## Funcionamiento

La clase `CalculadoraDistancias` proporciona un método estático `calcularDistancia` que toma dos palabras como entrada y devuelve la distancia de edición entre ellas. El algoritmo utilizado es un enfoque de programación dinámica que llena una matriz con las distancias parciales y luego calcula la distancia total utilizando esta matriz.
