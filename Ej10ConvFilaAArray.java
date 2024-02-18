/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Devuelve una fila (array unidimensional) de un array bidimensional
que se pasa como parámetro. */
public class Ej10ConvFilaAArray {
    /*Funcion que convierte una matriz en un array*/
    static int[] Conversion(int matriz[][],int i) {
        int cont = matriz.length; //Definimos el tamaño de la matriz anterior
        int array[] = new int[cont]; // Definimos el tamaño del array 
        int r = 0; // Usamos un contador r para recorrer en el array
        for (int j = 0; j < cont; j++) { // Bucle para recorrer la matriz y encuentre la fila para luego escribir en el array
                array[r] = matriz[i][j];
                r++;
        }
        return array; // Devolvemos el array escrito
    }

    public static void main(String[] args) {

        int cont;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz:");
        cont = sc.nextInt(); // Para indicar el tamaño de la matriz
        int matriz[][] = new int[cont][cont];
        for (int i = 0; i < cont; i++) { // Bucle anidado para escribir los valores de la matriz
            for (int j = 0; j < cont; j++) {
                System.out.println("Escribe un numero:");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matriz creada es " + Arrays.deepToString(matriz));
        System.out.println("Fila a devolver:");
        int fila = sc.nextInt(); 
        int array[] = Conversion(matriz,fila); // Guardamos el array de la funcion hecha
        System.out.println("El array es " + Arrays.toString(array));
    }
}
