package hr_03;


import java.util.Scanner;

public class Hr03 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double mealCost = scan.nextDouble();
            int tipPercent = scan.nextInt();
            int taxPercent = scan.nextInt();
            scan.close();

            double tip = mealCost * (double) tipPercent/100;
            double tax = mealCost * (double) taxPercent/100;
            int totalCost = (int) Math.round(mealCost+tip+tax);

            System.out.println(totalCost);
        }
}



