package ud3.ejemplos;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase palabra a palabra: ");
		System.out.println("Primera palabra");
		String p1 = sc.next();
		System.out.println("Segunda palabra");
		String p2 = sc.next();
		System.out.println("Tercera palabra");
		String p3 = sc.next();
		
		
		do {
			System.out.println(p1+ " " +p2+ " " +p3);
		} while (!p1.equalsIgnoreCase("fin") && !p2.equalsIgnoreCase("fin") && !p3.equalsIgnoreCase("fin"));
		
		
	}
}
