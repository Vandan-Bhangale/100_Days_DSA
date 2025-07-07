package Array;

public class PairSum {
    public static boolean isPairSum(int[] arr,int target) {
        if(arr.length == 0 || arr.length == 1) {
            return false;
        }

        for(int i = 0;i<arr.length-1;i++) {
            for(int j = i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {11,15,6,8,9,0};
        int target = 16;
        System.out.println("Final answer is: " + isPairSum(arr, target));
    }
}
