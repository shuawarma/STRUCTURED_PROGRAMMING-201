/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intermediate_gradethreshold;

/**
 *
 * @author joshua
 */
public class Intermediate_GradeThreshold {

    public static void main(String[] args) {

        // Student's grade and absences
        double averageGrade = 88.9;
        int absences = 3;

        // Check if the student meets the passing rules
        boolean passed = (averageGrade >= 75 && absences <= 3)
                         || (averageGrade >= 90);

        // Display the result
        System.out.println("=== Grade Threshold Checker ===");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Number of Absences: " + absences);

        if (passed) {
            System.out.println("\nResult: PASS");
            System.out.println("Reason: Grade is at least 75 and absences are 3 or fewer.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: The student does not meet the passing conditions.");
        }
    }
}