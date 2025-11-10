package ejerciciosamorcito;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int num1 = sc.nextInt();
		System.out.println("Dime otro número: ");
		int num2 = sc.nextInt();
		System.out.println("Dime un ultimo número: ");
		int num3 = sc.nextInt();
		
		numeros(num1, num2, num3);
	}

	static void numeros(int num1, int num2, int num3) {
		if (num1 > num2) {
			numeros2(num1, num2, num3);
		}
		else {
			numeros3(num2, num3);
			
		}
		
	}
	
	static void numeros3(int num2, int num3) {
		if (num2 > num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
		
	}

	static void numeros2(int num1, int num2, int num3) {
		if (num1 > num3) {
			System.out.println(num1);
		}
		else {
			System.out.println(num3);
		}
	}
	
	}


