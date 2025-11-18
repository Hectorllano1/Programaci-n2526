package ud3.tarea3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Introduce la longitud de la clave secreta: ");
        int n = sc.nextInt();

        int[] clave = new int[n];

        // Generar la clave secreta con dígitos del 1 al 5
        for (int i = 0; i < n; i++) {
            clave[i] = rand.nextInt(5) + 1;  // números del 1 al 5
        }

        int[] intento = new int[n];
        boolean acertado = false;

        System.out.println("\n*** La clave secreta ha sido generada. Intenta abrir la cámara. ***");

        while (!acertado) {
            System.out.println("\nIntroduce tu combinación de " + n + " números (del 1 al 5):");

            for (int i = 0; i < n; i++) {
                intento[i] = sc.nextInt();
            }

            // Comprobar si se ha acertado
            acertado = true;

            System.out.println("Pistas:");

            for (int i = 0; i < n; i++) {
                if (intento[i] < clave[i]) {
                    System.out.println("Dígito " + (i + 1) + ": Mayor");
                    acertado = false;
                } else if (intento[i] > clave[i]) {
                    System.out.println("Dígito " + (i + 1) + ": Menor");
                    acertado = false;
                } else {
                    System.out.println("Dígito " + (i + 1) + ": Igual");
                }
            }
        }

        System.out.println("\n¡Felicidades! Has abierto la cámara secreta.");
        System.out.println("La clave era: " + Arrays.toString(clave));

        sc.close();
    }
}
