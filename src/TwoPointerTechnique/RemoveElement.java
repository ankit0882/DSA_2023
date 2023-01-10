package TwoPointerTechnique;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,5};
        int target=3;
        int count = removeElement(arr,target);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }

    private static int removeElement(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=target){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
}
