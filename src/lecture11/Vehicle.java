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
public class Vehicle {
    
    protected double fuelCapacity;
    protected double weight;
    protected String color;

//    public Vehicle (){
//        
//    }

    public Vehicle(double fuelCapacity, double weight, String color) {
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
        this.color = color;
    }

    protected double getDistance (){
    
    return this.fuelCapacity*10.00;
    }
   
    
    
    
    
}
