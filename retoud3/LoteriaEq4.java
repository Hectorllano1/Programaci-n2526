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

public class LoteriaEq4 {	
	
	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
		
		int[] BomboNumeros= new int[99999];
		return BomboNumeros;
		
		//COMPLETAR-Héctor Llano
		
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
			bomboPremios[premio] = "CUARTO PREMIO";
			premio++;
		}
		
		// 8 quintos premios
		for (int i = 0; i <= 8; i++) {
			bomboPremios[premio] = "QUINTO PREMIO";
			premio++;
		}

		// el resto hasta completar 1.807 premios son "pedrea"
		for (int i = 0; i < bomboPremios.length; i++) {
			bomboPremios[premio] ="Pedrea";
			premio++;
		}
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		
		int numAgraciado = (int) (Math.random()*bombo.length);

		// si el número ya había salido, generamos otro al azar
		
		 while (numAgraciado==numAgraciado-1) {
			 numAgraciado = (int) (Math.random()*bombo.length);
		}
		
		//COMPLETAR-Héctor Llano
		
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		return bombo[numAgraciado]=-1;
		
		//COMPLETAR-Héctor Llano
	}
	
	//devuelve un premio al azar del bombo de premios
	//Si un premio ya ha salido, no debe volver a salir
	public static String damePremio(String[] bombo) {
		
		String premio;
		
		int indicePremiado = (int) (Math.random()*bombo.length);

		// si el premio ya había salido, generamos otro al azar
		
		//COMPLETAR-Héctor Llano
		while (indicePremiado==indicePremiado-1) {
			indicePremiado = (int) (Math.random()*bombo.length);
		}
		
		
		// marcamos el premio que ha salido 
		
		//COMPLETAR-Héctor Llano
 				
		return bombo[indicePremiado]="Ya ha salido";
	}
	
	
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado"; //valor por defecto
			
		//COMPLETAR-Héctor Llano
		
		while (miDecimo==numerosSorteo.toString()) {
			System.out.println("Agraciado con:" +premiosSorteo);
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
		//COMPLETAR
		
		
		
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
				//COMPLETAR
				
				j++;
				
				System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
			}
		
			compruebaDecimos(listaNumerosSorteo, listaPremiosSorteo);
				
			
		} 	//COMPLETAR (capturar excepción propia)
		
		catch (Exception e) {
				System.out.println("Error:"+e.getMessage());
				} finally {
					System.out.println("\nSorteo finalizado");			
				}		
	}
}
