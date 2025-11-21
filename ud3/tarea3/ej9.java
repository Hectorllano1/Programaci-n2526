package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
		
		//Definir una función que tome como parámetros dos tablas, 
		//la primera con 6 números de una apuesta de la primitiva, 
		//y la segunda con los 6 números de la combinación ganadora. 
		//La función devolverá el número de aciertos.
		
		Scanner sc = new Scanner(System.in);
		int[] loteria = {2, 3, 4, 5, 6};
		int[] ganador = {3, 4, 6, 7, 8};
		int[] ultima = new int[5];
		
		comparacion(loteria, ganador, ultima);
		System.out.println(Arrays.toString(ultima));
	}

	static int[] comparacion(int[] loteria, int[] ganador, int[] ultima) {
		int k = 0;
		
		for(int i=0; i<loteria.length; i++) {
			
			for (int j = 0; j < ganador.length; j++) {
				if (loteria[i]==ganador[j]) {
					ultima[k]=loteria[i];
				}
			}k++;
		}
		
		
		
		return ultima;
		
		
	}
}
