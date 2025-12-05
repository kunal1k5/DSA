class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 1. Let's keep track of how many flowers we've planted 🌸
        int planted = 0;

        // 2. Let's stroll through the flowerbed, checking each spot
        for (int i = 0; i < flowerbed.length; i++) {
            // 3. Is this spot empty? 🤔 If not, we skip to the next one
            if (flowerbed[i] == 0) {

                // 4. Check if the left neighbor is empty or if we're at the beginning
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);

                // 5. Check if the right neighbor is empty or if we're at the end
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // 6. If both neighbors are empty (or don't exist), we can plant! 🥳
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant the flower! 🌼
                    planted++;          // Update the count

                    // 7. Have we planted enough flowers? If so, we're done! 🎉
                    if (planted >= n) {
                        return true; // Yes, we can plant all flowers
                    }
                }
            }
        }
        // 8. If we get here, we couldn't plant all the flowers 😞
        return planted >= n; // Can we plant all flowers? If yes return true else false.
    }
}