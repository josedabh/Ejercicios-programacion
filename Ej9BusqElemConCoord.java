/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Función a la que se le pase una matriz bidimensional, unas coordenadas y
devuelva el elemento que contiene en esa posición.*/
public class Ej9BusqElemConCoord {
    
    /*Funcion que busca la posicion en la matriz*/
    static int BusqCoord(int matriz[][],int x,int y){
        int elem = matriz[x][y];
        return elem;
    }
    public static void main(String[] args){
        
        int cont;
        System.out.println("Escribe el tamaño de la matriz:");
        Scanner sc = new Scanner(System.in);
        cont = sc.nextInt(); //Contador para definir el tamaño de la matriz
        int matriz[][] = new int[cont][cont];
        int i,j;
        for(i = 0;i<cont;i++){ //Bucle anidado para escribir en la matriz
            for(j = 0; j<cont;j++){
                System.out.println("Escribe numero:");
                matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println("La matriz es: " + Arrays.deepToString(matriz));
        System.out.println("Introduce la coordenada x:");
        int x = sc.nextInt();
        System.out.println("Introduce la coordenada y:");
        int y = sc.nextInt();
        int busq = BusqCoord(matriz,x,y); //Devuelve el valor que esta en las coordenas x,y
        System.out.println("El elemento de esa posicion es: " + busq);
    }
}
