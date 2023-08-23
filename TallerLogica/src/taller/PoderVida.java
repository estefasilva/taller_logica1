/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;
import java.util.Random;
/**
 *
 * @author RICHAR
 */
public class PoderVida {
           public static void main(String[] args) {
        int poder = 0;
        int vida = 10;
        Random random = new Random();

        for (int i = 0; i < 20; i++) { 
            int numero = random.nextInt(6) + 1; 
            System.out.println("Número generado: " + numero);

            if (numero == 5) {
                poder++;
                System.out.println("¡Has ganado un punto de poder! Poder actual: " + poder);
            } else if (numero == 3) {
                vida--;
                System.out.println("Has perdido un punto de vida. Vida actual: " + vida);
            }
        }

        System.out.println("\nResultado final:");
        System.out.println("Poder final: " + poder);
        System.out.println("Vida final: " + vida);
    }

 
}
