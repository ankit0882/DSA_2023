package BinarySearchAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {100,20,10,5,1};
        int target = 10;
        System.out.println(searchTheNo(arr,target));
    }
    static int searchTheNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[0]<=arr[arr.length-1];

        while(start<=end) {
            int mid = (start+end)/2;

            if(arr[mid]==target) {
                return mid;
            }

            if (isAsc) {
                if (target<arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if (target>arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
