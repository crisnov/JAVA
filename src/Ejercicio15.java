
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author crist
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5]; int num; String aux="";
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++){
            
            System.out.println("Ingrese un valor para la posicion: " + i );
            
            num = leer.nextInt();
            
            if (num >= 0 && num <= 5){
                vector[i] = num;
                System.out.println("v["+i+"]= "+num );
            }
            
        }
        System.out.println("------------:");
        System.out.println("* Vector:");
            for (int elemento: vector) {
                aux = aux + " | " + elemento;
            }
            System.out.println(aux);
        
    }
    
}
