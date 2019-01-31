/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author D_PIRUZA
 */
public class lecture4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      try 
      {
          System.out.println("I just \nopened a \"file\"."); 
        String inputVal = "2x";
        int x = 7/0;
        int val = Integer.parseInt(inputVal);
        
      }
       catch(NumberFormatException myExeptionDetails)
       {
       System.out.println("The value could not be parsed!"); 
      }
      catch(Exception myExceptionDetails)
      {
        System.out.println("General error occurred"); 
        System.out.println("Here is what happened"); 
        System.out.println("General error occurred"); 
   
      }
        
    }
    
}
