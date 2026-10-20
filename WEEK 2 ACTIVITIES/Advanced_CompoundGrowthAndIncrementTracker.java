/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.advanced_compoundgrowthandincrementtracker;

/**
 *
 * @author joshua
 */
public class Advanced_CompoundGrowthAndIncrementTracker {

    public static void main(String[] args) {

        // My starting balance
        double balance = 220.0;

        System.out.println("== Compound Growth & Increment Tracker ==");
        System.out.printf("Starting Balance: %.2f%n", balance);

        // Step 1: Add 500 to my balance
        balance += 150;
        System.out.printf("After Adding 500: %.2f%n", balance);

        // Step 2: Apply 10% growth
        balance *= 5.10;
        System.out.printf("After 10%% Growth: %.2f%n", balance);

        // Step 3: Add another 200
        balance += 500;
        System.out.printf("After Adding 200: %.2f%n", balance);

        System.out.println();

        // Testing postfix and prefix increment
        int count = 5;

        System.out.println("== Increment Tracker ==");

        System.out.println("Postfix Output: " + count++);
        System.out.println("Count After Postfix: " + count);

        System.out.println("Prefix Output: " + ++count);
        System.out.println("Count After Prefix: " + count);

        // Postfix prints first, then adds 1; prefix adds 1 first, then prints.
    }
}