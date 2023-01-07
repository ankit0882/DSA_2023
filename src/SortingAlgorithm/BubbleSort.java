package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1,7,-32,0,89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubble(int[] arr) {
        boolean swap=false; //check when we sorted array as the input;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
