package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
/**
 * Crear un programa que lea una cadena y muestre la siguiente información:
 * 
 * 		Cuántas palabras componen la cadena.
 * 		
 * 		En qué posición está el caracter ‘a’ en cada una de estas palabras.(Suponer que estamos trabajando con 3 palabras)
 *		
 *		Cuál es el primer caracter de cada una de estas palabras
 * 
 * 		Cuál es el último caracter de cada una de estas palabras.
 * 
 * 		Solicitar al usuario una letra e indicar en qué posicion se encuentra.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		frase = scan.nextLine();
			//cuantas palabras componen la cadena
			
				int numWords = frase.split(" ").length;
				System.out.println("El numero de palabras de la frase es : " + numWords);
	}

}
