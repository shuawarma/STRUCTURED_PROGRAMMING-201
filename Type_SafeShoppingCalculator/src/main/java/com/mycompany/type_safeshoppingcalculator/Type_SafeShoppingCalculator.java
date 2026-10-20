/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.type_safeshoppingcalculator;

/**
 *
 * @author joshua
 */
public class Type_SafeShoppingCalculator {
    public static void main(String[] args) {
        
        // Variables
        int quantity = 5;
        double unitPrice = 50.50;
        String storeName = "Shuawarma";

        // Calculate the total cost
        double totalCost = quantity * unitPrice;

        // Print the shopping summary
        System.out.println("===== Order Summary =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Cost: PHP " + totalCost);

        // totalCost should not be declared as an int because it only stores whole numbers. Using double allows it to store decimal values, which are needed when calculating prices with centavos.
    }
}
