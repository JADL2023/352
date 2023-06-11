package precedenciaoperadores;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PrecedenciaOperadores {
    
    static double a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,m=0,n=0,p=0,q=0,r=0,s=0,x=0,y=0;

    public static void main(String[] args) {
        pedirDatos();
        calculoOperaciones(a,b,c,d,e,f,g,h,j,m,n,p,q,r,s,x,y);
        
        
    }
    
    public static void pedirDatos(){
    //todos los datos 
    Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a:");
        a= Entrada.nextDouble();
        System.out.println("Ingrese el valor de b:");
        b= Entrada.nextDouble();
        System.out.println("Ingrese el valor de c:");
        c= Entrada.nextDouble();
        System.out.println("Ingrese el valor de d:");
        d= Entrada.nextDouble();
        System.out.println("Ingrese el valor de e:");
        e= Entrada.nextDouble();
        System.out.println("Ingrese el valor de f:");
        f= Entrada.nextDouble();
        System.out.println("Ingrese el valor de g:");
        g= Entrada.nextDouble();
        System.out.println("Ingrese el valor de h:");
        h= Entrada.nextDouble();
        System.out.println("Ingrese el valor de j:");
        j= Entrada.nextDouble();
        System.out.println("Ingrese el valor de m:");
        m= Entrada.nextDouble();
        System.out.println("Ingrese el valor de n:");
        n= Entrada.nextDouble();
        System.out.println("Ingrese el valor de p:");
        p= Entrada.nextDouble();
        System.out.println("Ingrese el valor de q:");
        q= Entrada.nextDouble();
        System.out.println("Ingrese el valor de r:");
        r= Entrada.nextDouble();
        System.out.println("Ingrese el valor de s:");
        s= Entrada.nextDouble();
        System.out.println("Ingrese el valor de x:");
        x= Entrada.nextDouble();
        System.out.println("Ingrese el valor de y:");
        y= Entrada.nextDouble();
    }
    
    public static void calculoOperaciones(double a, double b ,double c, double d, double e, double f, 
            double g, double h, double j, double m, double n, double p, double q, double r, double s, double x, double y){
      
        DecimalFormat df =new DecimalFormat("#.00");
        
        double calculoA = (3 / 2) + (4 / 3);
        System.out.println("a: " + calculoA);
        double calculoB = (1 / (x - 5)) - ((3 * x * y) / 4);
        System.out.println("b: " + calculoB);
        double calculoC = (1 / 2) + 7;
        System.out.println("c: " + calculoC);
        double calculoD = 7 + (1 / 2);
        System.out.println("d: " + calculoD);
        double calculoE = ((a * a) / (b - c)) + ((d - e) / (f - ((g * h) / j)));
        System.out.println("e: " + calculoE);
        double calculoF = (m / n) + p;
        System.out.println("f: " + calculoF);
        double calculoG = m + (n / (p - q));
        System.out.println("g: " + calculoG);
        double calculoH = ((a * a) / (b * b)) + ((c * c) / (d * d));
        System.out.println("h: " + calculoH);
        double calculoI = (m / (n / p)) / (q - (r / s));
        System.out.println("i: " + calculoI);
        double calculoJ = ((3 * a + b) / (c - ((d + 5 * e) / (f + (g / (2 * h))))));
        System.out.println("j: " + calculoJ);
        double calculoK = (a * a + 2 * a * b + b * b) / ((1 / (x * x)) + 2);
        System.out.println("k: " + calculoK);
    }
}
