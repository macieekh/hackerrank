package hr_19;

public class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
