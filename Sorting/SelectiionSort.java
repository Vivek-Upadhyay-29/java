package Sorting;

public class SelectiionSort {
    public static void main(String[] args) {

        int arr[] = { 4, 8, 9, 2, 1 };

        // bubble sort

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
