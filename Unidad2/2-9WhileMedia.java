
package pkg2.pkg9whilemedia;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num, suma, elementos;
        float media;
        
        System.out.println("Introduzaca un número: ");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while(num>=0){
            suma+= num;
            elementos++;
            
            System.out.println("Introduxca otro número: ");
            num = entrada.nextInt();
        }
               media = (float)suma/elementos;           
                System.out.println("La media es de: " + media);
            }
            
        }
        
    


