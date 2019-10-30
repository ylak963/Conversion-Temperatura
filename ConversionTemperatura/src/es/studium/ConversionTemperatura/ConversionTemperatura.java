package es.studium.ConversionTemperatura;

import java.util.Scanner;

public class ConversionTemperatura {

	public static void main(String[] args) {
		int option;
		float cantidad = 0;

		Scanner teclado = new Scanner(System.in);
		// Evalua la condicion y si se cumple, entra en bucle.\n para salto de linea
		do {
			System.out.println("Indique el número correspondiente a una opción del siguiente menu:" + "\n* MENÚ *\r\n"
					+ "1. Pasar de Centígrados a Fahrenheit\r\n" + "2. Pasar de Fahrenheit a Centígrados\r\n"
					+ "3. Salir");
			option = teclado.nextInt();

			if(option==1 || option==2) {

				System.out.println("Introduzca la cantidad a convertir:");
				cantidad=teclado.nextFloat();
				if(option==1) 
				{
					System.out.println(	"La cantidad introducida equivale a"+" " + funConversionCaF(cantidad)+" "+ "grados Fahrenhet"+"\n");
				}
				if(option==2)
				{	
					System.out.println("La cantidad introducida equivale a"+" " + funConversionFaC(cantidad) +" "+ "grados Celsius");
				}
			}

		} while (option != 3);
		teclado.close();
	}

	private static float funConversionCaF(float cantidad) {
		float fah;
		fah = (((float)9 / 5) *cantidad) + (float)32;

		return fah;
	}

	private static double funConversionFaC(float cantidad) {
		float cent;
		cent = ((float)5 / 9) * (cantidad - (float)32);
		return cent;
	}

}
