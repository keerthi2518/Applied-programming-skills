class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        // First pass: remove extra ')'
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
                sb.append(ch);
            } 
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                    sb.append(ch);
                }
            } 
            else {
                sb.append(ch); // lowercase letter
            }
        }

        // Second pass: remove extra '(' from right to left
        StringBuilder result = new StringBuilder();
        int close = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);

            if (ch == ')') {
                close++;
                result.append(ch);
            } 
            else if (ch == '(') {
                if (close > 0) {
                    close--;
                    result.append(ch);
                }
            } 
            else {
                result.append(ch);
            }
        }

        return result.reverse().toString();
    }
}
