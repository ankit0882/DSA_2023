package TwoPointerTechnique;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int count = removeElement(arr);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

    }
    private static int removeElement(int[] arr) {
        int count=2;

        for (int i = 2; i < arr.length; i++) {
            if(arr[i]!=arr[count-2]) {
                arr[count++]=arr[i];
            }
        }
        return count;
    }
}
//not completed
