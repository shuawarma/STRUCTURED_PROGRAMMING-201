/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intermediate_statisticscalculator;

/**
 *
 * @author joshua
 */
public class Intermediate_StatisticsCalculator {

     public static void main(String[] args) {

        // Student scores
        int[] scores = {86, 91, 75, 94, 85, 78, 99, 80};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Calculate sum, highest, and lowest scores
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Calculate average
        double average = (double) sum / scores.length;

        // Display results
        System.out.println("=== CLASS STATISTICS ===");
        System.out.println("Total Students: " + scores.length);
        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
