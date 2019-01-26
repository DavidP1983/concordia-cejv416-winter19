/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.text.NumberFormat;
/**
 *
 * @author D_PIRUZA
 */
public class cal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double pi = 3.14159;
      NumberFormat formatter = NumberFormat.getNumberInstance();
      formatter.setMaximumFractionDigits(1);
      
      String my_result = formatter.format(pi);
      System.out.println(my_result);
      
      formatter.setMaximumFractionDigits(3);
      my_result = formatter.format(pi);
      System.out.println(my_result);
      
      
      
      
    }
    
}
