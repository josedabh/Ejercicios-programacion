/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*[CONCHITA] Ordenar todos los elementos de una matriz de izquierda a
derecha y de arriba a abajo.*/
public class Ej12Ordenarmatriz {
    
    /*Funcion que convierte una matriz en un array*/
    static int[] Conversion(int matriz[][]) {
        int cont = matriz.length; //Definimos el tamaño de la matriz anterior
        int array[] = new int[cont*cont]; // Definimos el tamaño del array multiplicando su contador por el mismo
        int r = 0; // Usamos un contador r para recorrer en el array
        for (int i = 0; i < cont; i++) { // Bucle anidado para recorrer la matriz y escribir en el array
            for(int j = 0;j<cont;j++){
                array[r] = matriz[i][j];
                r++;
            }
        }
        Arrays.sort(array);
        return array; // Devolvemos el array escrito
    }
    // Funcion donde convertimos el array en matriz
    static int[][] Ordenado(int array[],int cont){
        int ordMatriz[][] = new int [cont][cont]; // Matriz ordenada
        int r = 0;
        for (int i = 0; i < cont; i++) { // Bucle anidado para recorrer el array y escribir en la matriz
            for(int j = 0;j<cont;j++){
                ordMatriz[i][j] = array[r];
                r++;
            }
        }
        return ordMatriz;
        
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
        int array[] = Conversion(matriz); // Guardamos el array de la funcion hecha
        int MatrizF [][] = Ordenado(array,cont); //Guardamos matriz ordenada
        System.out.println("La matriz ordenada es " + Arrays.deepToString(MatrizF));
    }
}
