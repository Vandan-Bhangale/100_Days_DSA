package Array;

import java.util.HashMap;

public class contiguousArr {
    public static int maxContiguousArr(int[] arr) {

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == 0) {
                arr[i] = -1;
            }
        }

        int sum = 0;
        int maxLength = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0;i<arr.length;i++) {
            sum += arr[i];

            if(map.containsKey(sum)) {
                int last = map.get(sum);
                maxLength = Math.max(maxLength,i-last);
            } else {
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,0,0,0};
        int result = maxContiguousArr(arr);
        System.out.println(result);
    }
}
