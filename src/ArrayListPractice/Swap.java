package ArrayListPractice;

import java.util.Arrays;

//Q-> swap two value in the array;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,23,29,5,6,7};
//        swap(arr,1,2);
        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap (int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] =temp;
    }
}
