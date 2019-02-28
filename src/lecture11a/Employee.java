/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11a;

/**
 *
 * @author D_PIRUZA
 */
public class Employee {
   
    static int lastId = 0;
    
    int id;
    String firstName;
    String lastName;
    double salary;
    
//    id omitted

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        
        this.id = Employee.lastId + 1;
        
        Employee.lastId= this.id;


//          this.id = ++Employee.lastId;
    }
    
}
