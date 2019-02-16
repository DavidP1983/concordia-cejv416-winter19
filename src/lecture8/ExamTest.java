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
public class ExamTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 1;
        
        String s = new String();
        
        
        Exam e1 = new Exam(85.0, 89.0, 99.0);
        Exam e2 = new Exam(50.0, 60.0, 65.0);
        
        System.out.println("The average of e1 is " + e1.getAverage());
        System.out.println("The average of e2 is " + e2.getAverage());
        
        if (e1.isAPass())
        {
        System.out.println("Exam 1 Passed");
        }
        
        else 
        {
        System.out.println("Exam 1 Failed");
        }
        
        if (e2.isAPass())
        {
        System.out.println("Exam 2 Passed");
        }
        else
        {
        System.out.println("Exam 2 Failed");
        }
        
    }
    
}
