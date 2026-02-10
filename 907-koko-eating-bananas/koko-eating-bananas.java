class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid;  // try smaller speed
            } else {
                left = mid + 1;  // need faster speed
            }
        }
        return left;
    }

    // Helper: find maximum pile
    private int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    // Helper: check if Koko can eat all bananas at speed k within h hours
    private boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            // ceil(pile / k) = (pile - 1) / k + 1
            hours += (pile - 1) / k + 1;
        }
        return hours <= h;
    }
}