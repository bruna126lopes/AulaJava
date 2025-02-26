/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bruna.metodo;

import java.util.Scanner;

/**
 *
 * @author BRUNA_4823
 */
public class DigitarScanner {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro valor");
        int number1 = x.nextInt();
        
         System.out.println("Digite o segundo valor");        
         int number2 = x.nextInt();
         
         int resultado = number1 + number2;
         
         System.out.println("O valor da soma é: "+ resultado);
                
                
    }
 
}
