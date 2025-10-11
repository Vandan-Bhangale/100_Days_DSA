package Sorting;

import java.util.Arrays;

public class CountTriplets {

    public static int countTriplet(int[] arr,int sum) {
        int n = arr.length;

        int ans = 0;

        Arrays.sort(arr);

        for(int i = 0;i<n-2;i++) {
            int j = i + 1;
            int k = n-1;

            while(j < k) {
                if(arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    ans += (k-j);
                    j++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-2,0,1,3};
        int sum = 2;

        int result = countTriplet(arr, sum);
        System.out.println(result);

    }
}
