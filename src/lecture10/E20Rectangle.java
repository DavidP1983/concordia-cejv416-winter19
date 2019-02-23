/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture10;

import java.util.Date;

/**
 *
 * @author D_PIRUZA
 */
public class E20Rectangle extends GeometricObject {
    
     private double width = 1;
     private double lenght = 1;

    
     public E20Rectangle() {
    }

    public E20Rectangle(double width, double lenght) {

        this.width = width;
        this.lenght = lenght;
    }
  

    public E20Rectangle(String color, boolean filled, Date dateCreated,double width, double length) {
        super(color, filled, dateCreated);
         this.width = width;
         this.lenght = lenght;
        
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
    
}
