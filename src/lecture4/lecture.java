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
public class lecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int c = 150;
        int a = 231;
        int B = 123;
//        
//        double andRad = B * (Math.PI/ 180);
//        double area = ((double)1/2)*c*a*Math.sin(andRag);
//System.out.println(Math.round(area));
//        
        double pi = Math.PI ;
        double radians = 123 *(pi/180);
        double area = Math.round((c*a*Math.sin(radians))/2);
        System.out.println("result " + area);
       

    }
    
}
