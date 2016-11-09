package hr_05;

import java.util.Scanner;

public class Hr05 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean notValidN = true;
        int n = 0;
        while (notValidN) {
            n = input.nextInt();
            if (n>=2 && n<= 20) {
                for (int i = 1; i < 11; i++) {
                    System.out.println(n + " x " + i + " = " + n*i);
                    notValidN = false;
                }
            }
        }

    }
}
