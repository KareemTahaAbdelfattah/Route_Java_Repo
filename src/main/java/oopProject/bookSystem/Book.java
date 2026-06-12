package oopProject.bookSystem;

public class Book extends BookList implements Product{
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    private double price;
    private String name;
    private String author;
    private int id;
    private String description;
    private int creationYear;

    public Book(double price, String name, String author, int id, int creationYear) {
        this.price = price;
        this.name = name;
        this.author = author;
        this.id = id;
        this.creationYear = creationYear;

        if(creationYear >= 1988){
            System.out.println("Book price is " + bookPrice() + ", name is " + bookName() + ", author is " + bookAuthor() + " and id is " + bookID() + " and creation year is " + creationYear());
        }else{
            System.out.println("Book before 1988 isn't available");
        }
    }

    public Book(double price, String name, String author, int id, String description) {
        this.price = price;
        this.name = name;
        this.author = author;
        this.id = id;
        this.description = description;
        System.out.println("Book price is " + bookPrice() + ", name is " + bookName() + ", author is " + bookAuthor() + " and id is " + bookID() + " and description is " + bookDescription());

    }

    public void priceCategory(){
        System.out.println("Available books for this price is: " + bookFiltration(price));
    }

    @Override
    public double bookPrice() {
        return price;
    }

    @Override
    public String bookName() {
        return name;
    }

    @Override
    public int bookID() {
        return id;
    }

    @Override
    public String bookAuthor() {
        return author;
    }

    @Override
    public String bookDescription() {
        return description;
    }

    @Override
    public int creationYear() {
        return creationYear;
    }
}
