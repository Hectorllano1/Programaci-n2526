package ud3.tarea1;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base: ");
		double h = sc.nextDouble();
		System.out.println("Introduce el radio: ");
		double r = sc.nextDouble();
		System.out.println("Menu de Opciones: ");
		System.out.println("1-Calcular área total");
		System.out.println("2-Calcular el volumen");
		System.out.println("Escoja una opción");
		int opcion = sc.nextInt();
		
	    calculos(h, r, opcion);
		
		System.out.println("El resultado es" +calculos(h, r, opcion));
	}

	static double calculos(double h, double r, int opcion) {
		
		double resultado = 0;
		
		switch (opcion) {
		case 1: resultado = 2 * 3.14 * r * (h + r);
			break;
		case 2: resultado = 3.14 * r * r * h;
			break;
		default:
			System.out.println("Escoja una opción correcta");
			break;
		}
		return resultado;
	}
}
