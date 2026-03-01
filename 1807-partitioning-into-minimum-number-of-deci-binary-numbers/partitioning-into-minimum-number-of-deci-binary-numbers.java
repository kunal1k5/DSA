class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
      
        // Iterate through each character in the string
        for (int i = 0; i < n.length(); i++) {
            // Convert character to its numeric value
            int currentDigit = n.charAt(i) - '0';
          
            // Update the maximum digit if current digit is larger
            maxDigit = Math.max(maxDigit, currentDigit);
        }
      
        // Return the maximum digit as the minimum number of partitions
        return maxDigit;
    }
}