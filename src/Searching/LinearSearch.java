package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i=0; i<8;i++){
            arr[i] = in.nextInt();
        }
        System.out.println();
        int target = in.nextInt();// Number to be search.

        boolean flag = findThenNO(arr, target);
        System.out.println(flag);
    }

    private static boolean findThenNO(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for(int element:arr) {
             if(element == target) {
                 return true;
             }
        }
        return false;
    }

}

// Time complexity will be o(n).
