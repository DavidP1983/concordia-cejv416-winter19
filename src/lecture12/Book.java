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
public class Book {

    private String name;
    private int ISBN;

    public Book(String name, int ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return "ISBN = " + this.ISBN + ", Name = " + this.name;

    }
    

    
    public boolean equals (Object obj) {

        if (obj instanceof Book) {

            Book b2 = (Book) obj;

            if (b2.name.equals(this.name) && b2.ISBN == this.ISBN) {

                return true;

            }
        }

        return false;
    }

}

