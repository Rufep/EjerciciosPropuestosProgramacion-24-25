package tema2;

import java.util.Scanner;

public class Ejercicio3 {
/**
 * Mejorar el programa anterior para que calcule el máximo y el mínimo de 3
 * números enteros.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer valor: ");
		number1 = scan.nextInt();
		System.out.println("introduce el segundo valor: ");
		number2 = scan.nextInt();
		System.out.println("introduce el segundo valor: ");
		number3 = scan.nextInt();
		
		int comp1Min = Math.min(number1, number2);
		int minimo = Math.min(comp1Min, number3);
		int comp1Max = Math.max(number1, number2);
		int maximo = Math.max(comp1Max, number3);
		
		System.out.println("El valor mas alto es: " + maximo);
		System.out.println("El vlor mas pequeño es: " + minimo);
	}

}
