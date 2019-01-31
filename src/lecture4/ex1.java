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
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        for (int a = 0; a < 100 ; a++)
//        {
//            System.out.println((int)(Math.random()* 3) +1);
//        }
        int num = (int) (Math.random() * 3) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("ask number between 1 and 3 - ");
        int guess = sc.nextInt();

        if (guess == num) {
            System.out.println("Guessed cor -  ");
        }

        if (guess < num) {
            System.out.println("Too small - ");

        }
        if (guess > num) {
            System.out.println("Too large - ");

        }
        System.out.println("number was - " + num);
    }
}
