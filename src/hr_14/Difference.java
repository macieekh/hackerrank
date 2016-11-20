package hr_14;


public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference (int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int maxDiff = 0;
        for (int i = 0; i < this.elements.length; i++) {
            for (int j = i+1; j < this.elements.length ; j++) {
                if (Math.abs(this.elements[i]-this.elements[j]) > maxDiff) {
                    maxDiff = Math.abs(this.elements[i]-this.elements[j]);
                }
            }
        }
        maximumDifference = maxDiff;

    }
}
