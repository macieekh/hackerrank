package hr_20;


import java.util.Scanner;

public class Hr20 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Array is sorted in " + bubbleSort.sort(a) +" swaps");
        System.out.println("First Element: " + a[0]);
        System.out.println("First Element: " + a[n-1]);


    }

}
