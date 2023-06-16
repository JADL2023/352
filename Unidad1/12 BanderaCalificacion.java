package pkg12.banderacalificacion;

public class BanderaCalificacion {
    
    public static void main(String[] args) {
      int calificacionaprobatoria=7; 
      int calificacion1=7;
      int calificacion2=8;
      int calificacion3=5;
      int calificacion4=4;
      int calificacion5=5;
      boolean bandera1;
      bandera1=(calificacion1>=calificacionaprobatoria);
      boolean bandera2;
      bandera2=(calificacion2>=calificacionaprobatoria);
      boolean bandera3;
      bandera3=(calificacion3>=calificacionaprobatoria);
      boolean bandera4;
      bandera4=(calificacion4>=calificacionaprobatoria);
      boolean bandera5;
      bandera5=(calificacion5>=calificacionaprobatoria);
      System.out.println("Resultado de calificacion: " +bandera1+bandera2+bandera3+bandera4+bandera5);
    }
}