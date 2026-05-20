class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        if (n == 0) return 0;

        int maxArea = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left boundaries
        left[0] = -1;
        for (int i = 1; i < n; i++) {
            int prev = i - 1;
            while (prev >= 0 && h[prev] >= h[i]) {
                prev = left[prev];
            }
            left[i] = prev;
        }

        // Fill right boundaries
        right[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            int prev = i + 1;
            while (prev < n && h[prev] >= h[i]) {
                prev = right[prev];
            }
            right[i] = prev;
        }

        // Compute max area
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, h[i] * width);
        }

        return maxArea;
    }
}
