package Array;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1;i>=0;i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] result = plusOne(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
