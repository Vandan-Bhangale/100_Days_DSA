package String;

public class Anagram {

    public static boolean isAnagram(String s,String t) {
        if(t.length() < s.length()) return false;

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c-'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c-'a']--;
            if(count[c-'a'] < 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "ngaram";

        System.out.println(isAnagram(s, t));
    }
}
