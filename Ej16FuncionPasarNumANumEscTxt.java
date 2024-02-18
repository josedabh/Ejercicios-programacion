/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarrays;

import java.util.Scanner;

/*Crear una función a la que se le pase un número y devuelva dicho número
escrito en texto. Hacerlo para tres o cuatro números solamente.*/
public class Ej16FuncionPasarNumANumEscTxt {
    
    //Funcion que convierte de numero a texto del 1 al 5
    static String NumTxt(int num){ 
        switch(num){ // switch para marcar el numero del 1 al 5 en texto
            case 1:
               String uno = "uno";
               return uno;
            case 2:
                String dos = "dos";
                return dos;
            case 3:
                String tres = "tres";
                return tres;
            case 4:
                String cuatro = "cuatro";
                return cuatro;
            case 5:
                String cinco = "cinco";
                return cinco;
            default:
                String no = "Numero no encontrado";
                return no;
                
        }
    }
    
    public static void main(String[] args){
        
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 5:");
        num = sc.nextInt();
        System.out.println("Numero: " + num);
        String txt = NumTxt(num);
        System.out.println("El numero es el " + txt);
    }
    
}
