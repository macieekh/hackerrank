//FILENAME Hr13.Java

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

}
