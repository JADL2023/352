
package pkg14.codigosmenu;

import java.io.*;
import java.util.Scanner;

public class CodigosMenu {

  
    public static void main(String[] args) {
        int op, num = 0;
      Scanner entrada = new Scanner (System.in);
      
      while(num>=0){

       System.out.println("1. Calificaciones");
        System.out.println("2. Deescuento");
        System.out.println("3. Cajero");
        System.out.println("4. Salir");
        
        System.out.println("Ingresar un numero");
        op=entrada.nextInt();
        
        switch (op){
            case 1:
        
       // Obtener la calificación del usuario.
        
        System.out.println("Ingrese su calificación: ");
        int calificacion;
        calificacion = entrada.nextInt();
        
        // Calcular la calificación.
        
        switch (calificacion) {
            
            case 0:
                System.out.println("Muy Mala");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Insuficiente");
                break;
            case 6:
                System.out.println("Suficiente");
                break;
            case 7:
                System.out.println("Aprobado");
                break;
            case 8:
                System.out.println("Bien");
               break;
            case 9:
                System.out.println("Bueno");
                break;
            case 10:
                System.out.println("Exelente");
                break;
            default:
                System.out.println("Calificación no válida");
                break;
        }
                break;
            case 2:
                 Scanner scanner = new Scanner(System.in);
        
        // Obtener el precio del producto.
        
        System.out.println("Introduce el precio del producto:");
        String precio = scanner.nextLine();
        
        // Obtener el código de descuento del usuario.
        
        System.out.println("Introduce el código de descuento:");
        String códigodescuento = scanner.nextLine();
        
       // Calcular el descuento.
        double descuento = 0;
        switch (códigodescuento) {
            case "A123":
                descuento = 10;
                break;
            case "B456":
                descuento = 20;
                break;
            case "C789":
                descuento = 30;
                break;
            default:
                System.out.println("Código de descuento no válido.");
        }
        // Imprime el descuento.
        System.out.println("el descuento es del: " + descuento + "%.");
        
                break;
            case 3:
                
        //variables 
        final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta");
        System.out.println("3. Salir");
        
        System.out.println("Ingresar un numero");
        opcion=entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Digite la cantidad que desea ingresar");
                ingreso=entrada.nextInt();
                saldoActual=saldo_inicial+ingreso;
                System.out.println("El esatdo actual es: " + saldoActual);
                break;
            case 2:
                System.out.println("Digite la cantidad que desea retirar");
                retiro=entrada.nextInt();
                if(retiro<=saldo_inicial){
                saldoActual=saldo_inicial-retiro;
                    System.out.println("Dinero en cuenta: " + saldoActual);
                } 
                else{
                     System.out.println("No cuenta con el");
                }
                break;
        }
      
        }
      } 
  }
}

    


