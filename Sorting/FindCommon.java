package Sorting;

import java.util.Arrays;

public class FindCommon {
    public static int[] commonElement(int[] arr1,int[] arr2,int[] arr3) {
        // int minLength = Math.min(arr1.length,Math.min(arr2.length,arr3.length));
        int[] commonEle = new int[arr1.length];

        for(int i = 0;i<arr1.length;i++) {
            for(int j = 0;j<arr2.length;j++) {
                for(int k = 0;k<arr3.length;k++) {
                    if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        commonEle[i] = arr1[i];
                    }
                }
            }
        }
        return commonEle;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,5,10,15,20};
        int[] arr2 = {5, 13, 15, 20};
        int[] arr3 = {5,20};

        int[] result = commonElement(arr1, arr2, arr3);

        // Print the result
        System.out.println("Common elements: " + Arrays.toString(result));
    }
    
}
