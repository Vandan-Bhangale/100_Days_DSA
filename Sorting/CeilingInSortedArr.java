package Sorting;

public class CeilingInSortedArr {

    public static int ceiling(int[] arr,int x) {
        int n = arr.length;

        for(int i = 0;i<n;i++) {
            if(arr[i] >= x) {
                return i;
            }
        }

        return -1; //No ceiling found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 0;

        int result = ceiling(arr, x);

        System.out.println(result);
    }
}