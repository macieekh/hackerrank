package hr_13;

public class MyBook extends Book {
     public int price;

    public MyBook (String title, String author, int price) {
        super(title, author);
        this.price = price;
    }


    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}