package String;

public class LenghtofLastWo {
    public static int lengthOfLastWord(String str) {
        String[] words = str.split(" ");
        String lastWord = words[words.length-1];
        int count = 0;
        int i = 0;
        int n = lastWord.length();

        while(i < n) {
            count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        int result = lengthOfLastWord(str);
        System.out.println("Length of last word is: " + result);
    }
}
