package TwoPointerTechnique;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumForSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(findTheTwoSumIndex(arr,target)));
    }

    private static int[] findTheTwoSumIndex(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (numbers[start] + numbers[end] != target) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{start + 1, end + 1};
    }
}
