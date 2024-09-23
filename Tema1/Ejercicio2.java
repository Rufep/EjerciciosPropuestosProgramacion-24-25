package Tema1;

public class Ejercicio2 {
/**
 * Escribir un programa que calcule la superficie , el volumen y la longitud
 * de una circunferencia a partir del radio. 
 *  
 *      a. Longitud = 2*Pi*radio
 *      b. Volumen = (4/3)*PI*radio3
 *      c. Superficie = PI*radio2
 * 
 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radio=5;
		float longitud, volumen, superficie;
		
		longitud = 2*(float)Math.PI*radio;//como Math.PI devuelve un double formamos el casteo a float 
		System.out.println("La longitud  de la cirucunferencia para un  radio de : "+ radio + "es de = " + longitud);
	
		volumen = (4/3)*(float)Math.PI*radio*radio;
		System.out.println("La el volumen para la circunferencia para un radio de : "+ radio + "es de = " + volumen);

		superficie = (float)Math.PI*radio*radio*radio;
		System.out.println("La superficie de la circunferencia para un radio de : "+ radio + "es de = " + superficie);

	}

}
