package ud3.tarea1;

import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro número entero: ");
		int num2 = sc.nextInt();
		
		numeros(num1, num2);
		
	}

	static void numeros(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("El mayor es: " +num1);
		}else {
			System.out.println("El mayor es: " +num2);
		}
		
	}
}
