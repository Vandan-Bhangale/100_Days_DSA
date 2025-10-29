package Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findDuplicate {

    public static List<Integer> duplicates(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue()>1) {
                list.add(e.getKey());
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,3,6,1};
        List<Integer> duplicates = duplicates(arr);

        for(int i = 0;i<duplicates.size();i++) {
            System.out.println(duplicates.get(i));
        }
    }
}
