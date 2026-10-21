/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.advanced_loginvalidator;
import java.util.Scanner;
/**
 *
 * @author joshua
 */
public class Advanced_LoginValidator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String correctUsername = "Shuawarma";
            String correctPassword = "123456";
            boolean accountLocked = false;
            
            System.out.println("=== Nested Login Validator ===");
            
            System.out.print("Enter username: ");
            String username = input.nextLine();
            
            if (username.equals(correctUsername)) {
                
                System.out.print("Enter password: ");
                String password = input.nextLine();
                
                if (password.equals(correctPassword)) {
                    
                    if (!accountLocked) {
                        System.out.println("Login successful! Welcome, " + username + ".");
                    } else {
                        System.out.println("Login failed: Your account is locked.");
                    }
                    
                } else {
                    System.out.println("Login failed: Incorrect password.");
                }

            } else {
                System.out.println("Login failed: Username not found.");
            }
        }
    }
}