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

    public static void main(String[] args) {
        int cont; //Creamos un contador para saber el numero de alumnos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos:");
        cont = sc.nextInt(); // Para escribir el numero de alumnos
        String alumnos[] = new String[cont]; //Tabla de los alumnos
        double notas[] = new double[cont]; // Tabla del numero de las notas de cada alumno
        for (int i = 0; i < cont; i++) { // Bucle para introducir los nombres y las notas en el array
            System.out.println("Nombre del alumno:");
            String nombre = sc.next(); // Esceribe el numero del alumno
            System.out.println("Su nota:");
            double num = sc.nextDouble(); // La nota del alumno
            alumnos[i] = nombre; // Se introduce los nombres en la tabla
            notas[i] = num; // Se introduce las notas en la tabla
        }
        System.out.println("Los alumnos son " + Arrays.toString(alumnos));
        System.out.println("Las notas son " + Arrays.toString(notas));
        double max = 0; // Valor inicial
        int posmax=0; //Posicion max
        for (int i = 0; i < cont; i++) { // Bucle que recorre el array y compara los valores
            double num = notas[i]; // Saca el numero siguiente
            if (num > max) {// Compara el ultimo y el mayor que este ahi
                max = num; // Saca el numero mayor
                posmax=i;
            }

        }
        String alumnomax = alumnos[posmax];
        System.out.println("El " + alumnomax + " saco un " + max + " siendo la mas alta");

    }

}
