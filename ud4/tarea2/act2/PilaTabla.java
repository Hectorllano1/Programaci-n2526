package tarea2.act2;

import java.util.Arrays;

public class PilaTabla {

    public int[] pila = new int[10];
    public int elementosPila = 0;

    // Añade un elemento a la pila
    public void apilar(int valor) {
        if (elementosPila < pila.length) {
            pila[elementosPila] = valor;
            elementosPila++;
        } else {
            System.out.println("La pila está llena");
        }
    }

    // Quita el último elemento añadido
    public void desapilar() {
        if (elementosPila > 0) {
            elementosPila--;
        } else {
            System.out.println("La pila está vacía");
        }
    }

    // Muestra el último elemento añadido (la cima)
    public void cima() {
        if (elementosPila > 0) {
            System.out.println("La cima es: " + pila[elementosPila - 1]);
        } else {
            System.out.println("La pila está vacía");
        }
    }

    // Opcional: mostrar el contenido de la pila
    public void mostrarPila() {
        System.out.println("Pila: " + Arrays.toString(
                Arrays.copyOf(pila, elementosPila)
        ));
    }
}