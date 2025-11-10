package ud3.tarea1;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 =  sc.nextInt();
		
		numeros(num1, num2);
		
		
		
	}

	static void numeros(int num1, int num2) {
		for (int i = num1; i < num2; i++) {
			System.out.println(i);
			
		}
		
	}

}
