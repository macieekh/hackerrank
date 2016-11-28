package hr_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hr25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int[] numbers;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            numbers.add(scanner.nextInt());
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(prime(numbers.get(i)));
        }

    }

    public static String prime(Integer n) {
        double sqrt = Math.sqrt(n);
        boolean isPrime = true;
        for (double i = 2; i <= sqrt ; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            return "Prime";
        } else {
            return "Not prime";
        }


    }
}
