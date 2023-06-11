/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		System.out.println("Dame la edad");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad>0) {
			if (edad>5) {
				if (edad<18) {
					System.out.println("Es un niño");
				} else {
					System.out.println("Eres adulto");
				}
			} else {
				System.out.println("infante");
			}
		} else {
			System.out.println("No se pueden edades menores a 0");
		}
	}


}

