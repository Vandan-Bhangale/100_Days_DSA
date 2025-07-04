package Array;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) return 0;
        int i = 0;
        for(int j = 1;j<arr.length;j++) {
            if(arr[j] != arr[i]) 
            i++;
            arr[i] = arr[j];
        }

        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int result = removeDuplicates(arr);
        System.out.println("Unique elements are: " + result);
    }
}
