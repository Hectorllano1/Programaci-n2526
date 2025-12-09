package examenud1recup;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double SUELDOBASE = 1200;
		String estadoCivil;
		int diasViaje = 0;
		double irpf = 0;
		int dietasDiasViaje = 0;
		double sueldoNeto = 0;
		double sueldoBruto = 0;
		
		System.out.println("Introduce tu cargo de empleado: ");
		System.out.println("Tester");
		System.out.println("Programador");
		System.out.println("Analista");
		String opciones= sc.nextLine();
		
		//Imprimimos un menu de opciones de cargo que lea nuestro cargo con una variable opciones
		//De la variable opciones hacemos un switch
		
		switch (opciones) {
		case "Tester":
			
			System.out.println("Introduce los días de viaje visitando clientes (máx. 20): ");
			diasViaje=sc.nextInt();
			
				
			while ((diasViaje > 20 || diasViaje <= 0) ) {
				
				System.out.println("Error: los días de viaje deben estar entre 0 y 20.");  //Hacemos un while donde los dias de viaje deben estar entre 0 y 20
				
				System.out.println("Introduce los días de viaje visitando clientes (máx. 20):");
				diasViaje=sc.nextInt();
				
			}
			
			sc.nextLine();
			
			System.out.println("Introduce el estado civil (S - Soltero, C - Casado):");
			estadoCivil=sc.nextLine();
			
			
			sc.nextLine();
			
			 while (estadoCivil!="S" || estadoCivil!="C") {   //Si el estado civil no es válido nos lo pedíra de nuevo
				 
				 System.out.println("Introduzca un valor valido: ");
				estadoCivil=sc.nextLine();
				
				if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")) {
					break;
				}
			 }
			
			
			dietasDiasViaje = diasViaje * 30;
			
			sueldoBruto = SUELDOBASE + dietasDiasViaje;
			
			if (estadoCivil.equalsIgnoreCase("S")) {
	
				irpf = (sueldoBruto * 25) / 100;
				
			}else if (estadoCivil.equalsIgnoreCase("C")) {
				
				irpf = (sueldoBruto * 20) / 100;
			}															//Hacemos el irpf que depende del estado civil
			
			sueldoNeto = sueldoBruto - irpf;
			
			System.out.println("--- NÓMINA DEL EMPLEADO ---");
			System.out.println("Cargo: " +opciones);
			System.out.println("Sueldo base: " +SUELDOBASE+ " euros");
			System.out.println("Dietas: "+ "("+diasViaje+"):"+dietasDiasViaje+ " euros");
			System.out.println("Sueldo Bruto: "+sueldoBruto);
			System.out.println("Retención IRPF: " +"-"+irpf);
			System.out.println("Sueldo neto: " +sueldoNeto);
			
			break;
			
		case "Programador":
			
			
			System.out.println("Introduce los días de viaje visitando clientes (máx. 20): ");
			diasViaje=sc.nextInt();
			
				
			while ((diasViaje > 20 || diasViaje <= 0) ) {
				
				System.out.println("Error: los días de viaje deben estar entre 0 y 20.");
				
				System.out.println("Introduce los días de viaje visitando clientes (máx. 20):");
				diasViaje=sc.nextInt();
				
			}
			
			sc.nextLine();
			
			System.out.println("Introduce el estado civil (S - Soltero, C - Casado):");
			estadoCivil=sc.nextLine();
			
			
			sc.nextLine();
			
			 while (estadoCivil!="S" || estadoCivil!="C") {
				 
				 System.out.println("Introduzca un valor valido: ");
				estadoCivil=sc.nextLine();
				
				if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")) {
					break;
				}
			 }
			
			
			dietasDiasViaje = diasViaje * 30;
			
			sueldoBruto = (SUELDOBASE + 300) + dietasDiasViaje;
			
			if (estadoCivil.equalsIgnoreCase("S")) {
	
				irpf = (sueldoBruto * 25) / 100;
			}else if (estadoCivil.equalsIgnoreCase("C")) {
				
				irpf = (sueldoBruto * 20) / 100;
			}
			
			sueldoNeto = sueldoBruto - irpf;
			
			System.out.println("--- NÓMINA DEL EMPLEADO ---");
			System.out.println("Cargo: " +opciones);
			System.out.println("Sueldo base: " +(SUELDOBASE+ 300)+ " euros");
			System.out.println("Dietas: "+ "("+diasViaje+"):"+dietasDiasViaje+ " euros");
			System.out.println("Sueldo Bruto: "+sueldoBruto);
			System.out.println("Retención IRPF: " +"-"+irpf);
			System.out.println("Sueldo neto: " +sueldoNeto);
			
			break;
			
		case "Analista":
			
			System.out.println("Introduce los días de viaje visitando clientes (máx. 20): ");
			diasViaje=sc.nextInt();
			
				
			while ((diasViaje > 20 || diasViaje <= 0) ) {
				
				System.out.println("Error: los días de viaje deben estar entre 0 y 20.");
				
				System.out.println("Introduce los días de viaje visitando clientes (máx. 20):");
				diasViaje=sc.nextInt();
				
			}
			
			sc.nextLine();
			
			System.out.println("Introduce el estado civil (S - Soltero, C - Casado):");
			estadoCivil=sc.nextLine();
			
			
			sc.nextLine();
			
			 while (estadoCivil!="S" || estadoCivil!="C") {
				 
				 System.out.println("Introduzca un valor valido: ");
				estadoCivil=sc.nextLine();
				
				if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")) {
					break;
				}
			 }
			
			
			dietasDiasViaje = diasViaje * 30;
			
			sueldoBruto = (SUELDOBASE * 2) + dietasDiasViaje;
			
			if (estadoCivil.equalsIgnoreCase("S")) {
	
				irpf = (sueldoBruto * 25) / 100;
			}else if (estadoCivil.equalsIgnoreCase("C")) {
				
				irpf = (sueldoBruto * 20) / 100;
			}
			
			sueldoNeto = sueldoBruto - irpf;
			
			System.out.println("--- NÓMINA DEL EMPLEADO ---");
			System.out.println("Cargo: " +opciones);
			System.out.println("Sueldo base: " +(SUELDOBASE * 2)+" euros");
			System.out.println("Dietas: "+ "("+diasViaje+"):"+dietasDiasViaje+ " euros");
			System.out.println("Sueldo Bruto: "+sueldoBruto);
			System.out.println("Retención IRPF: " +"-"+irpf);
			System.out.println("Sueldo neto: " +sueldoNeto);
			
			break;

		default:
			System.out.println("Error, introduzca un cargo válido");
			break;
		}
		
		
		
		
	}
}
