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
public class class3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        
        System.out.print("Please enter your province code:)");
        Scanner sc = new Scanner(System.in);
        String print = sc.next();
        String selectedProvince = "";

        switch (print.toLowerCase()) {
            case "qc":
                selectedProvince = "Quebec";
                break;

            case "bc":
                selectedProvince = "British Columbia";
                break;

            case "mb":
                selectedProvince = "Manitoba";
                break;

//               
            default:
                selectedProvince = "??";

        }

        System.out.println("province is " + selectedProvince);
    }

}
