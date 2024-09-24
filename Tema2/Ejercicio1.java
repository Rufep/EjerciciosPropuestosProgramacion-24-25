package tema2;

import java.util.Scanner;

public class Ejercicio1 {
/**
 *  Realizar un programa que calcule el módulo de un vector:
 *  
 *  modulo = a raiz Cuadrada
 *  
 *  Donde a , b y c son 3 valores introducidos por el usuario.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valor1,valor2,valor3;
		
		Scanner scan = new Scanner(System.in); //creamos un Scanner para poder introducir loa valores por teclado
		
		System.out.println("Introduce el primer valor: ");
		valor1= scan.nextInt();
		System.out.println("Introduce el segundo valor: ");
		valor2= scan.nextInt();
		System.out.println("Introduce el tercer valor: ");
		valor3 = scan.nextInt();

		double modulo = Math.sqrt(valor1*valor1 + valor2*valor2 + valor3*valor3);
		
		System.out.println("el modulo es = " + modulo);
		
		
	}

}
