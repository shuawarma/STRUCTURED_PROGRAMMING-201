/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expert_classranking;

/**
 *
 * @author joshua
 */
public class Expert_ClassRanking {

    static class Student {
        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {
            int sum = 0;

            for (int score : quizzes) {
                sum += score;
            }

            return (double) sum / quizzes.length;
        }
    }

    public static void main(String[] args) {

        System.out.println("== CLASS RANKING SYSTEM ==");

        int[][] quizData = {
            {95, 80, 90, 99},
            {75, 95, 89, 95},
            {89, 88, 90, 90},
            {91, 79, 91, 95},
            {82, 83, 87, 80}
        };

        String[] names = {
            "Joshua", "Jann", "Jannah", "Jedric", "Jonna"
        };

        Student[] students = new Student[quizData.length];

        // Create Student objects
        for (int i = 0; i < quizData.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Sort using bubble sort
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display leaderboard
        System.out.println("\n== LEADERBOARD ==");
        System.out.printf("%-8s %-12s %-10s%n",
                "RANK", "NAME", "AVERAGE");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].getAverage()
                    == students[i - 1].getAverage()) {
                // Same rank for tied averages
            } else {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                    rank, students[i].name,
                    students[i].getAverage());
        }

        // Linear search for a student
        String searchName = "Jedric";
        int foundRank = -1;
        int currentRank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].getAverage()
                    != students[i - 1].getAverage()) {
                currentRank = i + 1;
            }

            if (students[i].name.equalsIgnoreCase(searchName)) {
                foundRank = currentRank;
                break;
            }
        }

        // Display search result
        System.out.println("\n== SEARCH RESULT ==");

         if (foundRank != -1) {
            System.out.println(searchName + "'s rank is: " + foundRank);
        } else {
            System.out.println(searchName + " was not found.");
        }
    }
}


    

