package hr_26;

import java.util.Scanner;

/**
 * Created by Maciek on 2016-11-29.
 */
public class Hr26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int d0 = scanner.nextInt();
        int m0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        int sum = 0;

        if (y1 != y0 ) {
          sum = (y1-y0)*365;
        }
        if (m1 != m0) {
            sum = sum + (m1-m0)*30;
        }
        if (d1 != d0) {
            sum = sum + (d1-d0);
        }

        System.out.println(sum*15);

    }


}
