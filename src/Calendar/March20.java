/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author D_PIRUZA
 */
public class March20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar bday = new GregorianCalendar();

        System.out.println("Enter birth year: ");
        bday.set(Calendar.YEAR, sc.nextInt());

        System.out.println("Enter birth month: ");
        bday.set(Calendar.MONTH, sc.nextInt()-1 );

        System.out.println("Enter birth day: ");
        bday.set(Calendar.DAY_OF_MONTH, sc.nextInt());

        int todaysYear = today.get(Calendar.YEAR);
        int todaysMonth = today.get(Calendar.MONTH);
        int todaysDay = today.get(Calendar.DAY_OF_MONTH);

        int birthYear = bday.get(Calendar.YEAR);
        int birthMonth = bday.get(Calendar.MONTH);
        int birthDay = bday.get(Calendar.DAY_OF_MONTH);

        System.out.println("Current date =  " + today.getTime().toString());
        
        int age = todaysYear - birthYear;
        if (todaysYear < birthYear) {
            age -= 1;
        }
        if (todaysMonth == birthMonth && todaysDay < birthDay) {
            age -= 1;
        }
        
//        Date birthDate = bday.getTime();
//        
//        
//        System.out.println("Your birth date is " +birthDate.toString());
System.out.println("Your birth date is " + bday.getTime().toString());
        System.out.println("Your age is " + age);

        
        
          
    }

}
