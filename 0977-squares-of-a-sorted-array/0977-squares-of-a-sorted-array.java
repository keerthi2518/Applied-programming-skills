import java.util.Arrays;

class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }

    // Main method (required to run in standard Java environment)
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sol.sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}
