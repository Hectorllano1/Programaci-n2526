package ud3.ejemplos;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		String p = sc.next();
		
		System.out.println("Introduce otra palabra");
		String p2 = sc.next();
		
		if(p.length() > p2.length()) {
			System.out.println(p);
		}else if(p.length() < p2.length()) {
			System.out.println(p2);
		}
	}
}
