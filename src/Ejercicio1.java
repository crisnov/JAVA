
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 * @author crist
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1; int num2; int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        
        
    }
    
}
