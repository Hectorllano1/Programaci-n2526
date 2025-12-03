package examenud3;

import java.util.Scanner;

public class Ej2 {

	static void rellenaEncuesta(String[][] encuesta) {

		Scanner sc = new Scanner(System.in);
		int i = 0;

		while (i < encuesta.length) {
			System.out.print("Introduce código postal (o 'fin' para terminar): ");
			String codPostal = sc.nextLine();

			if (codPostal.equalsIgnoreCase("fin")) {
				break;
			}

			System.out.print("Introduce edad: ");
			String edad = sc.nextLine();

			System.out.print("Introduce sexo (M/F): ");
			String sexo = sc.nextLine();

			encuesta[i][0] = codPostal; 
			encuesta[i][1] = edad; 
			encuesta[i][2] = sexo;
			i++;
		}

	}
	
	static void muestraResultados(String[][] encuesta) {
		
		System.out.println("--- Resultados de la encuesta ---");
		
		for (int i = 0; i < encuesta.length; i++) {
			if (encuesta[i][0] != null) {
				System.out.println("Código Postal: " + encuesta[i][0] + ", Edad: " + encuesta[i][1] + ", Sexo: " + encuesta[i][2]);
			}
		}
	}
	
	static int calculaMediaEdad(String[][] encuesta, char sexo, int codigoPostal) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce código postal para calcular la media: ");
		codigoPostal=sc.nextInt();
		
		System.out.println("Introduce sexo (M/F): ");
		sexo=(char) sc.nextInt();
		
		int mediaEdad;
		
		for (int i = 0; i < encuesta.length; i++) {
			
		}
		
		return codigoPostal;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] encuesta = new String[500][4];
		char sexo = 0;
		int codigoPostal=0;
		
		rellenaEncuesta(encuesta);
		muestraResultados(encuesta);
		calculaMediaEdad(encuesta, sexo, codigoPostal);
		
	}
}
