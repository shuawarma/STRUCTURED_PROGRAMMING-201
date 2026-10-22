/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intermediate_sentinelvalue;
 import java.util.Scanner;
/**
 *
 * @author joshua
 */
public class Intermediate_SentinelValue {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            int total = 0;
            
            System.out.println("== Sum Until Sentinel Value ==");
            
            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();
            
            while (number != -1) {
                total += number;
                
                System.out.print("Enter a number (-1 to stop): ");
                number = input.nextInt();
            }
            
            System.out.println("Final Total: " + total);
        }
    }
}