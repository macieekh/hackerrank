package hr_11;

import java.util.Scanner;

public class Hr11 {
    public static final int ROWS = 6;
    public static final int COLS = 6;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int max = 0;
        int arr[][] = new int[ROWS][COLS];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for ( int i = 0; i < ROWS-2; i++) {
            for (int j = 0; j < COLS-2; j++) {
                if (hourGlassSum(i,j,arr) > max){
                    max = hourGlassSum(i,j,arr);
                }
            }
        }
        System.out.println(max);

    }

    public static int hourGlassSum(int r, int c, int arr[][]) {
        int sum = 0;
        for (int i = r; i < r + 3; i++) {
            if (i == r + 1) {
                sum = sum + arr[i][c + 1];
            } else {
                sum = sum + arr[i][c] + arr[i][c + 1] + arr[i][c + 2];
            }
        }
        return sum;
    }
}
