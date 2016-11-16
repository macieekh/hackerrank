//filename MyBook.java

package hr_13;

public class MyBook extends Book {
    public String title;
    public String author;
    public int price;


    public MyBook (String title, String author, int price) {
        super(title, author);
        this.title = title;
        this.author = author;
        this.price = price;
    }


    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}