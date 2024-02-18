/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Scanner;
import java.util.Arrays;

/*Crear una tabla rellena de tres tablas de booleans. */
public class Ej17MatrizRellCon3ArraysBoolean {
    
    //Funcion para crear la tablas de boolean introduciendo un contador
    static boolean[] crearTabla(int cont) {
        boolean tabla[] = new boolean[cont];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cont; i++) { //Bucle para escribir y guardar en el array
            System.out.println("Escribe true o false:");
            tabla[i] = sc.nextBoolean();
        }
        return tabla; //Regresa la tabla creada
    }
    
    //Funcion para convertir los 3 array en una matriz
    static boolean[][] ConvMatriz(boolean array1[], boolean array2[], boolean array3[]) {
        int r = array1.length; // Definimos el tamaño maximo de los 3 arrays
        boolean matriz[][] = new boolean[3][r]; // Matriz que tiene el tamaño 3 y r donde 3 son el numero de arrays y r el maximo que tienen dentro los arrays.
        for (int i = 0; i < 3; i++) { //Bucle que escribe dentro la matriz los valores
            for (int j = 0; j < r; j++) { // Compracion para cuando acabe un array de ser escrito escribe el sguiente de la lista
                if (i == 0) {
                    matriz[i][j] = array1[j];
                } else if (i == 1) {
                    matriz[i][j] = array2[j];
                } else if (i == 2) {
                    matriz[i][j] = array3[j];
                }

            }
        }
        return matriz; // Devuelve la matriz creada

    }

    public static void main(String[] args) {
        int cont;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño de las 3 arrays:");
        cont = sc.nextInt(); // Contador para el tamaño de los arrays 
        System.out.println("Array 1:");
        boolean array1[] = crearTabla(cont); //Array 1
        System.out.println("Array 2:");
        boolean array2[] = crearTabla(cont); //Array 2
        System.out.println("Array 3:");
        boolean array3[] = crearTabla(cont); //Array 3
        System.out.println("El array 1 es " + Arrays.toString(array1));
        System.out.println("El array 2 es " + Arrays.toString(array2));
        System.out.println("El array 3 es " + Arrays.toString(array3));
        boolean matriz[][] = ConvMatriz(array1,array2,array3); // Matriz creada a partir de la funcion ConvMatriz
        System.out.println("La matriz es " + Arrays.deepToString(matriz));
    }
}
