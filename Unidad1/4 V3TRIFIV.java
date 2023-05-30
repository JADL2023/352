package pkg4.v3trifiv;

import java.util.Scanner;

public class V3TRIFIV {

    public static void main(String[] args) {
        //Declaracion de dadtos 
        Scanner Entrada = new Scanner(System.in);
        int numero;
        //entrada de datos
        System.out.println("dame el numero");
        numero = Entrada.nextInt();
        //salida de datos 
        System.out.println(retornaMultiplo(numero));
        
    }
        public static String retornaMultiplo(int num){
            //declaracion de datos 
            int mult3;
            int mult5;
            //procesamiento de datos 
            mult3 = num % 3;
            mult5 = num % 5;
            //salida de datos 
            if ( mult3 == 0 && mult5 == 0){
                return "TRIFIV";
            }else if (mult3 == 0){
                return "TRI";
            }else if (mult5 == 0){
                return "FIV";
            }
             return "ningun caso";
            
            
        }
    }
    

