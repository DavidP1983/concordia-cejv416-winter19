/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7;

/**
 *
 * @author D_PIRUZA
 */
public class c7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       System.out.println("The average " + getAverage (5,9));
       System.out.println("The average " + getAverage (5.23,9));
       
    }
    
     public static double getAverage(int num1, int num2)
     {
     System.out.println("I ran the int version");
     return ((double)num1 + num2)/2;
     }
     
     public static double getAverage(double num1, double num2)
     {      
         System.out.println("I ran the double version");   
         return ((double)num1 + num2)/2;
     }
     
      
     
     
}  

       
       
    

