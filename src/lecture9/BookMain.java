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
public class BookMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     
        Book book1 = new Book("Star Wars Ep2", 1,  350);
//        Book book1 = new Book(null, 1,  350);
        book1.setName("Motorcycle");
        
        double borrowingCost = book1.getBookCopyPrice(1);
        double borrowingCostFor10 = book1.getBookCopyPrice(11);
         int a = 0;
        
         System.out.println("The name of the book is " + book1.getName());
    }
    
}
