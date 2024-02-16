/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en
otra matriz nxm.*/
public class Ej7SumaMatrizEnOtro {

    //Funcion para crear matrices de proporciones iguales usaremos un contador
    static int[][] crearMatriz(int cont) {
        int matriz[][] = new int[cont][cont];
        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < cont; j++) {
                System.out.println("Escribe numero:");
                Scanner sc = new Scanner(System.in);
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
         
            System.out.println();
            int contD, contA;
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuantas columnas tiene?");
            contD = sc.nextInt();
            System.out.println("¿Cunatas filas tiene?");
            contA = sc.nextInt();
        int array1 [][] = crearMatriz(contD);
        System.out.println(Arrays.deepToString(array1));
        
    }
}
