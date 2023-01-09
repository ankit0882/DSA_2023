package SortingAlgorithm;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,4,6};
        int m = nums1.length;
        int n =nums2.length;
        int[] ans = new int[m+n];
        ans = merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] comb = new int[m + n];
        while (k < m + n) {
            if (i == m) {
                comb[k++] = nums2[j++];
                continue;
            } else if (j == n) {
                comb[k++] = nums1[i++];
                continue;
            }
            if (nums1[i] < nums2[j]) {
                comb[k++] = nums1[i++];
            } else {
                comb[k++] = nums2[j++];
            }
        }
        return comb;

    }
}
