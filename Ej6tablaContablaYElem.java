/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crear una función a la que se le pase una tabla y devuelva otra igual pero
con un elemento más (que también se le pasa como parámetro) */
public class Ej6tablaContablaYElem {
    /*Creamos una funcion donde introducimos los numeros en la tabla con un contador(c)*/
    static int[] nTabla(int c){
        int i = 0;
        int t[] = new int [c]; // Creamos la tabla(t) para luego introducir los numeros
        while(i<c){ // Bucle para introducir los numero en la tabla
            System.out.println("Escribe un numero:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // Para escribir el numero(n)
            t[i] = n;
            i++;
        }
        return t; // Regresa la tabla que hemos creado
    }
    
    // Creamos una funcion que se le pasa una tabla entero y un elemento entero para introducirlo
    static int[] aniadirElemento(int tabla[], int elem){
        int cont = (tabla.length + 1); // Creamos un contador(cont) para tener el tamaño de la tabla más el elemento
        int nuevaT[] = new int[cont]; // Creamos nueva tabla para tener la tabla con el elemento
        for(int i=0;i<nuevaT.length;i++){ // Creamos un bucle para introducir los numeros en la nueva tabla
            if(i<tabla.length){
                int num = tabla[i];
                nuevaT[i] = num;
            } else {
                nuevaT[i]=elem;
            }
        }
        return nuevaT; // Regresa la nueva tabal con la anterior y el elemento
    }
    
    public static void main(String[] args){
        
        int cont;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array:");
        cont = sc.nextInt(); // Se escribe el numero del contador
        int array[] = nTabla(cont);
        System.out.println("La tabla es: " + Arrays.toString(array));
        System.out.println("Escribe un elemento que quieras introducir en esta tabla:");
        int nElem = sc.nextInt();
        int nArray[] = aniadirElemento(array,nElem); // Lo creamos para que nos enseñe la nueva tabla con la tabla y el elemento
        System.out.println("La nueva tabla es: " + Arrays.toString(nArray));
    }
    
}
