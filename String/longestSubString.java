package String;

import java.util.HashSet;

public class longestSubString {
    public static int LongestSubString(String s) {
        int start = 0;
        int end = 0;
        int max_length = 0;
        HashSet<Character> set = new HashSet<>();

        while(end < s.length()) {
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length,set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Max length is: " + LongestSubString(s));
    }
}
