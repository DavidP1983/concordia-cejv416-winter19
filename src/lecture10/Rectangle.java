/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture10;

/**
 *
 * @author D_PIRUZA
 */
public class Rectangle {

    private double width = 1;
    private double lenght = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {

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

//    calculation
    public double getArea() {
        return this.width * this.lenght;

    }

    public double getPerimeter() {
        return (this.width + this.lenght) * 2;

    }

}
