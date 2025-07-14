package Array;

public class MergeArr {
    public static void mergeArr(int[] nums1,int m,int[] nums2,int n) {
        int i = m - 1;         // Pointer for nums1
        int j = n - 1;         // Pointer for nums2
        int k = m + n - 1;     // Pointer for the end of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 is not exhausted
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;

        mergeArr(arr1, m, arr2, n);
    }
   
}
