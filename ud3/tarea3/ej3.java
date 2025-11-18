package ud3.tarea3;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Introduce cuantos numeros desea escribir: ");
		int n = sc.nextInt();
		
		double [] numeros = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Introduce numeros positivos negativos o ceros y hare una media de cada uno["+(i + 1)+"]: ");
			numeros[i] = sc.nextDouble();
			
			int contadorPos =  0, contadorNeg = 0, contadorCeros = 0;
			double sumaPos = 0.0, sumaNeg = 0.0;
			
		}
		for (int i=0; i <n; i++) {
			if (numeros[i] > 0) {
				sumaPos += numeros[i];
				
			}	
		}
		
			
		
		
	
			
		
		
		
	}
}
