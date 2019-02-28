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
public class Truck extends Vehicle {
  
    
    private boolean hasTrailer;

    public Truck(double fuelCapacity, double weight, String color, boolean hasTrailer) {
        super(fuelCapacity, weight, color);
        this.hasTrailer = hasTrailer;
    }
    
    public double getDistance ()  {
 
 return super.getDistance()-250;
 
 }  
 
    public String toString(){
    
    return " My class type is " + getClass().getSimpleName() + " my color is " + this.color + " and my weight is " + this.weight;
    }
    
    
}
