package tema1;

public class Ejercicio7 {
/**
 *  Escribir un programa que defina una constante llamada IMPUESTOREVAL , 
 *  la inicialize a 3.4.   y permita calcular el importe de la venta de un piso a 
 *  partir de la siguiente fórmula:
 *  precioVenta = importe + CI + (IMPUESTOREVAL *Antiguedad/100)*precioCatastral
 *	
 *  Donde:
 *
 • 			CI : Es la comisión de la inmobiliaria que es de un 3% sobre el
 *				importe de la venta.
 *
 • 			Antiguedad: Años que pasaron desde la compra del piso.
 *
 • 			precioCatastral: Es el valor catastral del inmueble.
 *	
 *	Estos tres valores los ponéis por código, así como el del importe. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final float IMPUESTOREVAL =3.4f; //Constante
		int antiguedad=5;
		float precioVenta ,importe=5000,precioCatastral=8000;
		float ci= importe*0.3f;
		
		precioVenta = importe+ci+(IMPUESTOREVAL*antiguedad/100)*precioCatastral;
		System.out.println("El Precio de venta es "+ precioVenta);
		
	}

}
