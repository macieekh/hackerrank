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

            for(int x = 0; x < tempCharArray.length; x++){
                if ((x % 2) == 0) {
                    System.out.print(tempCharArray[x]);
                }
            }
            System.out.print(" ");
            for(int x = 0; x < tempCharArray.length; x++){
                if ((x % 2) != 0) {
                    System.out.print(tempCharArray[x]);
                }
            }
            System.out.println(" ");
        }



    }
}
