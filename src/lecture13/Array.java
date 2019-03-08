/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

/**
 *
 * @author D_PIRUZA
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Book[] bookAarray = new Book[3];

        bookAarray[0] = new Book(" SQL ", 1234);
        bookAarray[1] = new Book(" HTML&SCC ", 2345);
        bookAarray[2] = new Book(" Java ", 3456);

        for (Book b : bookAarray) {

//            System.out.println("Book name is :" + b.getName());
//            System.out.println("ISBN is :" + b.getISBN());

            System.out.println(b.toString());
        }

    }

}
