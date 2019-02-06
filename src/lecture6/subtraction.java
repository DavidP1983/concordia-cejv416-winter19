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
public class subtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1 = (int)(Math.random()*10);
       int num2 = (int)(Math.random()*10);
       int a = Math.max(num1,num2);
       int b = Math.min(num1,num2);
       System.out.println("What is " + a + " - " + b + " ? ");
       Scanner sc = new Scanner(System.in);
       int result = sc.nextInt();
     
       System.out.println(a + " - " +  b + " = " + result);
       System.out.println(a-b==result ? "True:)": "False:(");
        
    }
    
}
