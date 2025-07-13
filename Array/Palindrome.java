package Array;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        if(x<0) return false;

        int reversedNumber = 0;
        int originalNumber = x;

        while (x != 0) {
            int lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            x /= 10;
        }

        return reversedNumber == originalNumber;
    }
    public static void main(String[] args) {
        int x = 1;

        System.out.println("Result is: " + isPalindrome(x));
    }
}
