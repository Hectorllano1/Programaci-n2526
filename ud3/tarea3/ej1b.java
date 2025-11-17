package ud3.tarea3;

import java.util.Scanner;
import java.util.Arrays;

public class ej1b {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nombres = new String[5];
		
	    for (int i=0; i<5; i++) {
	    	System.out.println("Introduce nombres en posición " +i);
	    	nombres[i]=sc.next();
	    }
	    
	    for (int i=0; i<nombres.length; i++)
	    	System.out.println(nombres[i]);
	}	
	
}
