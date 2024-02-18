/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Scanner;
import java.util.Arrays;

/* Devuelve el valor máximo de un array bidimensional que se pasa como
parámetro. */
public class Ej8ValorMaxArrayBid {
    
     //Funcion para crear matrices de proporciones iguales usaremos un contador
    static int[][] crearMatriz(int cont) {
        int matriz[][] = new int[cont][cont];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cont; i++) { // Bucle anidado para escibir en la matriz
            for (int j = 0; j < cont; j++) {
                System.out.println("Escribe numero:");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz; // Regresa la matriz creada y escrita
    }
    //Funcion que compara los valores de la matriz y saca el mayor
    static int valorMax(int matriz[][],int cont){
        int max = 0; // Valor inicial
        for(int i = 0;i<cont;i++){ // Bucle anidado que recorre la matriz y compara los valores
            for(int j=0;j<cont;j++){
               int num = matriz[i][j]; // Saca el numero siguiente
               int comp = Math.max(num, max); // Compara el ultimo y el mayor que este ahi
               max = comp; // Saca el numero mayor
            }
        }
        return max; //Devuelve el mayor
    }
    
    public static void main(String[] args){
        
        int cont;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño la matriz:");
        cont = sc.nextInt();
        int matriz[][] = crearMatriz(cont); // Para guardar la matriz
        System.out.println("La matriz creada es " + Arrays.deepToString(matriz));
        int valormax = valorMax(matriz,cont); // Guarda el valor maximo
        System.out.println("El valor maximo es " + valormax);
    }
}
