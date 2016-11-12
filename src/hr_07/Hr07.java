package hr_07;

import java.util.Scanner;

public class Hr07
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        backward(arr);
    }

    public static void backward(int[] arg) {
            for (int i = arg.length-1; i >=0 ; i--) {
            System.out.print(arg[i] + " ");
        }
    }

}
