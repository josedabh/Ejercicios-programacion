/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crea una tabla de 6 elementos rellena de números decimales. Aumentar
cada uno de esos elementos en un 25%. */
public class Ej14TablaIncremEnUn25x100 {
    
    public static void main(String[] args){
        
        int cont;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño de la matriz:");
        cont = sc.nextInt(); // Escribimos el contador para el tamaño de la matriz
        double matriz[][] = new double [cont][cont]; // Definimos la matriz double a partir del contador
        for(int i = 0;i<cont;i++){ // Bucle para escribir y guardar los numeros de la matriz
            for(int j = 0;j<cont;j++){
                System.out.println("Escribe un numero:");
                matriz[i][j]= sc.nextDouble();
            }
        }
        System.out.println("La matriz es " + Arrays.deepToString(matriz));
        double increm [][] = new double[cont][cont]; // Matriz creada para el incremento de 25% con el tamaño de la naterior matriz
        for(int i=0;i<cont;i++){ // Bucle que incrementa todos los valores de la matriz anterior por 25%
            for(int j=0;j<cont;j++){
                increm[i][j]=matriz[i][j]*1.25; // Usamos el 0,75 porque es la resta de 1 + 0,25. Me equivoque con una suma al ser un incremento
            }
        }
        System.out.println("La matriz con el incremento del 25% es " + Arrays.deepToString(increm));
        
    }
}
