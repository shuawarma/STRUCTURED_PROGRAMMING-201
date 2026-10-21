/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expert_atmtransaction;
import java.util.Scanner;
/**
 *
 * @author joshua
 */
public class Expert_ATMTransaction {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String correctUsername = "Shuawarma";
                    int correctPIN = 2007;
                    double balance = 10000.00;
                    
                    System.out.println("=== ATM Transaction Authorizer ===");
                    
                    System.out.print("Enter username: ");
                    String username = input.nextLine();
                    
                    if (username.equals(correctUsername)) {
                        
                        System.out.print("Enter 4-digit PIN: ");
                        int pin = input.nextInt();
                        
                        if (pin == correctPIN) {
                            
                            System.out.println("\nLogin successful!");
                            System.out.printf("Account Balance: PHP %.2f%n", balance);
                            
                            // Determine the account tier based on the balance
                            String tier;
                            
                            if (balance < 5000) {
                                tier = "Basic";
                            } else if (balance < 15000) {
                                tier = "Standard";
                            } else if (balance < 30000) {
                                tier = "Premium";
                            } else {
                                tier = "VIP";
                            }

                            System.out.println("Account Tier: " + tier);
                            
                            // Set the daily withdrawal limit for each tier
                            double dailyLimit;
                            
                            switch (tier) {
                                case "Basic":
                                    dailyLimit = 2000;
                                    break;
                                case "Standard":
                                    dailyLimit = 5000;
                                    break;
                                case "Premium":
                                    dailyLimit = 10000;
                                    break;
                                default:
                                    dailyLimit = 20000;
                                    break;
                            }
                            
                            System.out.printf("Daily Withdrawal Limit: PHP %.2f%n", dailyLimit);
                            
                            System.out.print("\nEnter withdrawal amount: PHP ");
                            double withdrawal = input.nextDouble();
                            
                            // Set the transaction fee based on the account tier
                            double feeRate;
                            
                            switch (tier) {
                                case "Basic":
                                    feeRate = 0.02;
                                    break;
                                case "Standard":
                                    feeRate = 0.015;
                                    break;
                                case "Premium":
                                    feeRate = 0.01;
                                    break;
                                default:
                                    feeRate = 0.005;
                                    break;
                            }
                            
                            double fee = withdrawal * feeRate;
                            double totalDeduction = withdrawal + fee;
                            
                            // Validate the withdrawal amount
                            if (withdrawal > 0) {
                                
                                if (balance >= totalDeduction) {
                                    
                                    if (withdrawal <= dailyLimit) {
                                        
                                        if (totalDeduction <= balance) {
                                            balance -= totalDeduction;
                                            
                                            System.out.println("\n=== TRANSACTION APPROVED ===");
                                            System.out.printf("Withdrawal Amount: PHP %.2f%n", withdrawal);
                                            System.out.printf("Transaction Fee: PHP %.2f%n", fee);
                                            System.out.printf("Total Deducted: PHP %.2f%n", totalDeduction);
                                            System.out.printf("Remaining Balance: PHP %.2f%n", balance);
                                            
                                        } else {
                                            System.out.println("TRANSACTION DENIED: Insufficient balance after the transaction fee.");
                                        }
                                        
                                    } else {
                                        System.out.printf(
                                                "TRANSACTION DENIED: Your withdrawal exceeds the %s daily limit of PHP %.2f.%n",
                                                tier, dailyLimit
                                        );
                                    }
                                    
                                } else {
                                    System.out.println("TRANSACTION DENIED: Insufficient balance to cover the withdrawal and fee.");
                                }
                                
                            } else {
                                System.out.println("TRANSACTION DENIED: Withdrawal amount must be greater than zero.");
                            }
                            
                        } else {
                            System.out.println("LOGIN DENIED: Incorrect PIN.");
                        }

                    } else {
                        System.out.println("LOGIN DENIED: Username not found.");
                    }
        }
    }
}

