package Array;

public class MaxAndMin {
    public static void MaxandMin(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for(int i = 1;i<n;i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
    }
    public static void main(String[] args) {
        int[] arr = {22, 14, 8, 17, 35, 3};
        MaxandMin(arr);
    }
}
