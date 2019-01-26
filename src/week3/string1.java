/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author D_PIRUZA
 */
public class string1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int first = 14;
       int second = 4;
       
       String firstString = Integer.toString(first);
       String secondString = Integer.toString(second);
       System.out.println(firstString + "+" + secondString + " is " + (first + second));
       System.out.println(firstString + "*" + secondString + " is " + (first * second));
       System.out.println(firstString + "%" + secondString + " is " + (first % second));
       System.out.println(firstString + "/" + secondString + " is " + (first / second));

       
    }
    
}
