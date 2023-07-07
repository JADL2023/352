/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg3.facturas;

import java.util.*;

public class Facturas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] numFacturas = new int[5];
        String[] codigosProductos = new String[5];
        double[] cantidadesLitros = new double[5];
        double[] preciosLitro = new double[5];

        // Capturar información de las facturas
        for (int i = 0; i < 5; i++) {
            System.out.println("Factura " + (i + 1));
            System.out.print("Ingrese el número de factura: ");
            numFacturas[i] = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer del Scanner
            System.out.print("Ingrese el código del producto: ");
            codigosProductos[i] = entrada.nextLine();
            System.out.print("Ingrese la cantidad en litros comprados: ");
            cantidadesLitros[i] = entrada.nextDouble();
            System.out.print("Ingrese el precio por litro: ");
            preciosLitro[i] = entrada.nextDouble();
        }

        // Calcular importe total de las facturas
        double importeTotal = 0;
        for (int i = 0; i < 5; i++) {
            double importeFactura = cantidadesLitros[i] * preciosLitro[i];
            importeTotal += importeFactura;
        }

        // Calcular cantidad de litros comprados del producto 1
        double litrosProducto1 = 0;
        for (int i = 0; i < 5; i++) {
            if (codigosProductos[i].equals("1")) {
                litrosProducto1 += cantidadesLitros[i];
            }
        }

        // Contar facturas mayores a diez mil pesos mexicanos
        int contadorFacturasMayores10Mil = 0;
        for (int i = 0; i < 5; i++) {
            double importeFactura = cantidadesLitros[i] * preciosLitro[i];
            if (importeFactura > 10000) {
                contadorFacturasMayores10Mil++;
            }
        }

        // Encontrar el valor máximo de las facturas
        double maximoFacturas = 0;
        for (int i = 0; i < 5; i++) {
            double importeFactura = cantidadesLitros[i] * preciosLitro[i];
            if (importeFactura > maximoFacturas) {
                maximoFacturas = importeFactura;
            }
        }

        // Encontrar el valor mínimo de las facturas
        double minimoFacturas = Double.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            double importeFactura = cantidadesLitros[i] * preciosLitro[i];
            if (importeFactura < minimoFacturas) {
                minimoFacturas = importeFactura;
            }
        }

        // Mostrar el resumen de ventas
        System.out.println("----- RESUMEN DE VENTAS -----");
        System.out.println("1. Importe total de las facturas generadas: $" + importeTotal);
        System.out.println("2. Litros comprados del producto 1: " + litrosProducto1);
        System.out.println("3. Facturas mayores a diez mil pesos mexicanos: " + contadorFacturasMayores10Mil);
        System.out.println("4. Valor máximo de las facturas: $" + maximoFacturas);
        System.out.println("5. Valor mínimo de las facturas: $" + minimoFacturas);
    }
}
