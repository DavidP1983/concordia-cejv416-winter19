/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;

import java.text.NumberFormat;

/**
 *
 * @author D_PIRUZA
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        
      Ex product1 = new Ex("Java", "Intro to Java", 120);  
      Ex product2 = new Ex("Java", "Intro to Java", 80);  
      Ex product3 = new Ex("Android", "Intro to Mobile Development",50); 
      
      System.out.println("Product info for product #1");
        System.out.println("Code:" + product1.getCode());
        System.out.println("Description" + product1.getDescription());
        System.out.println("Price" + nf.format(product1.getPrice()) );
        
       
         System.out.println ();
        
         
         System.out.println("Product info for product #2" + "\n Code:" + product2.getCode() + "\n Description" + product2.getDescription() + "\n Price" + nf.format(product2.getPrice()) );
         
         
         System.out.println ();
         
                  
         System.out.println("Product info for product #3" + "\n Code:" + product3.getCode() + "\n Description" + product3.getDescription() + "\n Price" + nf.format(product3.getPrice()) );

         
    }
    
}
