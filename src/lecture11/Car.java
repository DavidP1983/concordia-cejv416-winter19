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
public class Car extends Vehicle {
    
    private boolean hasHitch;

    public Car( double fuelCapacity, double weight, String color,boolean hasHitch) {
        super(fuelCapacity, weight, color);
        this.hasHitch = hasHitch;
    }
    
    public double getDistance (){
        
        return super.getDistance();
    }
    
     public String toString(){
    
    return "My class type is Car,my color is " + this.color + "and my weight is" + this.weight;
    }
}
