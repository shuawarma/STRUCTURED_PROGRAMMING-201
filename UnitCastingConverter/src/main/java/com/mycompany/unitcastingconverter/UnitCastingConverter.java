/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitcastingconverter;
import java.util.Scanner;
/**
 *
 * @author joshua
 */
public class UnitCastingConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Unit Casting Converter
        System.out.print("Enter centimeters: ");
        double centimeters = input.nextDouble();

        int meters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println("\n=== Unit Casting Converter ===");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining centimeters: " + remainingCentimeters);

        // Implicit widening: int to double
        // java does this automatically, so i don't need to cast it.
        System.out.print("\nEnter an integer for widening: ");
        int number = input.nextInt();
        double widenedNumber = number;

        System.out.println("\n=== Implicit Widening ===");
        System.out.println("Integer value: " + number);
        System.out.println("Double value: " + widenedNumber);

        // Explicit narrowing: double to int
        // The decimal part will be removed when i cast it to int
        System.out.print("\nEnter a decimal number for narrowing: ");
        double decimalNumber = input.nextDouble();
        int narrowedNumber = (int) decimalNumber;

        System.out.println("\n=== Explicit Narrowing ===");
        System.out.println("Double value: " + decimalNumber);
        System.out.println("Integer value: " + narrowedNumber);

        input.close();
    }
}
