package ArrayAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//https://leetcode.com/problems/number-of-good-pairs/
public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if(nums[i]==nums[j]) count++;
        //     }
        // }
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++) {
            freq[nums[i]]++;
        }

        int count=0;
        for(int element : freq) {
            count = count + (element*(element-1))/2;

        }
        return count;
    }
}
