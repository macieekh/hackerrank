package hr_10;


import java.util.Scanner;

public class Hr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String bintemp = Integer.toBinaryString(n);
        char[] bin = bintemp.toCharArray();

        System.out.println(consec(bin));

    }

    public static int consec(char[] bin) {
        boolean nextOne = true;
        int count = 1;
        for (int i = 0; i < bin.length-1 ; i++) {
            if (nextOne) {
                if ((bin[i] == '1') && (bin[i]==bin[i+1])) {
                    count++;
                }
                else
                {
                    nextOne = false;
                }
            }
            else
            {
                break;
            }
        }
        return count;


    }
}
