/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crea una función a la que se le pasen dos tablas de enteros y devuelva
otra con la suma. */
public class Ej18SumaDe2Tablas {
    
    // Creo na funcion que pide un contador(cont) donde escribimos los numeros para guardarlos en una tabla
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
    /*Funcion que suma dos tablas*/
    static int[] sumaTabla(int t1[],int t2[]){
        int s[] = new int[t1.length];
        for(int i=0;i < t1.length ;i++){
            s[i]=t1[i]+t2[i];
        }
        return s;
    }
    
    public static void main(String[] args){
        
        int valor; 
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros va a haber en la tabla?");
        valor = sc.nextInt(); //Escribo valor para el contador
        System.out.println("Introduce los numeros de la tabla 1");
        int tabla1[] = numTabla(valor); // Se introduce la tabla1
        System.out.println("Introduce los numeros de la tabla 2");
        int tabla2[] = numTabla(valor); // Se introduce la tabla2
        int suma[] = sumaTabla(tabla1,tabla2); // Suma las dos tablas
        System.out.println(Arrays.toString(tabla1) + " + " + Arrays.toString(tabla2) + " = " + Arrays.toString(suma));
        
    }
}
