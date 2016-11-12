package hr_06;

import java.util.Scanner;

public class Hr06 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] inputArray = new String[n];
        for (int i = 0; i < n ; i++) {
            inputArray[i] = input.next();
            System.out.println(inputArray[i]);
        }
        for (int i = 0; i < n ; i++) {
            String temp = inputArray[i];
            char[] tempCharArray = temp.toCharArray();

            printEvenOrOdd(0, tempCharArray);
            printEvenOrOdd(1, tempCharArray);
            System.out.println("");

        }
    }
    public static void printEvenOrOdd(int a, char[] tempCharArray) {

        for(int x = a; x < tempCharArray.length; x += 2){
                System.out.print(tempCharArray[x]);
        }
        System.out.print(" ");
    }
}
