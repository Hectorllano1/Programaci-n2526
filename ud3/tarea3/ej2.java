package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int tam;
		
		 System.out.println("Introduce cuantos numeros desea escribir: ");
		 tam= sc.nextInt();
		 
		 double [] numeros = new double[tam];
		 
		 for (int i=0; i<numeros.length; i++) {
			 System.out.println("Introduce numeros["+i+"]: ");
			 numeros[i]=sc.nextDouble();
		 }
		 
		 System.out.println("\nArray introducido: ");
		 for (int i=numeros.length-1;i>0;i--)
			 System.out.println(numeros[i]);
	}
}
