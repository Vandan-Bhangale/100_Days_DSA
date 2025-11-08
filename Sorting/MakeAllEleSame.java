package Sorting;

public class MakeAllEleSame {

    public static int minimumCostToMakeSame(int[] arr) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++) {
            int currentCost = 0;

            for(int j = 0;j<n;j++) {
                currentCost += Math.abs(arr[j] - arr[i]);
            }

            ans = Math.min(ans,currentCost);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,100,101};

        int result = minimumCostToMakeSame(arr);

        System.out.println(result);
    }
}
