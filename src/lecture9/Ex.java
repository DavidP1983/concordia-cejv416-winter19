/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;

/**
 *
 * @author D_PIRUZA
 */
public class Ex {
  
    private String code;
    private String description;
    private double price;

    public Ex() {
    }

    public Ex(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }
    
       public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

    
 
    
    
}
