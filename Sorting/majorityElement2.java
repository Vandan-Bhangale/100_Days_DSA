package Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class majorityElement2 {
    public static ArrayList<Integer> majorElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0;i<n;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()>n/3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        ArrayList<Integer> result = majorElement(nums);
        System.out.println(result);
    }
}
