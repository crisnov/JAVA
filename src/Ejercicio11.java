
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
* MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * @author crist
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion; int num1; int num2;
        String a;
        
        while(!salir) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una de las opciones");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un numero entero: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese otro numero entero: ");
                    num2 = leer.nextInt();
                    System.out.println("La suma es: " + (num1+num2));        
                    break;
                case 2:
                    System.out.println("Ingrese un numero entero: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese otro numero entero: ");
                    num2 = leer.nextInt();
                    System.out.println("La resta es: " + (num1-+num2));
                    break;
                case 3:
                    System.out.println("Ingrese un numero entero: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese otro numero entero: ");
                    num2 = leer.nextInt();
                    System.out.println("La multiplicación es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("Ingrese un numero entero: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese otro numero entero: ");
                    num2 = leer.nextInt();
                    System.out.println("La división es: " + (num1/num2));
                    break;
                case 5:                    
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)?");
                    a = leer.next();
                    if (a.equals("S")) {
                        salir = true;
                        break;
                    } else {
                        salir = false;
                        break;
                    }   
            }
        }
    }
}       