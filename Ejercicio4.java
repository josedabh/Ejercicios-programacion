/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

//Crear una tabla que contenga todos los números del 0 al 900 y mostrarla

import java.util.Arrays;

public class Ejercicio4 {
    
    public static void main(String[] args){
        
        int suma = 0;
        int num[] = new int[901];
        for(int cont=0;cont<901;cont++){
            num[cont]=suma; //Para que el cont y suma vayan sumando los numeros desde 0 hasta 901
            suma++;
        }
        System.out.println("Los numeros son " + Arrays.toString(num));
    }
}
