package Array;

public class FindMinimum {

    public static int minimum(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[right]) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int Result = minimum(arr);
        System.out.println("Minimum value is: " + Result);
    }
}
