/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

import java.util.Scanner;

/**
 *
 * @author BETO. LOPEZ
 */
public class Tri {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("INGRESE EL NUMERO");
    int num = sc.nextInt();
    
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("TriFiv");
        } else if(num % 3 == 0) {
            System.out.println("Tri");
        } else if(num % 5 == 0) {
            System.out.println("Fiv");
        } else {
            System.out.println("El número no es múltiplo de 3 ni de 5");
        }
} 
}
