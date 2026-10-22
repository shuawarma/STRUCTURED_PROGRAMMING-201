/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.advanced_patterngenerator;

/**
 *
 * @author joshua
 */
public class Advanced_PatternGenerator {

     public static void main(String[] args) {

        int size = 5;

        System.out.println("==Square Pattern Generator==");
        System.out.println();

        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip row 3
            if (row == 3) {
                continue;
            }

            for (int col = 1; col <= size; col++) {

                // BREAK: Stop the inner loop when column reaches 4
                if (col == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}