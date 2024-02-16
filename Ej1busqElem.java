/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crea un método al que se le pase: una tabla rellena de enteros y un entero.
Habrá que buscar ese elemento en la tabla. */
public class Ej1busqElem {

    /*Creo una funcion donde creo una tabla y el entero*/
    static void busqueda() {
        int cont;
        System.out.println("Introduce cauntos numeros habra en la tabla:");
        Scanner sc = new Scanner(System.in);
        cont = sc.nextInt(); // Para el tamaño del array
        int i = 0;
        int tabla[] = new int[cont];
        while (i < cont) { // Paea escribir los numeros en la tabla
            System.out.println("Escribe un numero:");
            int num = sc.nextInt();
            tabla[i] = num;
            i++;
        }
        System.out.println("Escribe un numero a buscar:");
        int busq = sc.nextInt(); //Creamos una variable para buscar
        int pos = Arrays.binarySearch(tabla, busq); // Para que busque la posicion en la tabla
        if (pos >= 0) {
            System.out.println("Esta en la posición: " + pos);
        } else {
            System.out.println("No esta en esta tabla.");
        }
    }
    public static void main(String[] args){
        
        busqueda();
    }
}
