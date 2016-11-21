package hr_16;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Hr16 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            try{
                System.out.println(parseInt(S));//parseInt(S);
            }
            catch (NumberFormatException e) {
                System.out.println("Bad String");
            }

        }

}
