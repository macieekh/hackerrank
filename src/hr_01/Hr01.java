package hr_01;

import java.util.Scanner;

public class Hr01 {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String str = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();
        double d1 = scan.nextDouble();
        scan.nextLine();
        String str1 = scan.nextLine();

        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(str.concat(str1));

    }
}
