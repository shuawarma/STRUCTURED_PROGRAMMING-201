/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basic_fourfunctioncalculator;
import java.util.Scanner;

/**
 *
 * @author joshua
 */
public class Basic_FourFunctionCalculator {
  
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("==Four-Function Calculator==");
            
            // Input two integers
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            
            // Arithmetic operations
            System.out.println("\nAddition: " + (num1 + num2));
            System.out.println("Subtraction: " + (num1 - num2));
            System.out.println("Multiplication: " + (num1 * num2));
            
            // Division and modulus can give different results when using negative numbers.
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        }
    }
}