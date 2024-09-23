package Tema1;

public class Ejercicio3 {
/**
 * Escribir un programa que nos permita convertir una temperatura en grados fahrenheit
 * en su equivalente en la escala Celsius. La fórmula para realizar la conversión es :
 * 
 *  	celsius =  {(fahrenheit - 32)*5} / {9}
 *  
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float temperaturaFarenheit=100f,celsius;
		celsius=(temperaturaFarenheit-32)*5/9;
		
		System.out.println("Partiendo de una temperatura en grados Farenheit de " + temperaturaFarenheit + " equivale a una temperatura de : "+ celsius+ " celsius" );
		
			

	}

}
