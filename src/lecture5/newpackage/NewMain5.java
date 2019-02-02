/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5.newpackage;
import java.util.Scanner;
/**
 *
 * @author D_PIRUZA
 */
public class NewMain5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int num1 =(int) (Math.random()*20);
         int num2 =(int) (Math.random()*20);        
        
        System.out.println("What is "  + num1 + " + " + num2 + " ? ");
        
        Scanner sc = new Scanner(System.in);
        
        int result = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + result  + " is " );
        
//        System.out.print(num1 + num2==result);

        System.out.println (num1+num2==result? "TRUE!" : "FALSE! :(");       
        
    }
    
}
