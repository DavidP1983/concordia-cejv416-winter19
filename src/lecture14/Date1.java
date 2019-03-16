/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture14;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author D_PIRUZA
 */
public class Date1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        GregorianCalendar endDate = new GregorianCalendar(2010, 0, 1);
//        endDate.set(2010, 2, 30);
//        endDate.set(2010, Calendar.MARCH, 30);
//        endDate.set(Calendar.MONTH, Calendar.JANUARY);
//        endDate.add(Calendar.MONTH, 5);
//        endDate.roll(Calendar.MONTH, 14);
//        endDate.roll(Calendar.MONTH, true);
//        
////        endDate.add(Calendar, 0);
//        
//        System.out.println(endDate.getTime());


//        _______________________________Poluchaem den i vremya
//       Date currentDate = new Date();
//        System.out.println(currentDate.toString());
//        System.out.println(currentDate.getTime());
        

GregorianCalendar today  = new GregorianCalendar();
//int todaysYear = today.get(Calendar.YEAR);
//int todaysMonth = today.get(Calendar.MONTH)+1;
//int todaysDay = today.get(Calendar.DATE_OF_MONTH);


//Scanner sc = new Scanner(System.in);
//
//        System.out.println("Birth month: ");
//        int month = sc.nextInt();
//        
//System.out.println("Birth day: ");
//        int day = sc.nextInt();
//        
//        System.out.println("Birth year(4 digit): ");
//        int year = sc.nextInt();

Date endDate = today.getTime();
        
       
GregorianCalendar birthday = new GregorianCalendar(year, month - 1, day);
DateFormat defaultDate = DateFormat.getDateInstance();
String currentDateString = defaultDate.format(endDate);

        System.out.println(currentDateString);
    }

}
