/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture10;

import java.text.NumberFormat;

/**
 *
 * @author D_PIRUZA
 */
public class RectangleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        
        
        System.out.println("Information for Rectangle 1");
        printInfo (" Width", rect1.getWidth());
        printInfo ("Length", rect1.getLenght());
        printInfo ("Area", rect1.getArea());
        printInfo ("Perimeter", rect1.getPerimeter());
    
        
         System.out.println("Information for Rectangle 2");
        printInfo (" Width", rect2.getWidth());
        printInfo ("Length", rect2.getLenght());
        printInfo ("Area", rect2.getArea());
        printInfo ("Perimeter", rect2.getPerimeter());
        
        
    }
    
    
   
    
//    to write  System.out.println faster, numberFormat
     public static void printInfo (String text, double value)
     {
         
      NumberFormat nf = NumberFormat.getNumberInstance();
     System.out.println (text + " : " + nf.format(value));
     
     }
    
}
