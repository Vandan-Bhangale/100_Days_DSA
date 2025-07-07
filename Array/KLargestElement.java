package Array;

import java.util.PriorityQueue;

public class KLargestElement {
    public static int kLargestEle(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0;i<arr.length;i++) {
            minHeap.add(arr[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        int result = kLargestEle(arr, k);
        System.out.println("Kth largest element is: " + result);
    }
}
