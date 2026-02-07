import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        
        int n = prices.length;
        int[] answer = Arrays.copyOf(prices, n);
        
        Stack<Integer> stack = new Stack<>(); // store indexes
        
        for (int i = 0; i < n; i++) {
            
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                
                int prevIndex = stack.pop();
                answer[prevIndex] = prices[prevIndex] - prices[i];
            }
            
            stack.push(i);
        }
        
        return answer;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] prices = {8,4,6,2,3};
        
        int[] result = sol.finalPrices(prices);
        
        System.out.println(Arrays.toString(result));
    }
}
