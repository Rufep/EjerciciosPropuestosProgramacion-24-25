package tema2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
/**
 * Crear una matriz de enteros con capacidad para 5 números. Darle valores
 *  aleatorios y mostrar por pantalla los valores almacenados en la primera y
 *   la última posición.
 *   
 *   	a. A continuación copiar la matriz a otra matriz. 
 *   
 *   	b. Ordenar la matriz copia. Mostrar por pantalla las dos matrices para 
 *   	   comprobar.
 *   
 *    	c. Solicitar al usuario que introduzca un valor e indicar en qué posición
 *         se encuentra.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = new int[5];
		int copiaNums[];
		
		Random generador=new Random();
		
		//llenamos el array con numeros aleatorios
		nums[0]=generador.nextInt(10);
		nums[1]=generador.nextInt(10);
		nums[2]=generador.nextInt(10);
		nums[3]=generador.nextInt(10);
		nums[4]=generador.nextInt(10);
		
		//copiamos el array nums en el array copianums
		copiaNums = Arrays.copyOf(nums,nums.length);//copia del Array de numeros
		
		System.out.println("Valor de la primera posición del array :" + nums[0]);
		System.out.println("Valor para la ultima posición del array :" + nums[nums.length-1]);
	
		//ordenamos la copia del array
		Arrays.sort(copiaNums);
		
		//mostramos el array original nums y el array copia  nums ordenado
		System.out.println("los valores del array original de numeros son:" + Arrays.toString(nums)  );
		System.out.println("los valores del array copiado y ordenados son: " + Arrays.toString(copiaNums));
	
		//pedimos al usuario que introduzca un numero del array y vemos en que posicion esta
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero del array: ");
		int numUser = scan.nextInt(); //introducimos el numero
		int positionNum = Arrays.binarySearch(copiaNums, numUser);//buscar la posicion del numero introducido
		System.out.println("el numero introducido por el usuario esta en la posición :" + positionNum);
		
	
	}

}
