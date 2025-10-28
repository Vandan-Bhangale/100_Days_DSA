package Array;

public class DivisbleByK {

    public static int LongestSubArr(int[] arr,int k) {
        int n = arr.length;
        int res = 0;

        for(int i = 0;i<n;i++) {
            int sum = 0;
            for(int j = i;j<n;j++) {
                sum = (sum + arr[j]) % k;

                if(sum == 0) {
                    res = Math.max(res,j - i +1);
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;

        int result = LongestSubArr(arr, k);
        System.out.println(result);
    }
}
