package examenud1recup;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ayuda;
		boolean pistas=false;
		boolean acertado=false;
		int intentosRealizados = 0;
		int intentosRestantes;
		
		System.out.println("Generando numero secreto...");
		
		int numeroSecreto = (int)(Math.random() * 25) + 1;  //Se generará el número secreto
		
		sc.nextLine();
		
		System.out.println("¿Cuántos intentos quieres realizar?");  //Se introduce por teclado y se guarda los intentos a realizar
		int intentos= sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("¿Quieres recibir ayuda? (S/N):");
		ayuda = sc.nextLine();
		
		
		if (ayuda.equalsIgnoreCase("S")) {
			pistas=true;
		}else if (ayuda.equalsIgnoreCase("N")) {
			pistas=false;
		}														//En un booleano de pistas guardamos si el usuario quiere recibir ayuda o no
		
		sc.nextLine();
		
		do {
			
			System.out.println("Introduce tu número (entre 1 y 25): ");
			int numero=sc.nextInt();										//Se guarda el numero que hemos introducido y se compara con el numero secreto
			
			if (numero==numeroSecreto) {
				System.out.println("¡Has acertado! El número secreto era "+numeroSecreto);
				System.out.println("Número total de intentos realizados: "+intentosRealizados);
				acertado=true;
				
			}else if (numero!=numeroSecreto) {
				System.out.println("No has acertado");
			}
			
			if (pistas==true) {
				if (numero > numeroSecreto) {
					System.out.println("Pista: el número secreto es menor.");
				}else if (numero < numeroSecreto) {
					System.out.println("Pista: el número secreto es mayor.");
				}
			}
			
			 intentosRestantes = intentos - intentosRealizados;
			
			System.out.println("Te quedan "+intentosRestantes+ " intentos");		//Se imprime los intentos restantes restando los intentos con los realizados
			
			intentosRealizados++;
			
			
		} while (acertado==false || intentosRestantes > 0);
	
	}
}
