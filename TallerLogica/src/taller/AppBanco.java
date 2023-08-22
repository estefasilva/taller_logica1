/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
import java.util.Scanner;
public class AppBanco {
        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al Banco");
        
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar transferencia");
            System.out.println("3. Cambiar clave");
            System.out.println("4. Bloquear producto");
            System.out.println("5. Realizar donación");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarTransferencia();
                    break;
                case 3:
                    cambiarClave();
                    break;
                case 4:
                    bloquearProducto();
                    break;
                case 5:
                    realizarDonacion();
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestros servicios. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void consultarSaldo() {
        System.out.println("Consulta de saldo:");
        // Cconsultar el saldo del cliente
    }

    public static void realizarTransferencia() {
        System.out.println("Realizar transferencia:");
        // realizar una transferencia
    }

    public static void cambiarClave() {
        System.out.println("Cambiar clave:");
        // Ccambiar la clave del cliente
    }

    public static void bloquearProducto() {
        System.out.println("Bloquear producto:");
        // bloquear un producto del cliente
    }

    public static void realizarDonacion() {
        System.out.println("Realizar donación:");
        // realizar una donación
    }
   
}

 

