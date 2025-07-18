package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequentEvenElement {

    public static int frequentEvenElement(int[] arr) {
        if (arr.length == 0) return -1;

    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int num : arr) {
        if (num % 2 == 0) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
    }

    if (freq.isEmpty()) return -1;

    int maxFreq = 0;
    int result = Integer.MAX_VALUE;

    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        int num = entry.getKey();
        int count = entry.getValue();

        if (count > maxFreq || (count == maxFreq && num < result)) {
            maxFreq = count;
            result = num;
        }
    }

    return result;
    }
    public static void main(String[] args) {
        int[] arr = {10000};
        int result = frequentEvenElement(arr);
        System.out.println(result);
    }
}
