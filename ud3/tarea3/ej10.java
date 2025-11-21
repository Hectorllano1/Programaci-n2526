package ud3.tarea3;

import java.util.Scanner;
import java.util.Arrays;

public class ej10 {

	public static void main(String[] args) {
		//Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional 
		//que debe rellenar de la siguiente forma: se leerá por teclado una serie de números, 
		//guardando en la tabla los pares hasta que esté llena, e ignorando los impares. 
		//La función tiene que devolver la cantidad de impares desechados.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud de tabla: ");
		int num = sc.nextInt();
		int[] pares = new int[5]; 
		int[] impares = new int[5];
	
		rellanaPares( pares, impares);
		System.out.println(Arrays.toString(impares));
	}

	static int rellanaPares(int[]pares, int[]impares ) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < pares.length; i++) {
			System.out.println("Introduce numeros: ");
			int num1 = sc.nextInt();
			if (num1 ) {
				
			} else {

			}
		}
		
		
		
		return 0;
		
		
	}
}
