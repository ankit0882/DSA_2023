package SlidingWindow;

//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class MaxSumSubArrayOfKSize {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSumSubArray(arr,k));

    }
    public static int maxSumSubArray(int[] nums, int k) {
        int j = 0;
        int i = 0;
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        while(j<nums.length){
            sum = sum + nums[j];
            if(j-i+1<k){
                j++;
            } else if(j-i+1==k){
                maximum = Math.max(sum,maximum);
                sum = sum + nums[i];
                i++;
                j++;
            }
        }
        return maximum;
    }
}
