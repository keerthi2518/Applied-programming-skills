import java.util.Stack;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println("Input:");
        printArray(temperatures);

        int[] result = solution.dailyTemperatures(temperatures);

        System.out.println("Output:");
        printArray(result);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
