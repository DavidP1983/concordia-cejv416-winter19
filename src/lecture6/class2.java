/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture6;

/**
 *
 * @author D_PIRUZA
 */
public class class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double smallRaisePercentage = 1.02;
        final double largeRaisePercentage = 1.10;
        final int cutOffExp = 10;

        double salary = 10000;
        
        int yearsExp = 20;
//        salary *= yearsExp > 10 ? 1.5 : 2.00;
        
        System.out.println(yearsExp >cutOffExp ? salary*largeRaisePercentage : smallRaisePercentage);

    }

}
