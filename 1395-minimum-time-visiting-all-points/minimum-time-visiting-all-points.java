class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
         int totalTime = 0;
      
        // Iterate through consecutive pairs of points
        for (int i = 1; i < points.length; i++) {
            int horizontalDistance = Math.abs(points[i][0] - points[i - 1][0]);
        
            int verticalDistance = Math.abs(points[i][1] - points[i - 1][1]);
          
            totalTime += Math.max(horizontalDistance, verticalDistance);
        }
      
        return totalTime;
        
    }
}