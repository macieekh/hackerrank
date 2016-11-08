package hr_00;

import java.util.Scanner;

public class Hr00 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        Output output = new Output();
        System.out.println(output.print(input));
    }
}
