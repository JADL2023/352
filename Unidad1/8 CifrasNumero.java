package pkg8.cifrasnumero;

import java.util.Scanner;
public class CifrasNumero {

    
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese un numero: ");
int numero = scanner.nextInt();
if (numero < 10) {
System.out.println("Es de una cifra");
} else if (numero < 100) {
System.out.println("Es de dos cifra");
} else if (numero < 1000 ) {
System.out.println("es de tres cifras");
} else if (numero < 10000) {
    System.out.println("es de cuatro cifras");
} else if (numero < 100000){
    System.out.println("es de cinco cifras");
} if (numero < 0) {
System.out.println("no exiten numeros menores a 0");
    }
    }
}