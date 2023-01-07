package ArrayListPractice;


import java.util.Arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {12,14,1,5,4,18,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(maximumElement(arr));
//        System.out.println(maximumElementInRange(arr, 3, 5));
    }

    //imagine that array is not empty. This function will return the maximum element of the array.
    public static int maximumElement(int[] arr) {
        if(arr==null){
            return -1;
        }
        int maxNo = Integer.MIN_VALUE;
        for(int num:arr) {
            maxNo = Math.max(num,maxNo);
        }
        return maxNo;
    }

    //This function will return the maximum element of the array in b/w Range.
    public static int maximumElementInRange(int[] arr, int start, int end) {
        if(arr==null || end>start){
            return -1;
        }
        int maxNo = Integer.MIN_VALUE;
        for(int i=start; i<=end; i++) {
            maxNo = Math.max(arr[i],maxNo);
        }
        return maxNo;
    }

    public static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        Swap sa = new Swap();

        while (start<end) {
            sa.swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }

}
