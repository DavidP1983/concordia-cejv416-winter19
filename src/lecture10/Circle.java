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
public class Circle extends GeometricObject {

    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, Date dateCreated, double radius) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }

    public double getDiameter() {

        return this.radius * 2;
    }

    public double getPerimeter() {

        return 2 * Math.PI * this.radius;
    }

    public String toString () 
    {

    StringBuilder sb  = new StringBuilder();
    sb.append("I am a circle\n");
    sb.append("My radius is " + this.radius);
    sb.append(" My color is " + this.color);
            

    return sb.toString();
    }
    
}
