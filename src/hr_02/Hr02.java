package hr_02;

import java.util.Scanner;

public class Hr02 {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String str = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();
        double d1 = scan.nextDouble();
        String str1 = scan.next();

        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(str+str1);

    }
}