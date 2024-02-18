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
        for (int i = 0; i < cont; i++) { // Bucle anidado para escibir en la matriz
            for (int j = 0; j < cont; j++) {
                System.out.println("Escribe numero:");
                Scanner sc = new Scanner(System.in);
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz; // Regresa la matriz creada y escrita
    }
    // Funcion donde se suma dos matrices
    static int[][] sumaMatriz(int matriz1[][], int matriz2[][]){
        int comun; //Contador comun de las dos matrices
        comun = matriz1.length;
        int contmodif = comun+2; //Contador diferente al comun
        int suma[][] = new int [comun][contmodif]; // Matriz suma
        for(int i=0;i<comun;i++){ // Solucionar este fallo
            for(int j=0;j<contmodif;j++){
                if(j<comun){ // Compara si la dos matrices se pueden sumar y si no le pone un cero
                    suma[i][j]=matriz1[i][j] + matriz2[i][j];
                } else {
                    suma[i][j] = 0;
                }
            }
        }
        return suma; // Regresa el resultado de la suma de las matrices
    }

    public static void main(String[] args) {
         
            int cont;//Para las dos matrices
            Scanner sc = new Scanner(System.in);
            System.out.println("Tamaño de las dos matrices:");
            cont = sc.nextInt(); // Escribir el tamaño del contador 1
            System.out.println("Escribe la matriz 1:");
            int m1[][] = crearMatriz(cont); // Creacion matriz 1
            System.out.println("La matriz 1 es " + Arrays.deepToString(m1));
            System.out.println("Escribe la matriz 2:");
            int m2[][] = crearMatriz(cont); // Creacion matriz 2
            System.out.println("La matriz 2 es " + Arrays.deepToString(m2)); 
            int s [][] = sumaMatriz(m1,m2); // Para guardar la suma de las matrices
            System.out.println("La suma de las matrices es " + Arrays.deepToString(s));
    }
}
