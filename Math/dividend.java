package Math;

public class dividend {

    public static int divide(int dividend,int divisor) {
        int result = 1;

        if(dividend < 0 && divisor < 0) {
            result = (int) Math.abs(Math.floor(dividend/divisor));
        } else {
            result =(int) Math.floor(dividend/divisor);
        }
        return result;
    }
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 1;
        System.out.println("Final answer is: " + divide(dividend, divisor));
    }
}
