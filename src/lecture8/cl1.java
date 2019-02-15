/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

/**
 *
 * @author D_PIRUZA
 */
public class cl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int a = 1; int b = 10;
       System.out.println("Sum of numbers from" + a + " to " + b + " is " + addNumbers(a, b));
        
    
        
    }
   public static int addNumbers(int rangeStart, int rangeEnd)  
   {
   int runningSum = 0;
   for (int x = rangeStart; x <= rangeEnd; x++)
   {
   runningSum += x;
   }
   return runningSum;
   }
}
