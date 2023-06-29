
package pkg13.switchcajero;

import java.util.Scanner;

public class SwitchCajero {

    public static void main(String[] args) {
       
        //variables 
        final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        Scanner entrada = new Scanner (System.in);
        
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
            case 3:
                
        
        
        
        
        
            default:
                
    }
    
  }
}