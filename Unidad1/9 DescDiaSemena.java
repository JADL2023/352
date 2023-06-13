package pkg9.descdiasemena;

import java.util.Scanner;

public class DescDiaSemena {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Introduce el importe total de la compra");
        double precio = input.nextDouble();
        
        System.out.println("Introduzca el día de la semana: ");
        String diaSemana = input.next();
        
        double descuento = 16;
        if (diaSemana.equals("Martes") || diaSemana.equals("Jueves")) {
            descuento = precio * 0.15;
        
        }
        
        double cantidadTotal = precio - descuento;
        
        
        System.out.println("El descuento es $" + descuento);
        
        System.out.println("El monto total a pagar es $" + cantidadTotal);
        
       
    }
    
}
