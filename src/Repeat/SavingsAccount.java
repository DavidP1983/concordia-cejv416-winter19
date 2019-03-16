/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repeat;

/**
 *
 * @author D_PIRUZA
 */
public class SavingsAccount extends Account {

    public SavingsAccount(double interestRate, double startingBalance) {
        super(interestRate, startingBalance);
    }

    @Override
    public void doMonthlyReport() {
        if (this.withdrawCount>4)
        {
        this.serviceCharge += (this.withdrawCount - 4);
        }
        
        super.doMonthlyReport(); 
    }

    
    
    
    @Override
    public void calculateInterest() {
        super.calculateInterest(); 
    }

    
    
    
    @Override
    public void makeWithdraw(double amount) {
       
        if ((this.currentBalance - amount) <25)
        {
        this.isActive = false;
        }
        if(this.isActive)
        {
        super.makeWithdraw(amount);
        }
    }

    
    
    
    @Override
    public void makeDeposit(double amount) {
        if(!this.isActive && (this.currentBalance + amount >25))
        {
        this.isActive = true;
        }
        super.makeDeposit(amount);
    }
    
    
    
    
    
}
