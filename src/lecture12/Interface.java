/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture12;

/**
 *
 * @author D_PIRUZA
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Book book1 = new Book("Dune", 1234);
        Book book2 = new Book("Dune", 1234);
        Book book3 = new Book("the Joy of Cooking", 1234);

        if (book1.equals(book2)) {
            System.out.println("Book1 = Book2");

        } else {

            System.out.println("Book1 not = Book2");
        }

        if (book2.equals(book3)) {

            System.out.println("Book2  = Book3");

        } else {
            System.out.println("Book2 not = Book3");

        }

    }

}
