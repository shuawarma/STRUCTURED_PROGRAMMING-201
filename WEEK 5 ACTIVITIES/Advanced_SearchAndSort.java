/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.advanced_searchandsort;

/**
 *
 * @author joshua
 */
public class Advanced_SearchAndSort {

    public static void main(String[] args) {

        int[] scores = {86, 91, 75, 94, 85, 78, 99, 80};

        int target = 99;
        int foundIndex = -1;

        // Linear Search
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("=== SEARCH RESULTS ===");

        if (foundIndex != -1) {
            System.out.println("Score " + target
                    + " was found at index " + foundIndex + ".");
        } else {
            System.out.println("Score " + target + " was not found.");
        }

        // Copy the original scores into another array
        int[] sortedScores = new int[scores.length];

        System.arraycopy(scores, 0, sortedScores, 0, scores.length);

        // Sort scores from lowest to highest using Bubble Sort
        for (int i = 0; i < sortedScores.length - 1; i++) {
            for (int j = 0; j < sortedScores.length - 1 - i; j++) {

                if (sortedScores[j] > sortedScores[j + 1]) {
                    int temp = sortedScores[j];
                    sortedScores[j] = sortedScores[j + 1];
                    sortedScores[j + 1] = temp;
                }
            }
        }

        // Display original scores
        System.out.println("\n=== ORIGINAL SCORES ===");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);

            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }

        // Display sorted scores
        System.out.println("\n\n=== SORTED SCORES ===");
        for (int i = 0; i < sortedScores.length; i++) {
            System.out.print(sortedScores[i]);

            if (i < sortedScores.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
