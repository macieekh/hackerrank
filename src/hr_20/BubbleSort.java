package hr_20;


public class BubbleSort {

    public int sort(int[] arr) {
        int numberOfSwaps = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    numberOfSwaps++;
                }

            }
        }
    return numberOfSwaps;
    }

    public void swap (int[] arr, int j, int j1) {
        int temp = arr[j];
        arr[j] = arr[j1] ;
        arr[j1] = temp;
    }
    public void printeMessage() {}


}
