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
public class Book {
   
    private String name = " ";
    private int edition = 0;
    private int pages = 0;
    
    
    public Book() {};
    
    public Book(String name, int edition, int pages)
    {
    
    this.name = name;
    this.edition = edition;
    this.pages = pages;
    }
    
    
    public String getName()
    {
    return this.name;
        
    }
    
    
    public void setName (String name)
    {
    this.name = name;
        
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    
    public String getBookInformation()
    {
    
        
        return "Name:" +this.name + ", Ed:" + this.edition + ", pages:" + this.pages;
    }
   
    
    public double getBookCopyPrice (int numCopies)
    {
    double price = (double)this.pages* 0.01*numCopies;
    return price;
    }
    
}
