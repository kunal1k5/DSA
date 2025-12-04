/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    /**
     * Finds the target number using binary search.
     * The search space is from 1 to n (inclusive).
     * 
     * @param n The upper bound of the search range
     * @return The target number that was picked
     */
    public int guessNumber(int n) {
        // Initialize binary search boundaries
        // left: lower bound (inclusive)
        // right: upper bound (inclusive)
        int left = 1;
        int right = n;
      
        // Continue searching while the search space has more than one element
        while (left < right) {
            // Calculate the middle point using unsigned right shift to avoid overflow
            // This is equivalent to (left + right) / 2 but prevents integer overflow
            int mid = (left + right) >>> 1;
          
            // Check if mid is the target or adjust search boundaries
            int guessResult = guess(mid);
          
            if (guessResult <= 0) {
                // If guess returns -1: mid is lower than target (but this moves right boundary)
                // If guess returns 0: mid is the target (include mid in search space)
                // Move right boundary to mid (keep mid in search space)
                right = mid;
            } else {
                // If guess returns 1: mid is higher than target
                // Target must be in the upper half, exclude mid from search space
                left = mid + 1;
            }
        }
      
        // When left == right, we've found the target
        return left;
    }
}