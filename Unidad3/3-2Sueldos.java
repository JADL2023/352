/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg2sueldos;

import java.util.Scanner;
/**
 *
 * @author ssamo
 */
public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] sueldos = new double[10];

        // Pedir los 10 sueldos al usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = entrada.nextDouble();
        }

        // Calcular la suma de los sueldos
        double sumaSueldos = 0;
        for (double sueldo : sueldos) {
            sumaSueldos += sueldo;
        }

        // Contar cuántos sueldos son mayores a 1000
        int contadorMayores1000 = 0;
        for (double sueldo : sueldos) {
            if (sueldo > 1000) {
                contadorMayores1000++;
            }
        }

        // Calcular el promedio de los sueldos
        double promedioSueldos = sumaSueldos / sueldos.length;

        // Encontrar el sueldo máximo
        double sueldoMaximo = sueldos[0];
        for (double sueldo : sueldos) {
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }

        // Encontrar el sueldo mínimo
        double sueldoMinimo = sueldos[0];
        for (double sueldo : sueldos) {
            if (sueldo < sueldoMinimo) {
                sueldoMinimo = sueldo;
            }
        }

        // Mostrar los resultados
        System.out.println("1. La suma de los sueldos es: " + sumaSueldos);
        System.out.println("2. Hay " + contadorMayores1000 + " sueldos mayores a 1000");
        System.out.println("3. El promedio de los sueldos es: " + promedioSueldos);
        System.out.println("4. El sueldo máximo es: " + sueldoMaximo);
        System.out.println("5. El sueldo mínimo es: " + sueldoMinimo);
    }
}
