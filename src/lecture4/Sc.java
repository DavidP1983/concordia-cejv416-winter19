/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;
import java.util.Scanner;
/**
 *
 * @author D_PIRUZA
 */
public class Sc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        double d = sc.nextDouble();
        System.out.println(d);
        
        System.out.println("Enter your Name >");
        
        String userName = sc.next();
        System.out.println("Hello," + userName);
        
        
        
    }
    
}
