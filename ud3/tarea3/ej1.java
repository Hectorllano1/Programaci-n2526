package ud3.tarea3;

import java.util.Scanner;
import java.util.Arrays;

public class ej1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[5];
		
	    for (int i=0; i<5; i++) {
	    	System.out.println("Introduce numeros en posición " +i);
	    	numeros[i]=sc.nextDouble();
	    }
	    
	    for (int i=0; i<numeros.length; i++)
	    	System.out.println(numeros[i]);
	}	
	
}
