package tema2;

import java.util.Scanner;

public class Ejercicio2 {
/**
 * Programa que calcula el máximo y el mínimo de 2 números enteros introducidos
 * por teclado.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer valor: ");
		number1 = scan.nextInt();
		System.out.println("introduce el segundo valor: ");
		number2 = scan.nextInt();
		
		int minimo = Math.min(number1, number2);
		int maximo = Math.max(number1, number2);
		
		System.out.println("El valor mas alto es: " + maximo);
		System.out.println("El vlor mas pequeño es: " + minimo);
	}

}
