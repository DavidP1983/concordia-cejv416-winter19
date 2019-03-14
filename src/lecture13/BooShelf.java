/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import java.util.ArrayList;

/**
 *
 * @author D_PIRUZA
 */
public class BooShelf {

    ArrayList<Book> books = new ArrayList<>();

//    pervii method
    public int getSize() {
        return this.books.size();
    }

//    add book
    public void addBook(Book b) {
        this.books.add(b);
    }

    public void removeBook(Book b) {
        this.books.remove(b);

    }

    public String listBooks() {
        StringBuilder s = new StringBuilder();

        for (Book b : this.books) {
            s.append(b.getName() + "\n");
        }
        return s.toString();
    }
}
