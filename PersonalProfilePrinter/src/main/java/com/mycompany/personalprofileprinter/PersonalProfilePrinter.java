/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personalprofileprinter;

/**
 *
 * @author joshua
 */
public class PersonalProfilePrinter {

     public static void main(String[] args) {

        // Variables 
        int age = 19;
        int height = 166;
        char initial = 'J';
        boolean isEnrolled = true;
        String fullName = "Joshua A. Salemo";

        // Print personal profile
        System.out.println("===== STUDENT PROFILE =====");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");
        System.out.println("Initial: " + initial);
        System.out.println("Enrollment Status: " + (isEnrolled ? "Enrolled" : "Not Enrolled"));
    }
}