package Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++) {
           if(set.contains(arr[i])) {
            return true;
           }
           set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
