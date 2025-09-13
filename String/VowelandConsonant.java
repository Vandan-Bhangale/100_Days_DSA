package String;

import java.util.HashMap;

public class VowelandConsonant {
    public int maxFreqSum(String s) {

        //Only leetcode function is here

        int n = s.length();
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> consonant  = new HashMap<>();

        String vowels = "aeiou";

        for(char ch : s.toCharArray()) {
            if(vowels.indexOf(ch) != -1) {
                vowel.put(ch,vowel.getOrDefault(ch,0) + 1);
            } else {
                consonant.put(ch,consonant.getOrDefault(ch,0) + 1);
            }
        }

        int vowelMaxFreq = 0;
        for(int freq: vowel.values()) {
            if(freq > vowelMaxFreq) {
                vowelMaxFreq = freq;
            }
        }
        int consonantMaxFreq = 0;
        for(int freq: consonant.values()) {
            if(freq > consonantMaxFreq) {
                consonantMaxFreq = freq;
            }
        }
        return (vowelMaxFreq + consonantMaxFreq);
    }
    public static void main(String[] args) {
        
    }
}
