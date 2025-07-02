package Array;

import java.util.Arrays;

public class MedianOfArr {

    public static double MedianOfTwoSortedArr(int[] arr1,int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        double median = 0;

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

        Arrays.sort(arr);

            if(arr.length % 2 == 1) {
                median = arr[arr.length/2];
            } else {
               median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
            }
        
        return median;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        double result = MedianOfTwoSortedArr(arr1, arr2);
        System.out.println("The median of two sorted array is: " + result);

    }
}
