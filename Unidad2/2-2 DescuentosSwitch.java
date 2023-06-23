/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg2.descuentosswitch;

import java.util.Scanner;
public class DescuentosSwitch {

    public static void main(String[] args) {
        //Definicion de variables//
        double PV=1000;
        Scanner entrada=new Scanner(System.in);
        int descuento=0;
        double precioFinal;
        String codPromocion;
        
        
        
        //Entrada de datos//
        System.out.println("Su total de compra es : $ "+PV+"\n");
        System.out.println("Tienes un codigo de descuento escribelo: ");
        codPromocion=entrada.next();
        codPromocion=codPromocion.toUpperCase();
        
        //Proceso//
        //Salida de datos//
       switch(codPromocion){
           case "PLATINOOCTUBRE":
               descuento=20;
               break;
           case "SILVEROCTUBRE":
               descuento=50;
               break;
           case "BRONCEOCTUBRE":
               descuento=35;
               break;
           case "OROOCTUBRE":
               descuento=75;
               break;
           default:
               System.out.println("A introducido un codigo que no tiene descuento");
               
       }
        precioFinal=PV-descuento;
        System.out.println("Total sobre descuento es : $ "+precioFinal);
    }
    
}