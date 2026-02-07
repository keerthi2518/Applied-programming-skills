public class Solution {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before:");
        printArray(s);

        solution.reverseString(s);

        System.out.println("After:");
        printArray(s);
    }

    private static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
