/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao3;

import java.util.Scanner;

/**
 *
 * @author Mirian Marcio Diogo
 */
public class Revisao3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double Far; 
        
        System.out.println("Digite uma temperatura em celcius");
        int Cel = scan.nextInt();
        
        Far = Cel * 1.8 + 32;
        
        System.out.println(Cel + "C° em fahrenheit é: " + Far + "F°");
        
    }
    
}
