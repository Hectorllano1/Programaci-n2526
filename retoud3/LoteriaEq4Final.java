package ud3.reto;

import java.util.Arrays;
import java.util.Scanner;


//Excepción propia
class GordoException extends Exception {
	public GordoException (String mensaje) {
		super(mensaje);
	}
	//COMPLETAR-Héctor Llano
}

public class LoteriaEq4Final {	
	
	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
		
		int[] BomboNumeros= new int[numBolas]; //Creamos el array con el numero de bolas del sorteo
		for (int i = 0; i < numBolas; i++) {
			BomboNumeros[i] = i;
		}
		
		System.out.println("Bombo de numeros creado...");  //Imprimimos que se ha creado el bombo
		return BomboNumeros;
		
	}
	
	//devuelve un array de tamaño numPremios con todos los premios del sorteo
	public static String[] creaBomboPremios(int numPremios) {
		String[] bomboPremios = new String[numPremios];
		
		bomboPremios[0]="PRIMER PREMIO";  // gordo de navidad
		bomboPremios[1]="SEGUNDO PREMIO";	// un segundo premio
		
		//COMPLETAR-Héctor Llano/ Mario Cano
		
		// un tercer premio
		
		bomboPremios[2]="TERCER PREMIO";  //el tercer premio
		
		// dos cuartos premios
		
		int premio =3;
		
		for (int i = 0; i < 2; i++) {
			bomboPremios[premio] = "CUARTO PREMIO"; //Creamos el for para los 2 cuartos premios
			premio++;
		}
		
		// 8 quintos premios
		for (int i = 0; i <= 8; i++) {
			bomboPremios[premio] = "QUINTO PREMIO"; //Otro bucle for para los 8 quintos premios
			premio++;
		}

		// el resto hasta completar 1.807 premios son "pedrea"
		while (premio < numPremios) {
			bomboPremios[premio] ="Pedrea";
			premio++;
		}										//Utilizamos un bucle while para el resto de numeros premiados que seran pedreas
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		
		int premio = (int) (Math.random()*bombo.length);

		// si el número ya había salido, generamos otro al azar
		
		 while (bombo[premio] == -1) {
			premio = (int) (Math.random()*bombo.length);
		}
		
		 int numAgraciado = bombo[premio];
		 
		 bombo[premio] = -1;		//Genera un numero aleatorio
		 
		return numAgraciado;
		//COMPLETAR-Héctor Llano/ Mario Cano
		
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		
		//COMPLETAR-Héctor Llano/ Mario Cano
		  
	}
	
	//devuelve un premio al azar del bombo de premios
	//Si un premio ya ha salido, no debe volver a salir
	public static String damePremio(String[] bombo) {
		
		int premio2= (int) (Math.random()*bombo.length);
		
		// si el premio ya había salido, generamos otro al azar
		
		//COMPLETAR-Héctor Llano
		while (bombo[premio2].equals("Ya ha salido")) {
			premio2 = (int) (Math.random()*bombo.length); //Devuelve el premio del numero premiado y si ha salido ya lo marca
		}
		// marcamos el premio que ha salido 
		
		//COMPLETAR-Héctor Llano
 				
		String premio = bombo[premio2];
		
		bombo[premio2] = "Ya ha salido";
		
		return premio;
	}
	
	
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado"; //valor por defecto
			
		//COMPLETAR-Héctor Llano
		
		for (int i = 0; i < numerosSorteo.length; i++) {
			if (miDecimo.equals(numerosSorteo[i])) {
				return "Agraciado con:" + premiosSorteo[i]; //Comprueba si el premio esta agraciado
			}
		}
		return premio;
		
	}
	
	
	//Implementa un bucle para comprobar, haciendo uso del método heSidoAgraciado, si nuestro décimo tiene o no premio
	// Debe comprobar que se introducen exactamente 5 dígitos entre el 0 y el 9, por ejemplo 04544
	// Al introducir fin, finaliza la comprobación de décimos
	public static void compruebaDecimos(String[] numerosSorteo, String[] premiosSorteo) throws GordoException{
		Scanner sc=new Scanner(System.in);	
		String miDecimo;
		String miPremio="";
		boolean terminarDeComprobar=false;
		boolean numeroValido=false;
		
		System.out.println("\nCOMPROBACION DE DECIMOS:");
		
		//Compruebo si me ha tocado la lotería
		
		//COMPLETAR-Héctor Llano/Mario Cano
		System.out.println("\nIntroduce fin si desea terminar");
		
		while (!terminarDeComprobar) {
			System.out.println("Introduce tu decimo o 'fin' para terminar:");
			miDecimo=sc.nextLine();
			
			if (miDecimo.equalsIgnoreCase("fin")) {
				terminarDeComprobar = true;
				break;
			}
			
			if (miDecimo.length() == 5 && miDecimo.matches("\\d{5}")) {
				numeroValido = true;
			} else {
				numeroValido = false;
				System.out.println("Décimo invalido");
			}
			
			if (numeroValido) {
				miPremio = heSidoAgraciado(numerosSorteo, premiosSorteo, miDecimo);
				System.out.println(miPremio);
			}
		}
		
		
	}
				

	public static void main(String[] args) {
		
		final int MAX_NUMEROS=100000; // números del sorteo
		final int MAX_PREMIOS=1807;   // premios del sorteo
		
		int numeroAgraciado; //número que sale del bombo
		String premio=""; //premio que sale del bombo
		
				
		int[] bomboBolas = new int[MAX_NUMEROS];
		String[] bomboPremios = new String[MAX_PREMIOS];

		String[] listaNumerosSorteo = new String[MAX_PREMIOS]; // lista oficial de números que han salido en el sorteo
		String[] listaPremiosSorteo = new String[MAX_PREMIOS]; // lista oficial de premios que han salido en el sorteo
		
		try {
		
			//Creamos los bombos con sus bolas
			bomboBolas=creaBomboNumeros(MAX_NUMEROS);		
			bomboPremios=creaBomboPremios(MAX_PREMIOS);
			
			//Mostramos el listado completo de números premiados
			System.out.println("\nLISTADO OFICIAL DE PREMIOS:\n");
		
			int j=0;
			for (int i=0;i<MAX_PREMIOS;i++) {
				//Sacamos un número del bombo y lo rellenamos con ceros a la izquierda
				numeroAgraciado=dameNumero(bomboBolas);
				String numeroFormateado=String.format("%05d",numeroAgraciado);
			
				//Sacamos un premio del bombo
				premio=damePremio(bomboPremios);
				
				//Añado el número a la lista oficial del sorteo en la posición j
				listaNumerosSorteo[j]=numeroFormateado;
				
				//Añado el premio a la lista oficial del sorteo en la posición j
				//COMPLETAR-Mario Cano
				listaPremiosSorteo[j]=numeroFormateado;
				j++;
				
				System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
			}
		
			compruebaDecimos(listaNumerosSorteo, listaPremiosSorteo);
				
			
		} 	//COMPLETAR (capturar excepción propia)-Mario Cano
		catch (GordoException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
				System.out.println("Error:"+e.getMessage());
				} finally {
					System.out.println("\nSorteo finalizado");			
				}		
	}
}
