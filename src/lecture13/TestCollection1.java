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
public class TestCollection1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BooShelf sb = new BooShelf();

        Book book1 = new Book("SQL", 201);
        Book book2 = new Book("HTML", 457);
        Book book3 = new Book("JAVA", 351);

        sb.addBook(book1);
        sb.addBook(book2);
        sb.addBook(book3);
        
        sb.removeBook(book2);
        System.out.println(sb.listBooks());
    }

}
