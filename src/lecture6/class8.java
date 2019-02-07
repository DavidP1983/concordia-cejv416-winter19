/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture6;

import java.util.Scanner;

/**
 *
 * @author D_PIRUZA
 */
public class class8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        double num1 =(int) (Math.random()*10 +1);
         double num2 =(int) (Math.random()*10 +1); 
         
         
         Scanner s = new Scanner (System.in);
         boolean correctResponse;
         
         do
         {
         System.out.println("What is" +  num1 + "+" + num2 + "?");
         double answer = s.nextDouble();         
         correctResponse = (answer== num1 +num2);
      
         }while (!correctResponse);
         
         System.out.println("Correct!");
    }
    
}
