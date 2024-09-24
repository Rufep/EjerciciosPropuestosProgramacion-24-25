package Tema1;

public class Ejercicio5 {
/**
 * Calcular un programa que a partir del precio de un producto le aplique un descuento 
 * del 15% y muestre por pantalla el precio inicial y el precio rebajado.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio=352,descuento;
		System.out.println("El precio inicial del producto es= "+precio);
		
		descuento= precio - (precio*15)/100; //restamos el precio original al descuento del 15%
		
		System.out.println("El precio tras un descuento del 15% es ="+descuento);

	}

}
