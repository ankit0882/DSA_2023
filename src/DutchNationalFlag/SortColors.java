package DutchNationalFlag;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {1,0,0};
        sortcolors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortcolors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high) {
            if(arr[mid]==0) {
                swap(arr,low,mid);
                mid++;
                low++;
            } else if(arr[mid]==2) {
                swap(arr,high,mid);
                //mid++;
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
