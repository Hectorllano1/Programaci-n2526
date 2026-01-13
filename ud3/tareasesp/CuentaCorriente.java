package tarea1.actividad1;

import java.util.Scanner;

public class CuentaCorriente {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int saldo;
	private static int limiteDesc;
	private static String nombre;
	private static String DNI;
	public boolean sacado;
	public int dinero;
	
	public static void crearCuenta(){
		
		System.out.println("Introduce tu nombre ");
		nombre=sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Introduce tu DNI ");
		DNI=sc.nextLine();
		
		sc.nextLine();
		
		if (DNI.length() > 9) {
			System.out.println("Formato de DNI incorrecto, introduzcalo de nuevo: ");
			DNI=sc.nextLine();
		}
		
		saldo=0;
		
		limiteDesc=-50;
	}
	
	public static void sacarDinero() {
		
		
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getLimiteDesc() {
		return limiteDesc;
	}

	public void setLimiteDesc(int limiteDesc) {
		this.limiteDesc = limiteDesc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
}
