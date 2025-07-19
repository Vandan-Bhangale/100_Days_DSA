package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;

        if(n == 0) return -1;
        if(n == 1) return arr[0];

        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i = 0;i<n;i++) {
            hs.put(arr[i], hs.getOrDefault(arr[i], 0)+1);
        }

        int majorEle = 0;

        for(Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if(entry.getValue() > n/2) {
                majorEle = entry.getKey();
            }
        }

        return majorEle;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        System.out.println(result);
    }
}
