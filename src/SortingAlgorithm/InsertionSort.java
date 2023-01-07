package SortingAlgorithm;

import java.util.Arrays;

//space complexity o(1)
//time complexity o(n2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-1,7,-32,0,89};
        inserationSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void inserationSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
