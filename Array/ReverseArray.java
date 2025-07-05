package Array;

public class ReverseArray {

    public static void reverseArr(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];

        for(int i = 0;i<n;i++) {
            reversedArr[i] = arr[n - i - 1];
        }

        for(int i = 0;i<n;i++) {
            arr[i] = reversedArr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArr(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
