package hr_13;

import java.util.Scanner;

public class Hr13 {
        public static void main(String []args) {
            Scanner sc=new Scanner(System.in);
            String title=sc.nextLine();
            String author=sc.nextLine();
            int price=sc.nextInt();
            Book new_novel=new MyBook(title,author,price);
            new_novel.display();

        }

        abstract class Book {
            String title;
            String author;
            Book(String t,String a){
                title=t;
                author=a;
            }

            abstract void display();
        }

        static class MyBook extends Book {
            public String title;
            public String author;
            public int price;
            MyBook (String title, String author) {
                super(title, author);
            }
            MyBook (String title, String author, int price) {
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
}
