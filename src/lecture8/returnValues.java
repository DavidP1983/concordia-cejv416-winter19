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
public class returnValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
      System.out.println(max(5, 1, 10));
        
        
    }
  
    
    public static int max(int a, int b, int c)
    {
    
    if (a >b && a> c)
    {
    return a;
    }
  if (b >a && b > c)
  {
      return b;
  }
    
  if (c >a && c> b)
  {
  return c;
  }
  return a;
    }
    
}
