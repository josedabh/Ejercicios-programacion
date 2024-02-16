/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;
import java.util.Scanner;

/*Crear dos tablas con misma longitud. En una almacenar los nombres de una
serie de alumnos, y en otra, sus notas de Programación. Devolver el nombre
del alumno/a con mayor nota. */
public class Ej13BusqNotaAlta {
    
    public static void main(String[] args){
        //Creamos un contador para saber el numero de alumnos
        int cont;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el numero de alumnos:");
        cont = sc.nextInt(); // Para escribir el numero de alumnos
        String alumnos[] = new String[cont]; //Tabla de los alumnos
        double notas[] = new double [cont]; // Tabla del numero de las notas de cada alumno
        for(int i = 0;i<cont;i++){ // Bucle para introducir los nombres y las notas en el array
            System.out.println("Nombre del alumno:");
            String nombre= sc.next(); // Esceribe el numero del alumno
            System.out.println("Su nota:");
            double num = sc.nextDouble(); // La nota del alumno
            alumnos[i]=nombre; // Se introduce los nombres en la tabla
            notas[i]=num; // Se introduce las notas en la tabla
        }
        
        
    }
    
}
