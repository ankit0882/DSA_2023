package SlidingWindow;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int s = 15;

        System.out.println(subarraySum(nums, nums.length, s));


    }
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int i = 0, j = 0;
        int sum = 0 ;
        ArrayList<Integer> res = new ArrayList<>();

        while(j<n && i<n) {
            sum = sum + arr[j];
            if(sum<s){
                j++;
            } else if (sum>s) {
                sum = sum - arr[i];
                i++;
                if (sum == s) {
                    res.add(i + 1);
                    res.add(j + 1);
                    return res;
                }
            } else {
                res.add(i+1);
                res.add(j+1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}

//it will not pass for all the test cases
