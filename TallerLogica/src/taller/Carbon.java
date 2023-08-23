/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;
import java.util.Scanner;
/**
 *
 * @author RICHAR
 */
public class Carbon {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double totalToneladas = 0;

    System.out.println ("Ingrese la producción de carbón en toneladas de los últimos 12 meses:");

    for (int mes = 1; mes <= 12; mes ++) {
    System.out.print("Producción de carbón en el mes " + mes + ": ");
    double produccionMes = scanner.nextDouble();
    totalToneladas += produccionMes;
    }

    double promedioAnual = totalToneladas / 12;

    System.out.println ("El promedio anual de producción de carbón es: " + promedioAnual);
    scanner.close ();
}
 
}
