/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expert_preceddencepuzzlesolver;

/**
 *
 * @author joshua
 */
public class Expert_PreceddencePuzzleSolver {

    public static void main(String[] args) {

        System.out.println("=== Precedence Puzzle Solver ===");

        // PROBLEM 1
        int a = 7;
        int b = 2;
        int score = 4;

        System.out.println("\n--- Problem 1 ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("score = " + score);

        // Expression: (a + b * 2 > 12) && (score++ == 4)
        // PREDICTED RESULT: true
        System.out.println("Problem: (a + b * 2 > 12) && (score++ == 4)");
        System.out.println("Actual Result: " +
                ((a + b * 2 > 12) && (score++ == 4)));


        // PROBLEM 2
        a = 27;
        b = 9;
        score = 7;

        System.out.println("\n--- Problem 2 ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("score = " + score);

        // Expression: (a / b == 3) || (--score < 6)
        // PREDICTED RESULT: true
        System.out.println("Problem: (a / b == 3) || (--score < 6)");
        System.out.println("Actual Result: " +
                ((a / b == 3) || (--score < 6)));


        // PROBLEM 3
        a = 15;
        b = 3;
        score = 6;

        System.out.println("\n--- Problem 3 ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("score = " + score);

        // Expression: (a % b == 0) && (score-- > 5)
        // PREDICTED RESULT: true
        System.out.println("Problem: (a % b == 0) && (score-- > 5)");
        System.out.println("Actual Result: " +
                ((a % b == 0) && (score-- > 5)));
    }
}
