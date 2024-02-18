/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Scanner;

/*Desarrolla el cuerpo de la siguiente función
static void annadirEstrella (string seleccion, string estrellas)
donde, en el caso de que los parámetros de entrada sean "Argentina" y "**"
le añade una estrella a dicha selección y muestre el número de estrellas. */
public class Ej15PonerEstrellas {
    
    //Funcion que cuenta las estrellas, añade y dice el numero
    static void annadirEstrella (String seleccion, String estrellas){
        int cont = 0;
        char star = '*'; //Para contar de estrella a estrella
        for (int i = 0; i < estrellas.length(); i++) { // Bucle para contar el numero de estrella
            if (estrellas.charAt(i) == star) { // Compara estrella por estrella
                cont++;
            }
        }
        System.out.println("Habia " + cont + " estrellas");
        cont++; //Para que añada la estrella
        System.out.println("Ahora hay con la estrella añadida " + cont + " estrellas");
    }
    
    public static void main(String[] args){
        
        String seleccion,estrellas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la seleccion:");
        seleccion = sc.next();
        System.out.println("Cuantas estrellas tiene (*):");
        estrellas = sc.next();
        annadirEstrella(seleccion,estrellas);
    }
}
