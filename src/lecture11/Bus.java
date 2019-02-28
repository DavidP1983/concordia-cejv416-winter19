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
public class Bus extends Vehicle {

    public Bus(double fuelCapacity, double weight, String color) {
        super(fuelCapacity, weight, color);
    }
    
 public double getDistance ()  {
 
 return super.getDistance()-100;
 
 }  
  public String toString(){
    
    return "My class type is Bus,my color is " + this.color + "and my weight is" + this.weight;
    }
 
 
 
}
