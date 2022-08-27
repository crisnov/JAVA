
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author crist
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num =99999;
        
       // System.out.println((Math.abs(num))); //valor absoluto del numero por si es negativo
       // System.out.println((Math.log10(Math.abs(num))+1 )); //conocer la base del numero y sumarle 1 por si es cero
        
        if (num == 0) {
            num++;
        }
        
        System.out.println(Math.floor(Math.log10(Math.abs(num)) + 1));
        
        
    }
    
}
