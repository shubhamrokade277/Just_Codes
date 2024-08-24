class Solution {
    int isdivisible7(String num) {
        int remainder = 0;

        // Process each digit in the string
        for (int i = 0; i < num.length(); i++) {
            // Extract digit as integer
            int digit = num.charAt(i) - '0';
            
            // Update the remainder
            remainder = (remainder * 10 + digit) % 7;
        }

        // Check if the final remainder is 0
        return remainder == 0 ? 1 : 0;
    }
}