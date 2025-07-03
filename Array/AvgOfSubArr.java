package Array;

public class AvgOfSubArr {
    public static double AverageOfSubArr(int[] arr,int k) {
        double windowAvg = 0;
        double maxAvg = 0;

        for(int i = 0;i<k;i++) {
            windowAvg = windowAvg + arr[i];
        }
        maxAvg = windowAvg/k;

        for(int i = k;i<arr.length;i++) {
            windowAvg = windowAvg + arr[i] - arr[i-k];
            maxAvg = Math.max(maxAvg,windowAvg/k);
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;

        double result = AverageOfSubArr(arr, k);
        System.out.println("Maximum average is: " + result);
    }
}
