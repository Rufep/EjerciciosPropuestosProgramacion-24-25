package Tema2;

import java.util.Scanner;

/**
 * Crear un programa que solicite dos veces el password al usuario y 
 * muestre true si contiene los mismos caracteres.

 */
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		String password2;
		boolean correctPass;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu password: ");
		
		password = scan.nextLine();
		
		System.out.println("Introduce otra vez tu password: ");
		
		password2=scan.nextLine();
		
		correctPass = password.equals(password2);
		
		System.out.print("Password Correcto ? ? " + correctPass);
		
		
	}

}
