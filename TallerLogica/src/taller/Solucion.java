/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
public class Solucion {
    public static void main (String[]args){
        /*
3+8*5-6/3
2.5*2*3-4/2+8
2*(6-2.5)/3
25>18
3+2.5*4/3 != 4*5.2-3.8
(8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2)
*/
        /* 3+8*5-6/3*/
        int num1= 3;
        int num2= 8;
        int num3= 5;
        int num4=6;
        float num5=3f;
        int suma= num1+num2;
        int multi= suma*num3;
        int resta= multi-num4;
        float div= resta/num5;
        System.out.println("resultado"+suma);
        System.out.println("resultado"+multi);
        System.out.println("resultado"+resta);
        System.out.println("resultado"+div);
        
        /*2.5*2*3-4/2+8*/
        double nume1= 2.5;
        int nume2= 2;
        int nume3= 3;
        int nume4= 4;
        int nume5= 2;
        int nume6= 8;
        double  resultad = 2.5 *2 *3 -4/ 2 + 8;
        System.out.println("resultad" + resultad);
        
        
      /* 2*(6-2.5)/3*/
        System.out.println("resulta" + ( 2*(6-2.5)/3));
        
        /*25>18*/
        int numero1= 25;
        int numero2= 18;
        boolean result = 25>18;
        System.out.println("resultado" + result);
        
        /*3+2.5*4/3 != 4*5.2-3.8*/
        System.out.println("result" + ( 3+2.5*4/3 != 4*5.2-3.8));
        
        /*(8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2) */
        System.out.println("resul" + ((8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2)));
        
    }
    
    
}
