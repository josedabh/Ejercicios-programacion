/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;
/*Crear una función que pida por teclado 5 elementos y los almacene en una tabla*/

public class Ej3almacenarEnTabla {

    /*Introducir una funcion donde se introduce un numero y que genere n numeros*/
    static int[] numAleatorios(int cont){
        int i = 0;
        int tabla[] = new int[cont]; //Para definir cuantos valores temdra la array con cont
        while(i<cont){ //Un bucle que compara el numero que introducimos en la funcion con el i que recorre la funcion
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        tabla[i]= sc.nextInt();//Para que te pida un numero por consola y lo guarde
        i++;
        }
        return tabla; //Para que regrese los valores de la array(tabla)
        
    }
    public static void main(String[] args){
        
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un contador:");
        c=sc.nextInt(); //Para que cont sea el numero que introducimos por consola
        System.out.println("Los numeros son " + Arrays.toString(numAleatorios(c))); //Muestre la tabla que generamos
        
    }
}
