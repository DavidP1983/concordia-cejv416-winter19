/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repeat;

import java.text.NumberFormat;

/**
 *
 * @author D_PIRUZA
 */
public abstract class Account implements AccountConstants {
   
    
    int depositCount;
    int withdrawCount;
    double totalWithdrawAmount;
    double totalDepositAmount;
    double interestRate;
    double serviceCharge;
    double startingBalance;
    double currentBalance;
    boolean isActive;

    public Account(double interestRate, double startingBalance) {
        this.interestRate = interestRate;
        this.startingBalance = startingBalance;
    }
    
    
    public void makeDeposit(double amount)
    {
    this.currentBalance +=amount;
    this.depositCount +=1;
    this.totalDepositAmount +=amount;
    
    }
    
    
    public void makeWithdraw(double amount)
    {
    this.currentBalance -=amount;
    this.withdrawCount +=1;
    this.totalWithdrawAmount -=amount;
    }
    
    
    public void calculateInterest()
    {
    double monthlyInterestRate = this.interestRate/12;
    double monthlyInterest = monthlyInterestRate * currentBalance;
    this.currentBalance +=monthlyInterest;
    
    }
    
    public void clearAccount()
    {
    this.withdrawCount = 0;
    this.depositCount = 0;
    this.serviceCharge = 0;
    this.totalWithdrawAmount = 0;
    this.totalDepositAmount = 0;
    
    }
    
    public void doMonthlyReport()
    {
    printReport();
    this.currentBalance -=this.serviceCharge;
    this.calculateInterest();
    clearAccount();
    }
    
    
    private void printReport()
    {
    StringBuilder sb = new StringBuilder();
    NumberFormat nf  = NumberFormat.getCurrencyInstance();
    
    
    sb.append("REPORT\n");
        sb.append("------------------------\n");
        sb.append("Number deposits: ");
        sb.append(this.depositCount);
        sb.append("\n");
        sb.append("Deposit Value: ");
        sb.append(nf.format(this.totalDepositAmount));
        sb.append("\n");
        sb.append("Number withdraws: ");
        sb.append(this.withdrawCount);
        sb.append("\n");
        sb.append("Withdraw Value: ");
        sb.append(nf.format(this.totalWithdrawAmount));
        sb.append("\n");
        sb.append("Starting Balance: ");
        sb.append(nf.format(this.startingBalance));
        sb.append("\n");
        sb.append("Balance: ");
        sb.append(nf.format(this.currentBalance));
        sb.append("\n");
        sb.append("Service Charges: ");
        sb.append(nf.format(this.serviceCharge));
        sb.append("\n");
        sb.append("AccountStatus: ");
        
        sb.append(this.isActive ? "** ACTIVE **" : "** NOT ACTIVE **");
        sb.append("\n");

        System.out.println(sb.toString());
    }

}