public class Solution {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // better buying price
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.print("Prices: ");
        printArray(prices);

        int result = solution.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
