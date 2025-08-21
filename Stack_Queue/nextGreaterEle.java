package Stack_Queue;

public class nextGreaterEle {

    public static int[] nextGreater(int[] nums1,int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] answer = new int[n];

        for(int i = 0;i<n;i++) {
            int index = -1;
            for(int j = 0;j<m;j++) {
                if(nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }

            int nextGreater = -1;
            for(int k = index + 1;k<m;k++) {
                if(nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            answer[i] = nextGreater;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,2,3,4};

        int[] result = nextGreater(nums1, nums2);

        for(int i = 0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
