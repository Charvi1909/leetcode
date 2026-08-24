class Solution {
    public String removeKdigits(String num, int k) {
        // If we are removing all digits, return "0"
        if (num.length() == k) {
            return "0";
        }
        
        StringBuilder stack = new StringBuilder();
        
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            
            // WHILE we have k left, the stack isn't empty, 
            // and the top of the stack is > current digit: Pop the top!
            while (stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1) > ch) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            
            // Push the current digit to the stack
            stack.append(ch);
        }
        
        // If we still have k left over (e.g., "12345"), remove from the end
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        
        // Remove leading zeros
        while (stack.length() > 1 && stack.charAt(0) == '0') {
            stack.deleteCharAt(0);
        }
        
        return stack.toString();
    }
}