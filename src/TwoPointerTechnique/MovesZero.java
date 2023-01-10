package TwoPointerTechnique;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MovesZero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeros(int[] nums) {
        int start = 0;
        int end = 0;

        for(start=0;start<nums.length;start++) {
            if(nums[start]!=0){
                nums[end]=nums[start];
                end++;
            }
        }

        for(;end<nums.length;end++){
            nums[end]=0;
        }
    }
}
