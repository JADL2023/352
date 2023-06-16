
package pkg11.banderas;

public class Banderas {

    
    public static void main(String[] args) {
        
        int edadJuan= 22;
        int edadPedro= 20;
        
        boolean bandera1;
        
        bandera1=(edadJuan > edadPedro);
        System.out.println("resultado de bandera1:" + bandera1);
        
        int edadLupe= 35;
         
         boolean bandera2;
         boolean bandera3;
         
         bandera2=(edadLupe < edadPedro);
           System.out.println("Resultado de bandera2:" + bandera2);
         bandera3=(bandera1 && bandera2);
         System.out.println("Resultado de bandera3:" + bandera3);
       
    }
    
}
