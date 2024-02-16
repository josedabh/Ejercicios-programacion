/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarrays;

import java.util.Arrays;

//Ordenar la siguiente tabla [5,7,8,4,3,6,0,0,8,1] de menor a mayor.

public class Ej2ordenarTabla {

    public static void main(String[] args) {
        
        int num []= {5,7,8,4,3,6,0,0,8,1};
        Arrays.sort(num); //Comando para ordenar los numeros de menor a mayor
        System.out.println(Arrays.toString(num));
    }
    
}
