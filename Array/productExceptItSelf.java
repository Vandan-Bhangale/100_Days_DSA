package Array;

import java.util.HashSet;

public class productExceptItSelf {

    public static int[] productOfArr(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for(int i = 1;i<n;i++) {
            answer[i] = answer[i-1] * nums[i - 1];
        }

        int rightProduct = 1;
        for(int i = n-1;i>=0;i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
    }
}