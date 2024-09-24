package tema2;

import java.util.Scanner;

/**
 * Realizar un programa que solicite una dirección de correo e indique a 
 * qué dominio pertenece:gmail,outlook,yahoo...
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu direccion de Correo: ");
		email = scan.next();
		
		int arroba = email.indexOf("@"); //buscamos donde esta la arroba en la cadena
		String dominio = email.substring(arroba);//devolvemos la subcadena a partir del arroba con esta incuida
		System.out.println("Tu dominio es: " + dominio);
		
	}

}
