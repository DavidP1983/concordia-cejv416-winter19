/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11;

/**
 *
 * @author D_PIRUZA
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Car c = new Car(50,2000,"Silver",false);
        
        Bus b = new Bus (125, 8000, "Yellow");
        
        Truck t = new Truck (200, 15000, "Black", true);
        
        System.out.println(c.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());
    }
    
}
