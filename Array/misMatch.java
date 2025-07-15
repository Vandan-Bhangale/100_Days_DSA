package Array;

import java.util.HashMap;

public class misMatch {

    static int[] result;

    public static int[] setMismatch(int[] arr) {
        int n = arr.length;
        int duplicate = -1;
        int missing = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i : arr) {
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }

        for(int i = 0;i<=n;i++) {
            if(!hm.containsKey(i)) {
                missing = i;
            } else if(hm.get(i) == 2) {
                duplicate = i;
            }
        }

        result = new int[] {duplicate,missing};
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] output = setMismatch(arr);

        for (int i : output) {
            System.out.println(i);
        }
    }
}
