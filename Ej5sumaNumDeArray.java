/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crear una función a la que se le pasen dos tablas y nos diga cuál contiene
una menor suma de sus elementos */
public class Ej5sumaNumDeArray {
    
    /*Creamos una funcion donde sumamos los valores de un array*/
    static int suma(int tabla[]){
        int suma = 0;
        for(int i = 0; i<tabla.length;i++){ //Crear un bucle para sumar los numeros de la tabla
            suma+= tabla[i];
        }
        return suma;
        
    }
    /*Funcion donde se introduce los numeros de una tabla*/
    static int[] numTabla(int cont){
        int i = 0;
        int tabla[] = new int [cont]; // Crea una tabla para guardar los numeros
        Scanner sc = new Scanner (System.in);
        while(i<cont){
            System.out.println("Introduce numero:");
            int num = sc.nextInt(); // Escribo los numeros que quiero guardar
            tabla[i]= num; // Guarda los numeros
            i++;
        }
        return tabla; // Regreso la tabla
    }
    public static void main(String[] args){
        
        int cont1,cont2; // Creamos contadores para definir el tamaño de los dos arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array 1:");
        cont1 = sc.nextInt(); // Se introduce el numero del tamaño de array 1
        System.out.println("Tabla 1:");
        int array1[] = numTabla(cont1); // Guardamos los valores del array de la funcion a la variable de esta funcion
        System.out.println("Introduce el tamaño del array 2:");
        cont2 = sc.nextInt(); // Se introduce el numero del tamaño de array 1
        System.out.println("Tabla 2:");
        int array2[] = numTabla(cont2); // Guardamos los valores del array de la funcion a la variable de esta funcion
        int sumaArray1 = suma(array1); // Sumamos los valores del array 1
        int sumaArray2 = suma(array2); // Sumamos los valores del array 2
        if (sumaArray1 == sumaArray2){ // Compara las suma del array
            System.out.println("Son iguales");
        } else if (sumaArray1<sumaArray2){
            System.out.println("La suma del menor es: " + sumaArray1);
        } else {
            System.out.println("La suma del menor es: " + sumaArray2);
        }
    }
    
}
