package BinarySearchAlgo;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,18,20,50,100};
        int target = 18;

        System.out.println(searchTheNo(arr,target));
    }

    static int searchTheNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==target) {
                return mid;
            } else if (target<arr[mid]) {
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
        }
        return -1;
    }
}
