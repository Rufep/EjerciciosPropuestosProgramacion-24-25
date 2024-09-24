package tema2;

import java.util.Scanner;

public class Ejercicio5 {
/**
 *     5. Programa que calcula la letra del DNI según las siguientes instrucciones:
 *     
 *      a. Tomamos el número completo de hasta 8 cifras de nuestro DNI,
 *         lo dividimos entre 23 y nos quedamos con el resto de dicha división.
 *         
 *      b. El resultado anterior es un número entre 0 y 22. A cada
 *         uno de estos posibles números le corresponde una letra, según 
 *         la siguiente tabla:
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dninum,resto;
		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
				'J','Z','S','Q','V','H','L','C','K','E'};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu numero de Dni: ");
		dninum = scan.nextInt();
		resto = dninum%23;
		char letra = letras[resto];
		System.out.println("Su letra es : " + letra);
	}

}
