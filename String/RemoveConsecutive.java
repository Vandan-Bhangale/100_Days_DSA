package String;

public class RemoveConsecutive {
    public static String removeConsecutive(String s) {
        int n = s.length();
        String str = "";
        for(int i = 0;i<n-1;i++) {
            if(s.charAt(i) != s.charAt(i+1)) {
                str += s.charAt(i);
            }
        }
        str += s.charAt(n-1);
        return str;
    }
    public static void main(String[] args) {
        String str = "abcddcba";
        System.out.println(removeConsecutive(str));
    }
}
