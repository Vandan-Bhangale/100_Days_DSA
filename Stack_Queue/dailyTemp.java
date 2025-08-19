package Stack_Queue;

import java.util.Stack;

public class dailyTemp {

    public static int[] dailyTemperature(int[] temp) {
        int n = temp.length;
        int[] answer = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<n;i++) {
            while(!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int prevIndex = st.pop();
                answer[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};

        int[] result = dailyTemperature(temp);

        for(int i = 0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
