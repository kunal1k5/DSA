class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int arrayLength = words.length;
        int minDistance = arrayLength; // Initialize with maximum possible distance
      
        // Iterate through each word in the array
        for (int currentIndex = 0; currentIndex < arrayLength; ++currentIndex) {
            String currentWord = words[currentIndex];
          
            // Check if current word matches the target
            if (currentWord.equals(target)) {
                // Calculate direct distance from startIndex to currentIndex
                int directDistance = Math.abs(currentIndex - startIndex);
              
                // Calculate wrap-around distance (going the opposite direction in circular array)
                int wrapAroundDistance = arrayLength - directDistance;
              
                // Choose the minimum between direct and wrap-around distance
                int shortestPath = Math.min(directDistance, wrapAroundDistance);
              
                // Update the overall minimum distance
                minDistance = Math.min(minDistance, shortestPath);
            }
        }
      
        // If minDistance hasn't changed from initial value, target wasn't found
        return minDistance == arrayLength ? -1 : minDistance;
    }
}