/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture12a;

/**
 *
 * @author D_PIRUZA
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] myGrades = {77, 88, 55, 99};
//        myGrades[2]=60;
//        
//        
//        System.out.println("The first grade is " + myGrades[0]);

        for (int x = 0; x <= myGrades.length - 1; x++) {

            System.out.println("The grade is " + myGrades[x]);

        }
        
        for (int a : myGrades)
        {
        
                    System.out.println("My other grade is " + a);

        }
    }

}
