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
				
		  //en que posicion esta el caracter a en cada una de las palabras solo para tres palabras
				
				int indexChar_a1 = frase.split(" ")[0].indexOf("a");
				int indexChar_a2 = frase.split(" ")[1].indexOf("a");
				int indexChar_a3 = frase.split(" ")[2].indexOf("a");
				
				System.out.println("El caracter a esta en la posicion en la primera palabra : "  + indexChar_a1);
				System.out.println("El caracter a esta en la posicion en la segunda palabra : "  + indexChar_a2);
				System.out.println("El caracter a esta en la posicion en la tercera palabra : "  + indexChar_a3);

		//Cual es el primer caracter para cada una de estas palabras solo para tres palabras
				
				char charAt_a1 = frase.split(" ")[0].charAt(0);
				char charAt_a2 = frase.split(" ")[1].charAt(0);
				char charAt_a3 = frase.split(" ")[2].charAt(0);
				
				System.out.println("el primer caracter de la primera palabra es: " + charAt_a1);
				System.out.println("el primer caracter de la segunda palabra es: " + charAt_a2);
				System.out.println("el primer caracter de la segunda palabra es: " + charAt_a3);

		//cual es el ultimo caracter de cada una de estas palabras 	
				
				 charAt_a1 = frase.split(" ")[0].charAt(frase.split(" ")[0].length() - 1);
				 charAt_a2 = frase.split(" ")[1].charAt(frase.split(" ")[1].length() - 1);
				 charAt_a3 = frase.split(" ")[2].charAt(frase.split(" ")[2].length() - 1);
				
				 System.out.println("El caracter en la ultima posicion para la primera palabra es: " +charAt_a1);
				 System.out.println("El caracter en la ultima posicion para la segunda palabra es: " +charAt_a2);
				 System.out.println("El caracter en la ultima posicion para la tercera palabra es: " +charAt_a3);
	
		//solicitar al usuario una letra e indicar en que posicion esta
				 
				 System.out.println("Introduce una letra : ");
				 char introduceLetter;
				 introduceLetter = scan.next().charAt(0);
				 
				indexChar_a1 =frase.split(" ")[0].indexOf(introduceLetter);
				indexChar_a2 =frase.split(" ")[1].indexOf(introduceLetter);
				indexChar_a3 =frase.split(" ")[2].indexOf(introduceLetter);
				
		        System.out.println("La letra '" + introduceLetter + "' se encuentra en la primera palabra en la posición: " + indexChar_a1);
		        System.out.println("La letra '" + introduceLetter + "' se encuentra en la segunda palabra en la posición: " + indexChar_a2);
		        System.out.println("La letra '" + introduceLetter + "' se encuentra en la tercera palabra en la posición: " + indexChar_a3);

	}

}
