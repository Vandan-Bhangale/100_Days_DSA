package Array;
public class searchInRotatedArr {

    public static int searchElement(int[] arr,int target) {
        int n = arr.length;

        if(n == 0) return -1;

        for(int i = 0;i<n;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int result = searchElement(arr, target);
        System.out.println("Element found at: " + result);
    }
}