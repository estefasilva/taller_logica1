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
public class Rectangulo {
       public static void main (String[]args){
         
/*Dados los lados de un rectángulo , calcular e imprimir el área y el perímetro.
Datos: base y altura
Realice el diagrama de flujo, el seudocódigo y el programa correspondiente a la solución de este problema. Pruebe la solución con un conjunto de datos adecuado.
*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * base + 2 * altura;

        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);

        scanner.close();

}
  
}
