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
public class c5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
       
    {   
        
       printStars (  5);  
       printStars (  2);  
       printStars (  9);  
    }
   
     public static void printStars(int numberStars)
     {
     for (int x= 1; x<= numberStars; x++)
     {
     System.out.print("*");
     }
     
     System.out.println(" ");
     }
    
}
