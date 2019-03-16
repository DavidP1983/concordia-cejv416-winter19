/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture14;

/**
 *
 * @author D_PIRUZA
 */
public class Exercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String fullName = "Alice Smith";
         int indexOfspace = fullName.indexOf(" ");
        
        String fName = fullName.substring(0,indexOfspace);
        String lName = fullName.substring(indexOfspace + 1);
        
        System.out.println(fName);
        System.out.println(lName);
        
    }
    
}
