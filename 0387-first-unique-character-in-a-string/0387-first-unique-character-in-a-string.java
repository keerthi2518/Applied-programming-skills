public class Solution {

    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // First pass: count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Second pass: find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "leetcode";

        System.out.println("Input: " + input);

        int result = solution.firstUniqChar(input);

        System.out.println("Index of first unique character: " + result);
    }
}
