/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repeat;

import java.util.Scanner;

/**
 *
 * @author D_PIRUZA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static StringBuilder sb = new StringBuilder();
    private static Scanner sc = new Scanner(System.in);

    private static CheqingAccount cheqingAccount = new CheqingAccount(.01, 0);
    private static SavingsAccount savingsAccount = new SavingsAccount(.05, 0);

    public static void main(String[] args) {
        String choice = "";

        do {
            displayMainMenu();

            choice = sc.next().toUpperCase().trim();
            switch (choice) {
                case "A":
                    displayAccountMenu(savingsAccount);
                    break;

                case "B":
                    displayAccountMenu(cheqingAccount);
                    break;

                case "C":
                    System.out.println("Thanks for banking today");
                    break;

                default:
                    System.out.println("Sorry your choice is invalid");
                    break;
            }
            
        } while (!choice.equals("C"));
    }

    private static void displayMainMenu() {
        sb.setLength(0);
        sb.append("Bank Menu\n");
        sb.append("-----------\n");
        sb.append("A)Saving\n");
        sb.append("B)Cheqing\n");
        sb.append("C)Exit\n");

        System.out.println(sb.toString());
    }

    
    private static void displayAccountMenu(Account account) {
    
        String menuType = " ";

        if (account instanceof CheqingAccount) {
            menuType = "Checking";
        }

        if (account instanceof SavingsAccount) {
            menuType = "Saving";
        }

        String choice;

        do {
            sb.setLength(0);
            sb.append(menuType);

                        
            sb.append("Menu");
            sb.append("--------\n");
            sb.append("A)Deposit\n");
            sb.append("B)Withdraw\n");
            sb.append("C)Report(Close)\n");
            sb.append("D)Back to Main\n");

            System.out.println(sb.toString());
            choice = sc.next().toUpperCase().trim();

            if (choice.equals("A")) {
                System.out.println("How much would you like to deposit? ");
                double amount = sc.nextDouble();
                account.makeDeposit(amount);
            }

            if (choice.equals("B")) {
                System.out.println("How much would you like to withdraw? ");
                double amount = sc.nextDouble();
                account.makeDeposit(amount);

            }

            if (choice.equals("C")) {
                account.doMonthlyReport();
            account.startingBalance = account.currentBalance;    
            }

            if (!choice.equals("A") && !choice.equals("B") && !choice.equals("C")) {
                System.out.println("The command is not recognized. ");
            }
        }

            while (!choice.equals("D"));
        }
   }

