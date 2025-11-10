package ud3.tarea1;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: " );
		int n = sc.nextInt();
		
		eco(n);
	}

	 static void eco(int n) {
		 for (int i = 0; i < n; i++) {
			 System.out.println("Eco");
			
		}
		
	}

}
