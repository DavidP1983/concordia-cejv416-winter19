/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture6;

import java.util.Scanner;

/**
 *
 * @author D_PIRUZA
 */
public class class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your height in 'm': ");
        double height = sc.nextDouble();

        System.out.println("enter your weight in 'kg': ");
        double weight = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
