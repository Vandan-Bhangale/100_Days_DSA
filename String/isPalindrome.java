package String;

public class isPalindrome {
    public static boolean checkPalindrome(String s) {

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = str.length()-1;

        while (i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str));
    }
}
