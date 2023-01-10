package TwoPointerTechnique;

import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-5,-3,-2,-1, 0, 1, 2};
        System.out.println(Arrays.toString(squareTheArray(arr)));
    }

    private static int[] squareTheArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int count = end;
        int[] sortedArr = new int[arr.length];

        while(start<end) {
            int first = arr[start]*arr[start];
            int last = arr[end]*arr[end];

            if(first>last) {
                sortedArr[count]=first;
                 start++;
            } else {
                sortedArr[count]=last;
                end--;
            }
            count--;
        }

        return sortedArr;

    }


}
