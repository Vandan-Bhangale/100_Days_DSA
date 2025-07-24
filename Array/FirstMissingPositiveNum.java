package Array;

public class FirstMissingPositiveNum {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Place nums[i] in its correct position if possible
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find the first index where index+1 != value
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        int result = firstMissingPositive(arr);
        System.out.println("The first missing positive number is: " + result);
    }
}
