/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repeat;

import static Repeat.AccountConstants.OVERDRAW_PENALTY;

/**
 *
 * @author D_PIRUZA
 */
public class CheqingAccount extends Account {

    public CheqingAccount(double interestRate, double startingBalance) {
        super(interestRate, startingBalance);
    }

    
    @Override
    public void doMonthlyReport() {
        this.serviceCharge +=5.00;
        this.serviceCharge += (.10 * this.withdrawCount);
        
        super.doMonthlyReport(); 
    }

    
    
    @Override
    public void makeWithdraw(double amount) {
        if((this.currentBalance - amount)< 0)
        {
        this.currentBalance -= OVERDRAW_PENALTY;
            System.out.println("Account OverDraw - Withdraw cancelled. ");
        }
        
        else
        {        
        super.makeWithdraw(amount); 
        }
    
    
}
    
 }
