package Tema1;

public class Ejercicio4 {
	/**
	 * Intercambiar el valor de dos variables. Es decir si una variable x vale 5
	 * y una variable “y” vale 1 , el programa debe cambiar estos valores ,
	 * esto es , x pasa a valer 1 e y pasa a valer 5.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=1,intercambio;
		System.out.println("Los valor original de X es : "+x+" y el valor original de Y es : "+y);
		
		//utilizamos una tercera variable para hacer el intercambio de valores
		
		intercambio = x;//intercambio guarda el valor que tiene x en intercambio intercambio z vale 5
		x = y;// guardamos el valor de y en X por lo tanto ahora x vale 1
		y = intercambio;//guardamos el valor de intercambio en y por lo tanto ahora y vale 5
		
		System.out.println("El valor de X es : "+x);
		System.out.println("El valor de y es : "+y);

		

	}

}
